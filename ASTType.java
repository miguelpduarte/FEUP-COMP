/* Generated By:JJTree: Do not edit this line. ASTType.java Version 4.3 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=false,TRACK_TOKENS=false,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
public
class ASTType extends SimpleNode {
  protected String type;
  protected boolean isArray;

  public ASTType(int id) {
    super(id);
  }

  public ASTType(JMMParser p, int id) {
    super(p, id);
  }

  @Override
  public void dump(String prefix) {
    super.printNodeName(prefix);

    System.out.printf("%s{ type: %s, isArray: %b }\n", prefix, type, isArray);

    super.exploreChildren(prefix);
  }

}
/* JavaCC - OriginalChecksum=7492f522dc7687470bdf8f0a6354565b (do not edit this line) */
