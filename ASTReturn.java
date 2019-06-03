/* Generated By:JJTree: Do not edit this line. ASTReturn.java Version 4.3 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=false,TRACK_TOKENS=false,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
public
class ASTReturn extends SimpleNode {
  public ASTReturn(int id) {
    super(id);
  }

  public ASTReturn(JMMParser p, int id) {
    super(p, id);
  }

  @Override
  public String getNodeName() {
    return "return";
  }

  @Override
  protected void calculateStackImpact() {
    MethodStackSizeScopes.getInstance().getMethodScope(this.scope_identifier).impactStack(-1);
  }

  @Override
  protected void applySemanticAnalysis() throws SemanticError {    
    Method m = SymbolTableScopes.getInstance().isMethodDeclared(this.scope_identifier);
    VariableType ret_type = ((Typed) children[0]).getType();
    
    if (!m.getReturn().equals(ret_type)) {
      throw new SemanticError(this.line, String.format("Type mismatch in method return (expected %s, found %s) for method with signature %s", m.getReturn(), ret_type, this.scope_identifier));
    }
  }
}
/* JavaCC - OriginalChecksum=9b3082da7d18bccf67b467d02cd5241c (do not edit this line) */
