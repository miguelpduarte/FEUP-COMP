/* Generated By:JJTree: Do not edit this line. ASTThis.java Version 4.3 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=false,TRACK_TOKENS=false,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
public class ASTThis extends SimpleNode implements Typed {
  public ASTThis(int id) {
    super(id);
  }

  public ASTThis(JMMParser p, int id) {
    super(p, id);
  }

  @Override
  public String getNodeName() {
    return "this";
  }

  @Override
  public VariableType getType() {
    return this.parser.class_type;
  }
}
/*
 * JavaCC - OriginalChecksum=7e187eb57ae309ead48e8772b7e649ad (do not edit this
 * line)
 */
