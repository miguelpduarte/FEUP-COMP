/* Generated By:JJTree: Do not edit this line. ASTMethodCall.java Version 4.3 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=false,TRACK_TOKENS=false,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
public
class ASTMethodCall extends SimpleNode {
  protected String identifier;

  public ASTMethodCall(int id) {
    super(id);
  }

  public ASTMethodCall(JMMParser p, int id) {
    super(p, id);
  }

  @Override
  public String getNodeName() {
    return this.identifier + "()";
  }
}
/* JavaCC - OriginalChecksum=5b2baecc3b8f8bf2355cebb5f937a13c (do not edit this line) */
