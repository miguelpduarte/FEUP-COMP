/* Generated By:JJTree: Do not edit this line. ASTVarDeclaration.java Version 4.3 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=false,TRACK_TOKENS=false,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
public class ASTVarDeclaration extends SimpleNode implements DeclarationNode {
  protected String identifier;
  private Variable variable;

  public ASTVarDeclaration(int id) {
    super(id);
  }

  public ASTVarDeclaration(JMMParser p, int id) {
    super(p, id);
  }

  @Override
  public String getNodeName() {
    return "declaration: " + this.identifier;
  }

  @Override
  public void prepareInternalInfo() {
    this.variable = new Variable(new VariableType((ASTType) children[0]), new VariableIdentifier(identifier));
  }

  @Override
  public Variable toVariable() {
    return this.variable;
  }
}
/*
 * JavaCC - OriginalChecksum=2fe954f88636d4a225fdb6d7f6dd1974 (do not edit this
 * line)
 */

        