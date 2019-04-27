/* Generated By:JJTree: Do not edit this line. ASTClassDeclaration.java Version 4.3 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=false,TRACK_TOKENS=false,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
public class ASTClassDeclaration extends NodeWithSymbolTable {
  // protected String name; // Declared in superclass for access

  public ASTClassDeclaration(int id) {
    super(id);
  }

  public ASTClassDeclaration(JMMParser p, int id) {
    super(p, id);
  }

  @Override
  public String getNodeName() {
    return "class " + this.name;
  }

  public String getClassName() {
    return this.name;
  }

  @Override
  protected void buildSymbolTable() {
    // Verifications have to be done for the existence of each node because all of them are optional
    if (children == null || children.length == 0) {
      return;
    }

    // 0 is optional and is extends
    int has_extends_shift = 0;
    if (children[0] instanceof ASTClassGeneralization) {
      has_extends_shift = 1;
    }

    if ((children.length - has_extends_shift) == 0) {
      // No methods nor fields
      return;
    }

    // 0/1 is fields that can have declarations as children
    ASTClassFields fields = (ASTClassFields) children[0 + has_extends_shift];
    final int n_fields = fields.jjtGetNumChildren();
    for (int i = 0; i < n_fields; ++i) {
      this.registerInSymbolTable(fields.jjtGetChild(i));
    }

    if ((children.length - has_extends_shift) == 1) {
      // No methods
      return;
    }

    // 1/2 is methods that also has declarations as children
    ASTClassMethods methods = (ASTClassMethods) children[1 + has_extends_shift];
    final int n_methods = methods.jjtGetNumChildren();
    for (int i = 0; i < n_methods; ++i) {
      this.registerInSymbolTable(methods.jjtGetChild(i));
    }

    SymbolTableScopes.getInstance().setGlobalScope(this.symbol_table);
  }

  @Override
  protected String getScopeIdentifier() {
    return null;
  }

  @Override
  protected void generateCodeNodeOpen(StringBuilder sb) {
    sb.append(".class public ").append(this.name).append("\n");
    if (!(children[0] instanceof ASTClassGeneralization)) {
      sb.append(".super java/lang/Object\n\n");

      sb.append("; standard implicit constructor\n")
        .append(".method public <init>()V\n")
        .append("\taload_0\n")
        .append("\tinvokenonvirtual java/lang/Object/<init>()V\n")
        .append("\treturn\n")
        .append(".end method\n\n");
    }
  }
}
/*
 * JavaCC - OriginalChecksum=36754aee3a22d19327a28ac9d9418a2d (do not edit this
 * line)
 */
