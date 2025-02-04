/* Generated By:JJTree: Do not edit this line. ASTDotExpression.java Version 4.3 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=false,TRACK_TOKENS=false,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
import java.util.ArrayList;

public class ASTDotExpression extends SimpleNode implements Typed {
  private VariableType type;

  public ASTDotExpression(int id) {
    super(id);
  }

  public ASTDotExpression(JMMParser p, int id) {
    super(p, id);
  }

  @Override
  public String getNodeName() {
    return ".";
  }

  @Override
  public VariableType getType() {
    return type;
  }

  @Override
  protected void applySemanticAnalysis() throws SemanticError {
    Node lhs_raw = children[0];

    if (!(lhs_raw instanceof ASTIdentifier || 
          lhs_raw instanceof ASTNewExpression || 
          lhs_raw instanceof ASTThis || 
          lhs_raw instanceof ASTDotExpression)) {
      throw new SemanticError(this.line, "Left hand side of dot operator is neither an Identifier, new Expression, 'this' nor a method call!");
    }

    VariableType lhs = ((Typed) lhs_raw).getType();
    if (lhs.isIgnored()) {
      this.type = new VariableType(VariableType.ignored_type);
      return;
    }

    if (children[1] instanceof ASTLength) {
      if (lhs.isIntArray()) {
        this.type = new VariableType("int");
        return;
      } else {
        throw new SemanticError(this.line, String.format("Calling .length on a non-array expression (found %s).", lhs));
      }
    }

    if (!lhs.isIdentifier()) {
      throw new SemanticError(this.line, String.format("Method call on a non class instance (found %s).", lhs));
    }
    if (!lhs.equals(JMMParser.class_type)) {
      // The type of the left-hand side is not of a know class, assumming that it's correct
      this.type = new VariableType(VariableType.ignored_type);
      return;
    }

    // Verifying the method via name and arguments
    ASTMethodCall method_call = (ASTMethodCall) children[1];
    int n_args = method_call.jjtGetNumChildren();
    ArrayList<VariableType> arg_types = new ArrayList<>();
    for (int i = 0; i < n_args; ++i) {
      arg_types.add(((Typed) method_call.jjtGetChild(i)).getType());
    }
    final String method_id = SymbolTableScopes.calculateMethodIdentifier(new VariableIdentifier(method_call.getIdentifier()), arg_types.toArray(new VariableType[0]));

    final Method m = SymbolTableScopes.getInstance().isMethodDeclared(method_id);

    if (m == null) {
      // Cannot throw the error because the verified class might be extending another one where the method is declared, assume it's correct
      // throw new SemanticError(this.line, String.format("Method with signature '%s' not found!", method_id));
      this.type = new VariableType(VariableType.ignored_type);
      return; 
    }

    this.type = m.getReturn();
  }

  @Override
  protected void calculateStackImpact() {
    if (children[1] instanceof ASTLength) {
      return;
    }


    VariableType lhs_vt = ((Typed) children[0]).getType();
    
    if (lhs_vt.isIgnored()) {
      // static method invocation

      

      ASTMethodCall method_call = (ASTMethodCall) children[1];
      int n_args = method_call.jjtGetNumChildren();
      // Using the arguments from the stack
      MethodStackSizeScopes.getInstance().getMethodScope(this.scope_identifier).impactStack(-n_args);

      // Inferring the return type from the parent node
      Node parent = this.jjtGetParent();
      if (!assumeReturnTypeFromParentNode(parent).equals("V")) {
        // If the inferred return type is not void, then impact the stack by 1 (the return result)
        MethodStackSizeScopes.getInstance().getMethodScope(this.scope_identifier).impactStack(1);
      }
    } else if (lhs_vt.isIdentifier()) {
      // Removing the instance from the stack (non-static)
      MethodStackSizeScopes.getInstance().getMethodScope(this.scope_identifier).impactStack(-1);
      
      // non-static method invocation
      ASTMethodCall method_call = (ASTMethodCall) children[1];
      String method_name = method_call.getIdentifier();
      
      // Method signature

      int n_args = method_call.jjtGetNumChildren();
      ArrayList<VariableType> arg_types = new ArrayList<>();
      for (int i = 0; i < n_args; ++i) {
        VariableType arg_type = ((Typed) method_call.jjtGetChild(i)).getType();
        arg_types.add(arg_type);
      }

      // Using the arguments from the stack
      MethodStackSizeScopes.getInstance().getMethodScope(this.scope_identifier).impactStack(-n_args);

      final String method_id = SymbolTableScopes.calculateMethodIdentifier(new VariableIdentifier(method_name), arg_types.toArray(new VariableType[0]));
      final Method m = SymbolTableScopes.getInstance().isMethodDeclared(method_id);
      if (m == null) {
        // non-declared instance methods (instance methods of other classes)

        // Inferring the return type from the parent node
        Node parent = this.jjtGetParent();
        if (!assumeReturnTypeFromParentNode(parent).equals("V")) {
          // If the inferred return type is not void, then impact the stack by 1 (the return result)
          MethodStackSizeScopes.getInstance().getMethodScope(this.scope_identifier).impactStack(1);
        }
      } else {
        // The methods declared in Java-- cannot be void (so they always impact the stack by 1)
        MethodStackSizeScopes.getInstance().getMethodScope(this.scope_identifier).impactStack(1);

        Node parent = this.jjtGetParent();
        if (parent instanceof ASTMethodDeclaration || parent instanceof ASTWhileBody || parent instanceof ASTIfBody || parent instanceof ASTElseBody) {
          // sb.append("\tpop\n");
          MethodStackSizeScopes.getInstance().getMethodScope(this.scope_identifier).impactStack(-1);
        }
      }
    }

  }
  
  @Override
  protected void generateCodeNodeClose(StringBuilder sb) {
    if (children[1] instanceof ASTLength) {
      return;
    }

    // invokevirtual - non static
    // invokestatic - static
    
    VariableType lhs_vt = ((Typed) children[0]).getType();
    
    if (lhs_vt.isIgnored()) {
      // static method invocation
      ASTMethodCall method_call = (ASTMethodCall) children[1];
      String method_name = method_call.getIdentifier();
      sb.append("\tinvokestatic ").append(lhs_vt.getReferencedClass())
        .append("/").append(method_name);
        
      // Method signature
      sb.append("(");

      // Getting argument types from the passed arguments' types
      int n_args = method_call.jjtGetNumChildren();
      for (int i = 0; i < n_args; ++i) {
        sb.append(((Typed) method_call.jjtGetChild(i)).getType().toJasminType());
      }

      sb.append(")");

      // Inferring the return type from the parent node
      Node parent = this.jjtGetParent();
      sb.append(assumeReturnTypeFromParentNode(parent));
      sb.append("\n");
    } else if (lhs_vt.isIdentifier()) {
      // non-static method invocation
      ASTMethodCall method_call = (ASTMethodCall) children[1];
      String method_name = method_call.getIdentifier();
      sb.append("\tinvokevirtual ").append(lhs_vt)
        .append("/").append(method_name);
        
      // Method signature
      sb.append("(");

      int n_args = method_call.jjtGetNumChildren();
      ArrayList<VariableType> arg_types = new ArrayList<>();
      for (int i = 0; i < n_args; ++i) {
        VariableType arg_type = ((Typed) method_call.jjtGetChild(i)).getType();
        arg_types.add(arg_type);

        sb.append(arg_type.toJasminType());
      }

      sb.append(")");

      final String method_id = SymbolTableScopes.calculateMethodIdentifier(new VariableIdentifier(method_name), arg_types.toArray(new VariableType[0]));
      final Method m = SymbolTableScopes.getInstance().isMethodDeclared(method_id);
      if (m == null) {
        // non-declared instance methods (instance methods of other classes)
        // Inferring the return type from the variable assignment
        Node parent = this.jjtGetParent();

        sb.append(assumeReturnTypeFromParentNode(parent));
        sb.append("\n");

      } else {
        sb.append(m.getReturn().toJasminType()).append("\n");

        Node parent = this.jjtGetParent();

        if (parent instanceof ASTMethodDeclaration || parent instanceof ASTWhileBody || parent instanceof ASTIfBody || parent instanceof ASTElseBody) {
          sb.append("\tpop\n");
        }
      }
    }
  }

  private static String assumeReturnTypeFromParentNode(Node parent) {
    // The only parent for which the type we cannot infer is a dot expression, as any Object might be desired
    // In that case, the resulting object should be assigned to a variable and then used instead

    if (parent instanceof ASTAssignmentStatement) {
      ASTAssignmentStatement parent_assignment = (ASTAssignmentStatement) parent;
      return parent_assignment.getLHSVarType().toJasminType();
    } else if (parent instanceof ASTIfStatement || parent instanceof ASTWhileStatement || parent instanceof ASTNotExpression || parent instanceof ASTAndExpression) {
      return "Z";
    } else if (parent instanceof ASTLessThanExpression || parent instanceof ASTArithmeticExpression) {
      return "I";
    } else if (parent instanceof ASTArrayAccessExpression) {
      return "[I";
    } else {
      return "V";
    }
  }
}
/* JavaCC - OriginalChecksum=9e551656e978f3b2ea8f9c6934c8e272 (do not edit this line) */
