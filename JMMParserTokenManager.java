/* Generated By:JJTree&JavaCC: Do not edit this line. JMMParserTokenManager.java */
import java.io.FileInputStream;
import java.io.FileNotFoundException;

/** Token Manager. */
public class JMMParserTokenManager implements JMMParserConstants
{

  /** Debug output. */
  public  java.io.PrintStream debugStream = System.out;
  /** Set debug output. */
  public  void setDebugStream(java.io.PrintStream ds) { debugStream = ds; }
private final int jjStopStringLiteralDfa_0(int pos, long active0)
{
   switch (pos)
   {
      case 0:
         if ((active0 & 0x1ffff800000L) != 0L)
         {
            jjmatchedKind = 41;
            return 9;
         }
         if ((active0 & 0x40L) != 0L)
         {
            jjmatchedKind = 20;
            return 0;
         }
         return -1;
      case 1:
         if ((active0 & 0x1bfff800000L) != 0L)
         {
            jjmatchedKind = 41;
            jjmatchedPos = 1;
            return 9;
         }
         if ((active0 & 0x4000000000L) != 0L)
            return 9;
         return -1;
      case 2:
         if ((active0 & 0x19fff000000L) != 0L)
         {
            jjmatchedKind = 41;
            jjmatchedPos = 2;
            return 9;
         }
         if ((active0 & 0x2000800000L) != 0L)
            return 9;
         return -1;
      case 3:
         if ((active0 & 0x10b3f000000L) != 0L)
         {
            jjmatchedKind = 41;
            jjmatchedPos = 3;
            return 9;
         }
         if ((active0 & 0x94c0000000L) != 0L)
            return 9;
         return -1;
      case 4:
         if ((active0 & 0x33b000000L) != 0L)
         {
            jjmatchedKind = 41;
            jjmatchedPos = 4;
            return 9;
         }
         if ((active0 & 0x10804000000L) != 0L)
            return 9;
         return -1;
      case 5:
         if ((active0 & 0x9000000L) != 0L)
         {
            jjmatchedKind = 41;
            jjmatchedPos = 5;
            return 9;
         }
         if ((active0 & 0x332000000L) != 0L)
            return 9;
         return -1;
      default :
         return -1;
   }
}
private final int jjStartNfa_0(int pos, long active0)
{
   return jjMoveNfa_0(jjStopStringLiteralDfa_0(pos, active0), pos + 1);
}
private int jjStopAtPos(int pos, int kind)
{
   jjmatchedKind = kind;
   jjmatchedPos = pos;
   return pos + 1;
}
private int jjMoveStringLiteralDfa0_0()
{
   switch(curChar)
   {
      case 33:
         return jjStopAtPos(0, 21);
      case 38:
         return jjMoveStringLiteralDfa1_0(0x20000L);
      case 40:
         return jjStopAtPos(0, 48);
      case 41:
         return jjStopAtPos(0, 49);
      case 44:
         return jjStopAtPos(0, 53);
      case 46:
         return jjStopAtPos(0, 22);
      case 47:
         return jjMoveStringLiteralDfa1_0(0x40L);
      case 59:
         return jjStopAtPos(0, 52);
      case 60:
         return jjStopAtPos(0, 18);
      case 61:
         return jjStopAtPos(0, 54);
      case 83:
         return jjMoveStringLiteralDfa1_0(0x2000000L);
      case 91:
         return jjStopAtPos(0, 50);
      case 93:
         return jjStopAtPos(0, 51);
      case 98:
         return jjMoveStringLiteralDfa1_0(0x1000000L);
      case 99:
         return jjMoveStringLiteralDfa1_0(0x4000000L);
      case 101:
         return jjMoveStringLiteralDfa1_0(0x8008000000L);
      case 102:
         return jjMoveStringLiteralDfa1_0(0x800000000L);
      case 105:
         return jjMoveStringLiteralDfa1_0(0x4000800000L);
      case 108:
         return jjMoveStringLiteralDfa1_0(0x200000000L);
      case 109:
         return jjMoveStringLiteralDfa1_0(0x80000000L);
      case 110:
         return jjMoveStringLiteralDfa1_0(0x2000000000L);
      case 112:
         return jjMoveStringLiteralDfa1_0(0x10000000L);
      case 114:
         return jjMoveStringLiteralDfa1_0(0x100000000L);
      case 115:
         return jjMoveStringLiteralDfa1_0(0x20000000L);
      case 116:
         return jjMoveStringLiteralDfa1_0(0x1400000000L);
      case 118:
         return jjMoveStringLiteralDfa1_0(0x40000000L);
      case 119:
         return jjMoveStringLiteralDfa1_0(0x10000000000L);
      case 123:
         return jjStopAtPos(0, 46);
      case 125:
         return jjStopAtPos(0, 47);
      default :
         return jjMoveNfa_0(2, 0);
   }
}
private int jjMoveStringLiteralDfa1_0(long active0)
{
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(0, active0);
      return 1;
   }
   switch(curChar)
   {
      case 38:
         if ((active0 & 0x20000L) != 0L)
            return jjStopAtPos(1, 17);
         break;
      case 42:
         if ((active0 & 0x40L) != 0L)
            return jjStopAtPos(1, 6);
         break;
      case 97:
         return jjMoveStringLiteralDfa2_0(active0, 0x880000000L);
      case 101:
         return jjMoveStringLiteralDfa2_0(active0, 0x2300000000L);
      case 102:
         if ((active0 & 0x4000000000L) != 0L)
            return jjStartNfaWithStates_0(1, 38, 9);
         break;
      case 104:
         return jjMoveStringLiteralDfa2_0(active0, 0x11000000000L);
      case 108:
         return jjMoveStringLiteralDfa2_0(active0, 0x8004000000L);
      case 110:
         return jjMoveStringLiteralDfa2_0(active0, 0x800000L);
      case 111:
         return jjMoveStringLiteralDfa2_0(active0, 0x41000000L);
      case 114:
         return jjMoveStringLiteralDfa2_0(active0, 0x400000000L);
      case 116:
         return jjMoveStringLiteralDfa2_0(active0, 0x22000000L);
      case 117:
         return jjMoveStringLiteralDfa2_0(active0, 0x10000000L);
      case 120:
         return jjMoveStringLiteralDfa2_0(active0, 0x8000000L);
      default :
         break;
   }
   return jjStartNfa_0(0, active0);
}
private int jjMoveStringLiteralDfa2_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(0, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(1, active0);
      return 2;
   }
   switch(curChar)
   {
      case 97:
         return jjMoveStringLiteralDfa3_0(active0, 0x24000000L);
      case 98:
         return jjMoveStringLiteralDfa3_0(active0, 0x10000000L);
      case 105:
         return jjMoveStringLiteralDfa3_0(active0, 0x110c0000000L);
      case 108:
         return jjMoveStringLiteralDfa3_0(active0, 0x800000000L);
      case 110:
         return jjMoveStringLiteralDfa3_0(active0, 0x200000000L);
      case 111:
         return jjMoveStringLiteralDfa3_0(active0, 0x1000000L);
      case 114:
         return jjMoveStringLiteralDfa3_0(active0, 0x2000000L);
      case 115:
         return jjMoveStringLiteralDfa3_0(active0, 0x8000000000L);
      case 116:
         if ((active0 & 0x800000L) != 0L)
            return jjStartNfaWithStates_0(2, 23, 9);
         return jjMoveStringLiteralDfa3_0(active0, 0x108000000L);
      case 117:
         return jjMoveStringLiteralDfa3_0(active0, 0x400000000L);
      case 119:
         if ((active0 & 0x2000000000L) != 0L)
            return jjStartNfaWithStates_0(2, 37, 9);
         break;
      default :
         break;
   }
   return jjStartNfa_0(1, active0);
}
private int jjMoveStringLiteralDfa3_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(1, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(2, active0);
      return 3;
   }
   switch(curChar)
   {
      case 100:
         if ((active0 & 0x40000000L) != 0L)
            return jjStartNfaWithStates_0(3, 30, 9);
         break;
      case 101:
         if ((active0 & 0x400000000L) != 0L)
            return jjStartNfaWithStates_0(3, 34, 9);
         else if ((active0 & 0x8000000000L) != 0L)
            return jjStartNfaWithStates_0(3, 39, 9);
         return jjMoveStringLiteralDfa4_0(active0, 0x8000000L);
      case 103:
         return jjMoveStringLiteralDfa4_0(active0, 0x200000000L);
      case 105:
         return jjMoveStringLiteralDfa4_0(active0, 0x2000000L);
      case 108:
         return jjMoveStringLiteralDfa4_0(active0, 0x10011000000L);
      case 110:
         if ((active0 & 0x80000000L) != 0L)
            return jjStartNfaWithStates_0(3, 31, 9);
         break;
      case 115:
         if ((active0 & 0x1000000000L) != 0L)
            return jjStartNfaWithStates_0(3, 36, 9);
         return jjMoveStringLiteralDfa4_0(active0, 0x804000000L);
      case 116:
         return jjMoveStringLiteralDfa4_0(active0, 0x20000000L);
      case 117:
         return jjMoveStringLiteralDfa4_0(active0, 0x100000000L);
      default :
         break;
   }
   return jjStartNfa_0(2, active0);
}
private int jjMoveStringLiteralDfa4_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(2, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(3, active0);
      return 4;
   }
   switch(curChar)
   {
      case 101:
         if ((active0 & 0x800000000L) != 0L)
            return jjStartNfaWithStates_0(4, 35, 9);
         else if ((active0 & 0x10000000000L) != 0L)
            return jjStartNfaWithStates_0(4, 40, 9);
         return jjMoveStringLiteralDfa5_0(active0, 0x1000000L);
      case 105:
         return jjMoveStringLiteralDfa5_0(active0, 0x30000000L);
      case 110:
         return jjMoveStringLiteralDfa5_0(active0, 0xa000000L);
      case 114:
         return jjMoveStringLiteralDfa5_0(active0, 0x100000000L);
      case 115:
         if ((active0 & 0x4000000L) != 0L)
            return jjStartNfaWithStates_0(4, 26, 9);
         break;
      case 116:
         return jjMoveStringLiteralDfa5_0(active0, 0x200000000L);
      default :
         break;
   }
   return jjStartNfa_0(3, active0);
}
private int jjMoveStringLiteralDfa5_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(3, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(4, active0);
      return 5;
   }
   switch(curChar)
   {
      case 97:
         return jjMoveStringLiteralDfa6_0(active0, 0x1000000L);
      case 99:
         if ((active0 & 0x10000000L) != 0L)
            return jjStartNfaWithStates_0(5, 28, 9);
         else if ((active0 & 0x20000000L) != 0L)
            return jjStartNfaWithStates_0(5, 29, 9);
         break;
      case 100:
         return jjMoveStringLiteralDfa6_0(active0, 0x8000000L);
      case 103:
         if ((active0 & 0x2000000L) != 0L)
            return jjStartNfaWithStates_0(5, 25, 9);
         break;
      case 104:
         if ((active0 & 0x200000000L) != 0L)
            return jjStartNfaWithStates_0(5, 33, 9);
         break;
      case 110:
         if ((active0 & 0x100000000L) != 0L)
            return jjStartNfaWithStates_0(5, 32, 9);
         break;
      default :
         break;
   }
   return jjStartNfa_0(4, active0);
}
private int jjMoveStringLiteralDfa6_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(4, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(5, active0);
      return 6;
   }
   switch(curChar)
   {
      case 110:
         if ((active0 & 0x1000000L) != 0L)
            return jjStartNfaWithStates_0(6, 24, 9);
         break;
      case 115:
         if ((active0 & 0x8000000L) != 0L)
            return jjStartNfaWithStates_0(6, 27, 9);
         break;
      default :
         break;
   }
   return jjStartNfa_0(5, active0);
}
private int jjStartNfaWithStates_0(int pos, int kind, int state)
{
   jjmatchedKind = kind;
   jjmatchedPos = pos;
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) { return pos + 1; }
   return jjMoveNfa_0(state, pos + 1);
}
static final long[] jjbitVec0 = {
   0x0L, 0x0L, 0xffffffffffffffffL, 0xffffffffffffffffL
};
private int jjMoveNfa_0(int startState, int curPos)
{
   int startsAt = 0;
   jjnewStateCnt = 14;
   int i = 1;
   jjstateSet[0] = startState;
   int kind = 0x7fffffff;
   for (;;)
   {
      if (++jjround == 0x7fffffff)
         ReInitRounds();
      if (curChar < 64)
      {
         long l = 1L << curChar;
         do
         {
            switch(jjstateSet[--i])
            {
               case 2:
                  if ((0x3fe000000000000L & l) != 0L)
                  {
                     if (kind > 9)
                        kind = 9;
                     jjCheckNAddTwoStates(4, 5);
                  }
                  else if ((0x840000000000L & l) != 0L)
                  {
                     if (kind > 20)
                        kind = 20;
                  }
                  else if ((0x280000000000L & l) != 0L)
                  {
                     if (kind > 19)
                        kind = 19;
                  }
                  else if (curChar == 48)
                  {
                     if (kind > 9)
                        kind = 9;
                     jjCheckNAddStates(0, 2);
                  }
                  else if (curChar == 36)
                  {
                     if (kind > 41)
                        kind = 41;
                     jjCheckNAdd(9);
                  }
                  if (curChar == 47)
                     jjstateSet[jjnewStateCnt++] = 0;
                  break;
               case 0:
                  if (curChar != 47)
                     break;
                  if (kind > 5)
                     kind = 5;
                  jjCheckNAdd(1);
                  break;
               case 1:
                  if ((0xffffffffffffdbffL & l) == 0L)
                     break;
                  if (kind > 5)
                     kind = 5;
                  jjCheckNAdd(1);
                  break;
               case 3:
                  if ((0x3fe000000000000L & l) == 0L)
                     break;
                  if (kind > 9)
                     kind = 9;
                  jjCheckNAddTwoStates(4, 5);
                  break;
               case 4:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 9)
                     kind = 9;
                  jjCheckNAddTwoStates(4, 5);
                  break;
               case 6:
                  if ((0x280000000000L & l) != 0L && kind > 19)
                     kind = 19;
                  break;
               case 7:
                  if ((0x840000000000L & l) != 0L && kind > 20)
                     kind = 20;
                  break;
               case 8:
                  if (curChar != 36)
                     break;
                  if (kind > 41)
                     kind = 41;
                  jjCheckNAdd(9);
                  break;
               case 9:
                  if ((0x3ff001000000000L & l) == 0L)
                     break;
                  if (kind > 41)
                     kind = 41;
                  jjCheckNAdd(9);
                  break;
               case 10:
                  if (curChar != 48)
                     break;
                  if (kind > 9)
                     kind = 9;
                  jjCheckNAddStates(0, 2);
                  break;
               case 12:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 9)
                     kind = 9;
                  jjCheckNAddTwoStates(12, 5);
                  break;
               case 13:
                  if ((0xff000000000000L & l) == 0L)
                     break;
                  if (kind > 9)
                     kind = 9;
                  jjCheckNAddTwoStates(13, 5);
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      else if (curChar < 128)
      {
         long l = 1L << (curChar & 077);
         do
         {
            switch(jjstateSet[--i])
            {
               case 2:
               case 9:
                  if ((0x7fffffe87fffffeL & l) == 0L)
                     break;
                  if (kind > 41)
                     kind = 41;
                  jjCheckNAdd(9);
                  break;
               case 1:
                  if (kind > 5)
                     kind = 5;
                  jjstateSet[jjnewStateCnt++] = 1;
                  break;
               case 5:
                  if ((0x100000001000L & l) != 0L && kind > 9)
                     kind = 9;
                  break;
               case 11:
                  if ((0x100000001000000L & l) != 0L)
                     jjCheckNAdd(12);
                  break;
               case 12:
                  if ((0x7e0000007eL & l) == 0L)
                     break;
                  if (kind > 9)
                     kind = 9;
                  jjCheckNAddTwoStates(12, 5);
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      else
      {
         int i2 = (curChar & 0xff) >> 6;
         long l2 = 1L << (curChar & 077);
         do
         {
            switch(jjstateSet[--i])
            {
               case 1:
                  if ((jjbitVec0[i2] & l2) == 0L)
                     break;
                  if (kind > 5)
                     kind = 5;
                  jjstateSet[jjnewStateCnt++] = 1;
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      if (kind != 0x7fffffff)
      {
         jjmatchedKind = kind;
         jjmatchedPos = curPos;
         kind = 0x7fffffff;
      }
      ++curPos;
      if ((i = jjnewStateCnt) == (startsAt = 14 - (jjnewStateCnt = startsAt)))
         return curPos;
      try { curChar = input_stream.readChar(); }
      catch(java.io.IOException e) { return curPos; }
   }
}
private int jjMoveStringLiteralDfa0_1()
{
   switch(curChar)
   {
      case 42:
         return jjMoveStringLiteralDfa1_1(0x80L);
      default :
         return 1;
   }
}
private int jjMoveStringLiteralDfa1_1(long active0)
{
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      return 1;
   }
   switch(curChar)
   {
      case 47:
         if ((active0 & 0x80L) != 0L)
            return jjStopAtPos(1, 7);
         break;
      default :
         return 2;
   }
   return 2;
}
static final int[] jjnextStates = {
   11, 13, 5, 
};

/** Token literal values. */
public static final String[] jjstrLiteralImages = {
"", null, null, null, null, null, null, null, null, null, null, null, null, 
null, null, null, null, "\46\46", "\74", null, null, "\41", "\56", "\151\156\164", 
"\142\157\157\154\145\141\156", "\123\164\162\151\156\147", "\143\154\141\163\163", 
"\145\170\164\145\156\144\163", "\160\165\142\154\151\143", "\163\164\141\164\151\143", "\166\157\151\144", 
"\155\141\151\156", "\162\145\164\165\162\156", "\154\145\156\147\164\150", "\164\162\165\145", 
"\146\141\154\163\145", "\164\150\151\163", "\156\145\167", "\151\146", "\145\154\163\145", 
"\167\150\151\154\145", null, null, null, null, null, "\173", "\175", "\50", "\51", "\133", "\135", 
"\73", "\54", "\75", };

/** Lexer state names. */
public static final String[] lexStateNames = {
   "DEFAULT",
   "MULTILINE_COMMENT_STATE",
};

/** Lex State array. */
public static final int[] jjnewLexState = {
   -1, -1, -1, -1, -1, -1, 1, 0, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
   -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
   -1, -1, -1, -1, -1, 
};
static final long[] jjtoToken = {
   0x7fc3fffffe0201L, 
};
static final long[] jjtoSkip = {
   0x1feL, 
};
protected SimpleCharStream input_stream;
private final int[] jjrounds = new int[14];
private final int[] jjstateSet = new int[28];
protected char curChar;
/** Constructor. */
public JMMParserTokenManager(SimpleCharStream stream){
   if (SimpleCharStream.staticFlag)
      throw new Error("ERROR: Cannot use a static CharStream class with a non-static lexical analyzer.");
   input_stream = stream;
}

/** Constructor. */
public JMMParserTokenManager(SimpleCharStream stream, int lexState){
   this(stream);
   SwitchTo(lexState);
}

/** Reinitialise parser. */
public void ReInit(SimpleCharStream stream)
{
   jjmatchedPos = jjnewStateCnt = 0;
   curLexState = defaultLexState;
   input_stream = stream;
   ReInitRounds();
}
private void ReInitRounds()
{
   int i;
   jjround = 0x80000001;
   for (i = 14; i-- > 0;)
      jjrounds[i] = 0x80000000;
}

/** Reinitialise parser. */
public void ReInit(SimpleCharStream stream, int lexState)
{
   ReInit(stream);
   SwitchTo(lexState);
}

/** Switch to specified lex state. */
public void SwitchTo(int lexState)
{
   if (lexState >= 2 || lexState < 0)
      throw new TokenMgrError("Error: Ignoring invalid lexical state : " + lexState + ". State unchanged.", TokenMgrError.INVALID_LEXICAL_STATE);
   else
      curLexState = lexState;
}

protected Token jjFillToken()
{
   final Token t;
   final String curTokenImage;
   final int beginLine;
   final int endLine;
   final int beginColumn;
   final int endColumn;
   String im = jjstrLiteralImages[jjmatchedKind];
   curTokenImage = (im == null) ? input_stream.GetImage() : im;
   beginLine = input_stream.getBeginLine();
   beginColumn = input_stream.getBeginColumn();
   endLine = input_stream.getEndLine();
   endColumn = input_stream.getEndColumn();
   t = Token.newToken(jjmatchedKind, curTokenImage);

   t.beginLine = beginLine;
   t.endLine = endLine;
   t.beginColumn = beginColumn;
   t.endColumn = endColumn;

   return t;
}

int curLexState = 0;
int defaultLexState = 0;
int jjnewStateCnt;
int jjround;
int jjmatchedPos;
int jjmatchedKind;

/** Get the next Token. */
public Token getNextToken() 
{
  Token matchedToken;
  int curPos = 0;

  EOFLoop :
  for (;;)
  {
   try
   {
      curChar = input_stream.BeginToken();
   }
   catch(java.io.IOException e)
   {
      jjmatchedKind = 0;
      matchedToken = jjFillToken();
      return matchedToken;
   }

   switch(curLexState)
   {
     case 0:
       try { input_stream.backup(0);
          while (curChar <= 32 && (0x100002600L & (1L << curChar)) != 0L)
             curChar = input_stream.BeginToken();
       }
       catch (java.io.IOException e1) { continue EOFLoop; }
       jjmatchedKind = 0x7fffffff;
       jjmatchedPos = 0;
       curPos = jjMoveStringLiteralDfa0_0();
       break;
     case 1:
       jjmatchedKind = 0x7fffffff;
       jjmatchedPos = 0;
       curPos = jjMoveStringLiteralDfa0_1();
       if (jjmatchedPos == 0 && jjmatchedKind > 8)
       {
          jjmatchedKind = 8;
       }
       break;
   }
     if (jjmatchedKind != 0x7fffffff)
     {
        if (jjmatchedPos + 1 < curPos)
           input_stream.backup(curPos - jjmatchedPos - 1);
        if ((jjtoToken[jjmatchedKind >> 6] & (1L << (jjmatchedKind & 077))) != 0L)
        {
           matchedToken = jjFillToken();
       if (jjnewLexState[jjmatchedKind] != -1)
         curLexState = jjnewLexState[jjmatchedKind];
           return matchedToken;
        }
        else
        {
         if (jjnewLexState[jjmatchedKind] != -1)
           curLexState = jjnewLexState[jjmatchedKind];
           continue EOFLoop;
        }
     }
     int error_line = input_stream.getEndLine();
     int error_column = input_stream.getEndColumn();
     String error_after = null;
     boolean EOFSeen = false;
     try { input_stream.readChar(); input_stream.backup(1); }
     catch (java.io.IOException e1) {
        EOFSeen = true;
        error_after = curPos <= 1 ? "" : input_stream.GetImage();
        if (curChar == '\n' || curChar == '\r') {
           error_line++;
           error_column = 0;
        }
        else
           error_column++;
     }
     if (!EOFSeen) {
        input_stream.backup(1);
        error_after = curPos <= 1 ? "" : input_stream.GetImage();
     }
     throw new TokenMgrError(EOFSeen, curLexState, error_line, error_column, error_after, curChar, TokenMgrError.LEXICAL_ERROR);
  }
}

private void jjCheckNAdd(int state)
{
   if (jjrounds[state] != jjround)
   {
      jjstateSet[jjnewStateCnt++] = state;
      jjrounds[state] = jjround;
   }
}
private void jjAddStates(int start, int end)
{
   do {
      jjstateSet[jjnewStateCnt++] = jjnextStates[start];
   } while (start++ != end);
}
private void jjCheckNAddTwoStates(int state1, int state2)
{
   jjCheckNAdd(state1);
   jjCheckNAdd(state2);
}

private void jjCheckNAddStates(int start, int end)
{
   do {
      jjCheckNAdd(jjnextStates[start]);
   } while (start++ != end);
}

}
