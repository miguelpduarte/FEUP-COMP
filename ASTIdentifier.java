/* Generated By:JJTree: Do not edit this line. ASTIdentifier.java Version 4.3 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=false,TRACK_TOKENS=false,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
public class ASTIdentifier extends SimpleNode implements Typed {
  protected String value;
  private VariableType type;

  public ASTIdentifier(int id) {
    super(id);
  }

  public ASTIdentifier(JMMParser p, int id) {
    super(p, id);
  }

  @Override
  public String getNodeName() {
    return this.value;
  }

  @Override
  public VariableType getType() {
    return type;
  }

  @Override
  protected void applySemanticAnalysis() throws SemanticError {
    Variable v = SymbolTableScopes.getInstance().isDeclared(this.scope_identifier, this.value);
    if (v == null) {
      throw new SemanticError(this.line, String.format("Using undeclared variable '%s'!\n", this.value));
    }

    this.type = v.getType();
  }
}
/*
 * JavaCC - OriginalChecksum=534021caa2c544cea987828b4185652b (do not edit this
 * line)
 */
