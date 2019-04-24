/* Generated By:JJTree: Do not edit this line. ASTAssignmentStatement.java Version 4.3 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=false,TRACK_TOKENS=false,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
public
class ASTAssignmentStatement extends SimpleNode {
  public ASTAssignmentStatement(int id) {
    super(id);
  }

  public ASTAssignmentStatement(JMMParser p, int id) {
    super(p, id);
  }

  @Override
  public String getNodeName() {
    return "=";
  }

  @Override
  protected void applySemanticAnalysis() throws SemanticError {
    Node lhs_raw = children[0];
    if (!(lhs_raw instanceof ASTIdentifier || lhs_raw instanceof ASTArrayAccessExpression)) {
      throw new SemanticError(this.line, "Invalid left hand side of assignment (neither an identifier nor array access)");
    }

    VariableType lhs = ((Typed) lhs_raw).getType();
    VariableType rhs = ((Typed) children[1]).getType();

    if (!lhs.equals(rhs)) {
      throw new SemanticError(this.line, String.format("Invalid assignment between types %s and %s", lhs, rhs));
    }
  }
}
/* JavaCC - OriginalChecksum=f503663119aadd748782d6739471f263 (do not edit this line) */
