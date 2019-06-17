// Generated from pascalTokens.g4 by ANTLR 4.7.2
package tokens;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class pascalTokens extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		AND=1, ARRAY=2, BEGIN=3, BOOLEAN=4, CASE=5, CHAR=6, CONST=7, DIV=8, DO=9, 
		DOWNTO=10, ELSE=11, END=12, FOR=13, FUNCTION=14, IF=15, INTEGER=16, LABEL=17, 
		NIL=18, OF=19, OR=20, PROCEDURE=21, PROGRAM=22, REAL=23, SET=24, THEN=25, 
		TO=26, TYPE=27, UNTIL=28, VAR=29, WHILE=30, WITH=31, INTERFACE=32, USES=33, 
		STRING=34, TRUE=35, FALSE=36, PLUS=37, MINUS=38, STAR=39, SLASH=40, ASSIGN=41, 
		COMMA=42, SEMI=43, COLON=44, EQUAL=45, NOT_EQUAL=46, LT=47, LE=48, GT=49, 
		GE=50, LPAREN=51, RPAREN=52, LBRACK=53, LBRACK2=54, RBRACK=55, RBRACK2=56, 
		AT=57, DOT=58, LCURLY=59, RCURLY=60, WS=61, COMMENT_1=62, COMMENT_2=63, 
		IDENT=64, STRING_LITERAL=65, NUM_INT=66, NUM_REAL=67;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"AND", "ARRAY", "BEGIN", "BOOLEAN", "CASE", "CHAR", "CONST", "DIV", "DO", 
			"DOWNTO", "ELSE", "END", "FOR", "FUNCTION", "IF", "INTEGER", "LABEL", 
			"NIL", "OF", "OR", "PROCEDURE", "PROGRAM", "REAL", "SET", "THEN", "TO", 
			"TYPE", "UNTIL", "VAR", "WHILE", "WITH", "INTERFACE", "USES", "STRING", 
			"TRUE", "FALSE", "PLUS", "MINUS", "STAR", "SLASH", "ASSIGN", "COMMA", 
			"SEMI", "COLON", "EQUAL", "NOT_EQUAL", "LT", "LE", "GT", "GE", "LPAREN", 
			"RPAREN", "LBRACK", "LBRACK2", "RBRACK", "RBRACK2", "AT", "DOT", "LCURLY", 
			"RCURLY", "WS", "COMMENT_1", "COMMENT_2", "IDENT", "STRING_LITERAL", 
			"NUM_INT", "NUM_REAL"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'and'", "'array'", "'begin'", "'boolean'", "'case'", "'char'", 
			"'const'", "'div'", "'do'", "'downto'", "'else'", "'end'", "'for'", "'function'", 
			"'if'", "'integer'", "'label'", "'nil'", "'of'", "'or'", "'procedure'", 
			"'program'", "'real'", "'set'", "'then'", "'to'", "'type'", "'until'", 
			"'var'", "'while'", "'with'", "'interface'", "'uses'", "'string'", "'true'", 
			"'false'", "'+'", "'-'", "'*'", "'/'", "':='", "','", "';'", "':'", "'='", 
			"'<>'", "'<'", "'<='", "'>'", "'>='", "'('", "')'", "'['", "'(.'", "']'", 
			"'.)'", "'@'", "'.'", "'{'", "'}'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "AND", "ARRAY", "BEGIN", "BOOLEAN", "CASE", "CHAR", "CONST", "DIV", 
			"DO", "DOWNTO", "ELSE", "END", "FOR", "FUNCTION", "IF", "INTEGER", "LABEL", 
			"NIL", "OF", "OR", "PROCEDURE", "PROGRAM", "REAL", "SET", "THEN", "TO", 
			"TYPE", "UNTIL", "VAR", "WHILE", "WITH", "INTERFACE", "USES", "STRING", 
			"TRUE", "FALSE", "PLUS", "MINUS", "STAR", "SLASH", "ASSIGN", "COMMA", 
			"SEMI", "COLON", "EQUAL", "NOT_EQUAL", "LT", "LE", "GT", "GE", "LPAREN", 
			"RPAREN", "LBRACK", "LBRACK2", "RBRACK", "RBRACK2", "AT", "DOT", "LCURLY", 
			"RCURLY", "WS", "COMMENT_1", "COMMENT_2", "IDENT", "STRING_LITERAL", 
			"NUM_INT", "NUM_REAL"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}


	public pascalTokens(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "pascalTokens.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2E\u01c3\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\3\2\3\2\3\2\3\2\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t"+
		"\3\t\3\t\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3"+
		"\f\3\f\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3"+
		"\17\3\17\3\17\3\17\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3"+
		"\21\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3"+
		"\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3"+
		"\27\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3"+
		"\31\3\31\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3"+
		"\34\3\35\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3"+
		"\37\3\37\3\37\3 \3 \3 \3 \3 \3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3\"\3\"\3\""+
		"\3\"\3\"\3#\3#\3#\3#\3#\3#\3#\3$\3$\3$\3$\3$\3%\3%\3%\3%\3%\3%\3&\3&\3"+
		"\'\3\'\3(\3(\3)\3)\3*\3*\3*\3+\3+\3,\3,\3-\3-\3.\3.\3/\3/\3/\3\60\3\60"+
		"\3\61\3\61\3\61\3\62\3\62\3\63\3\63\3\63\3\64\3\64\3\65\3\65\3\66\3\66"+
		"\3\67\3\67\3\67\38\38\39\39\39\3:\3:\3;\3;\3<\3<\3=\3=\3>\3>\3>\3>\3?"+
		"\3?\3?\3?\7?\u018d\n?\f?\16?\u0190\13?\3?\3?\3?\3?\3?\3@\3@\7@\u0199\n"+
		"@\f@\16@\u019c\13@\3@\3@\3@\3@\3A\3A\7A\u01a4\nA\fA\16A\u01a7\13A\3B\3"+
		"B\3B\3B\7B\u01ad\nB\fB\16B\u01b0\13B\3B\3B\3C\6C\u01b5\nC\rC\16C\u01b6"+
		"\3D\6D\u01ba\nD\rD\16D\u01bb\3D\3D\6D\u01c0\nD\rD\16D\u01c1\4\u018e\u019a"+
		"\2E\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35"+
		"\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36"+
		";\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\64g\65i\66k\67"+
		"m8o9q:s;u<w=y>{?}@\177A\u0081B\u0083C\u0085D\u0087E\3\2\6\5\2\13\f\17"+
		"\17\"\"\4\2C\\c|\6\2\62;C\\aac|\3\2))\2\u01ca\2\3\3\2\2\2\2\5\3\2\2\2"+
		"\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3"+
		"\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2"+
		"\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2"+
		"\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2"+
		"\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2"+
		"\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2"+
		"\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y"+
		"\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2"+
		"\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2"+
		"\2s\3\2\2\2\2u\3\2\2\2\2w\3\2\2\2\2y\3\2\2\2\2{\3\2\2\2\2}\3\2\2\2\2\177"+
		"\3\2\2\2\2\u0081\3\2\2\2\2\u0083\3\2\2\2\2\u0085\3\2\2\2\2\u0087\3\2\2"+
		"\2\3\u0089\3\2\2\2\5\u008d\3\2\2\2\7\u0093\3\2\2\2\t\u0099\3\2\2\2\13"+
		"\u00a1\3\2\2\2\r\u00a6\3\2\2\2\17\u00ab\3\2\2\2\21\u00b1\3\2\2\2\23\u00b5"+
		"\3\2\2\2\25\u00b8\3\2\2\2\27\u00bf\3\2\2\2\31\u00c4\3\2\2\2\33\u00c8\3"+
		"\2\2\2\35\u00cc\3\2\2\2\37\u00d5\3\2\2\2!\u00d8\3\2\2\2#\u00e0\3\2\2\2"+
		"%\u00e6\3\2\2\2\'\u00ea\3\2\2\2)\u00ed\3\2\2\2+\u00f0\3\2\2\2-\u00fa\3"+
		"\2\2\2/\u0102\3\2\2\2\61\u0107\3\2\2\2\63\u010b\3\2\2\2\65\u0110\3\2\2"+
		"\2\67\u0113\3\2\2\29\u0118\3\2\2\2;\u011e\3\2\2\2=\u0122\3\2\2\2?\u0128"+
		"\3\2\2\2A\u012d\3\2\2\2C\u0137\3\2\2\2E\u013c\3\2\2\2G\u0143\3\2\2\2I"+
		"\u0148\3\2\2\2K\u014e\3\2\2\2M\u0150\3\2\2\2O\u0152\3\2\2\2Q\u0154\3\2"+
		"\2\2S\u0156\3\2\2\2U\u0159\3\2\2\2W\u015b\3\2\2\2Y\u015d\3\2\2\2[\u015f"+
		"\3\2\2\2]\u0161\3\2\2\2_\u0164\3\2\2\2a\u0166\3\2\2\2c\u0169\3\2\2\2e"+
		"\u016b\3\2\2\2g\u016e\3\2\2\2i\u0170\3\2\2\2k\u0172\3\2\2\2m\u0174\3\2"+
		"\2\2o\u0177\3\2\2\2q\u0179\3\2\2\2s\u017c\3\2\2\2u\u017e\3\2\2\2w\u0180"+
		"\3\2\2\2y\u0182\3\2\2\2{\u0184\3\2\2\2}\u0188\3\2\2\2\177\u0196\3\2\2"+
		"\2\u0081\u01a1\3\2\2\2\u0083\u01a8\3\2\2\2\u0085\u01b4\3\2\2\2\u0087\u01b9"+
		"\3\2\2\2\u0089\u008a\7c\2\2\u008a\u008b\7p\2\2\u008b\u008c\7f\2\2\u008c"+
		"\4\3\2\2\2\u008d\u008e\7c\2\2\u008e\u008f\7t\2\2\u008f\u0090\7t\2\2\u0090"+
		"\u0091\7c\2\2\u0091\u0092\7{\2\2\u0092\6\3\2\2\2\u0093\u0094\7d\2\2\u0094"+
		"\u0095\7g\2\2\u0095\u0096\7i\2\2\u0096\u0097\7k\2\2\u0097\u0098\7p\2\2"+
		"\u0098\b\3\2\2\2\u0099\u009a\7d\2\2\u009a\u009b\7q\2\2\u009b\u009c\7q"+
		"\2\2\u009c\u009d\7n\2\2\u009d\u009e\7g\2\2\u009e\u009f\7c\2\2\u009f\u00a0"+
		"\7p\2\2\u00a0\n\3\2\2\2\u00a1\u00a2\7e\2\2\u00a2\u00a3\7c\2\2\u00a3\u00a4"+
		"\7u\2\2\u00a4\u00a5\7g\2\2\u00a5\f\3\2\2\2\u00a6\u00a7\7e\2\2\u00a7\u00a8"+
		"\7j\2\2\u00a8\u00a9\7c\2\2\u00a9\u00aa\7t\2\2\u00aa\16\3\2\2\2\u00ab\u00ac"+
		"\7e\2\2\u00ac\u00ad\7q\2\2\u00ad\u00ae\7p\2\2\u00ae\u00af\7u\2\2\u00af"+
		"\u00b0\7v\2\2\u00b0\20\3\2\2\2\u00b1\u00b2\7f\2\2\u00b2\u00b3\7k\2\2\u00b3"+
		"\u00b4\7x\2\2\u00b4\22\3\2\2\2\u00b5\u00b6\7f\2\2\u00b6\u00b7\7q\2\2\u00b7"+
		"\24\3\2\2\2\u00b8\u00b9\7f\2\2\u00b9\u00ba\7q\2\2\u00ba\u00bb\7y\2\2\u00bb"+
		"\u00bc\7p\2\2\u00bc\u00bd\7v\2\2\u00bd\u00be\7q\2\2\u00be\26\3\2\2\2\u00bf"+
		"\u00c0\7g\2\2\u00c0\u00c1\7n\2\2\u00c1\u00c2\7u\2\2\u00c2\u00c3\7g\2\2"+
		"\u00c3\30\3\2\2\2\u00c4\u00c5\7g\2\2\u00c5\u00c6\7p\2\2\u00c6\u00c7\7"+
		"f\2\2\u00c7\32\3\2\2\2\u00c8\u00c9\7h\2\2\u00c9\u00ca\7q\2\2\u00ca\u00cb"+
		"\7t\2\2\u00cb\34\3\2\2\2\u00cc\u00cd\7h\2\2\u00cd\u00ce\7w\2\2\u00ce\u00cf"+
		"\7p\2\2\u00cf\u00d0\7e\2\2\u00d0\u00d1\7v\2\2\u00d1\u00d2\7k\2\2\u00d2"+
		"\u00d3\7q\2\2\u00d3\u00d4\7p\2\2\u00d4\36\3\2\2\2\u00d5\u00d6\7k\2\2\u00d6"+
		"\u00d7\7h\2\2\u00d7 \3\2\2\2\u00d8\u00d9\7k\2\2\u00d9\u00da\7p\2\2\u00da"+
		"\u00db\7v\2\2\u00db\u00dc\7g\2\2\u00dc\u00dd\7i\2\2\u00dd\u00de\7g\2\2"+
		"\u00de\u00df\7t\2\2\u00df\"\3\2\2\2\u00e0\u00e1\7n\2\2\u00e1\u00e2\7c"+
		"\2\2\u00e2\u00e3\7d\2\2\u00e3\u00e4\7g\2\2\u00e4\u00e5\7n\2\2\u00e5$\3"+
		"\2\2\2\u00e6\u00e7\7p\2\2\u00e7\u00e8\7k\2\2\u00e8\u00e9\7n\2\2\u00e9"+
		"&\3\2\2\2\u00ea\u00eb\7q\2\2\u00eb\u00ec\7h\2\2\u00ec(\3\2\2\2\u00ed\u00ee"+
		"\7q\2\2\u00ee\u00ef\7t\2\2\u00ef*\3\2\2\2\u00f0\u00f1\7r\2\2\u00f1\u00f2"+
		"\7t\2\2\u00f2\u00f3\7q\2\2\u00f3\u00f4\7e\2\2\u00f4\u00f5\7g\2\2\u00f5"+
		"\u00f6\7f\2\2\u00f6\u00f7\7w\2\2\u00f7\u00f8\7t\2\2\u00f8\u00f9\7g\2\2"+
		"\u00f9,\3\2\2\2\u00fa\u00fb\7r\2\2\u00fb\u00fc\7t\2\2\u00fc\u00fd\7q\2"+
		"\2\u00fd\u00fe\7i\2\2\u00fe\u00ff\7t\2\2\u00ff\u0100\7c\2\2\u0100\u0101"+
		"\7o\2\2\u0101.\3\2\2\2\u0102\u0103\7t\2\2\u0103\u0104\7g\2\2\u0104\u0105"+
		"\7c\2\2\u0105\u0106\7n\2\2\u0106\60\3\2\2\2\u0107\u0108\7u\2\2\u0108\u0109"+
		"\7g\2\2\u0109\u010a\7v\2\2\u010a\62\3\2\2\2\u010b\u010c\7v\2\2\u010c\u010d"+
		"\7j\2\2\u010d\u010e\7g\2\2\u010e\u010f\7p\2\2\u010f\64\3\2\2\2\u0110\u0111"+
		"\7v\2\2\u0111\u0112\7q\2\2\u0112\66\3\2\2\2\u0113\u0114\7v\2\2\u0114\u0115"+
		"\7{\2\2\u0115\u0116\7r\2\2\u0116\u0117\7g\2\2\u01178\3\2\2\2\u0118\u0119"+
		"\7w\2\2\u0119\u011a\7p\2\2\u011a\u011b\7v\2\2\u011b\u011c\7k\2\2\u011c"+
		"\u011d\7n\2\2\u011d:\3\2\2\2\u011e\u011f\7x\2\2\u011f\u0120\7c\2\2\u0120"+
		"\u0121\7t\2\2\u0121<\3\2\2\2\u0122\u0123\7y\2\2\u0123\u0124\7j\2\2\u0124"+
		"\u0125\7k\2\2\u0125\u0126\7n\2\2\u0126\u0127\7g\2\2\u0127>\3\2\2\2\u0128"+
		"\u0129\7y\2\2\u0129\u012a\7k\2\2\u012a\u012b\7v\2\2\u012b\u012c\7j\2\2"+
		"\u012c@\3\2\2\2\u012d\u012e\7k\2\2\u012e\u012f\7p\2\2\u012f\u0130\7v\2"+
		"\2\u0130\u0131\7g\2\2\u0131\u0132\7t\2\2\u0132\u0133\7h\2\2\u0133\u0134"+
		"\7c\2\2\u0134\u0135\7e\2\2\u0135\u0136\7g\2\2\u0136B\3\2\2\2\u0137\u0138"+
		"\7w\2\2\u0138\u0139\7u\2\2\u0139\u013a\7g\2\2\u013a\u013b\7u\2\2\u013b"+
		"D\3\2\2\2\u013c\u013d\7u\2\2\u013d\u013e\7v\2\2\u013e\u013f\7t\2\2\u013f"+
		"\u0140\7k\2\2\u0140\u0141\7p\2\2\u0141\u0142\7i\2\2\u0142F\3\2\2\2\u0143"+
		"\u0144\7v\2\2\u0144\u0145\7t\2\2\u0145\u0146\7w\2\2\u0146\u0147\7g\2\2"+
		"\u0147H\3\2\2\2\u0148\u0149\7h\2\2\u0149\u014a\7c\2\2\u014a\u014b\7n\2"+
		"\2\u014b\u014c\7u\2\2\u014c\u014d\7g\2\2\u014dJ\3\2\2\2\u014e\u014f\7"+
		"-\2\2\u014fL\3\2\2\2\u0150\u0151\7/\2\2\u0151N\3\2\2\2\u0152\u0153\7,"+
		"\2\2\u0153P\3\2\2\2\u0154\u0155\7\61\2\2\u0155R\3\2\2\2\u0156\u0157\7"+
		"<\2\2\u0157\u0158\7?\2\2\u0158T\3\2\2\2\u0159\u015a\7.\2\2\u015aV\3\2"+
		"\2\2\u015b\u015c\7=\2\2\u015cX\3\2\2\2\u015d\u015e\7<\2\2\u015eZ\3\2\2"+
		"\2\u015f\u0160\7?\2\2\u0160\\\3\2\2\2\u0161\u0162\7>\2\2\u0162\u0163\7"+
		"@\2\2\u0163^\3\2\2\2\u0164\u0165\7>\2\2\u0165`\3\2\2\2\u0166\u0167\7>"+
		"\2\2\u0167\u0168\7?\2\2\u0168b\3\2\2\2\u0169\u016a\7@\2\2\u016ad\3\2\2"+
		"\2\u016b\u016c\7@\2\2\u016c\u016d\7?\2\2\u016df\3\2\2\2\u016e\u016f\7"+
		"*\2\2\u016fh\3\2\2\2\u0170\u0171\7+\2\2\u0171j\3\2\2\2\u0172\u0173\7]"+
		"\2\2\u0173l\3\2\2\2\u0174\u0175\7*\2\2\u0175\u0176\7\60\2\2\u0176n\3\2"+
		"\2\2\u0177\u0178\7_\2\2\u0178p\3\2\2\2\u0179\u017a\7\60\2\2\u017a\u017b"+
		"\7+\2\2\u017br\3\2\2\2\u017c\u017d\7B\2\2\u017dt\3\2\2\2\u017e\u017f\7"+
		"\60\2\2\u017fv\3\2\2\2\u0180\u0181\7}\2\2\u0181x\3\2\2\2\u0182\u0183\7"+
		"\177\2\2\u0183z\3\2\2\2\u0184\u0185\t\2\2\2\u0185\u0186\3\2\2\2\u0186"+
		"\u0187\b>\2\2\u0187|\3\2\2\2\u0188\u0189\7*\2\2\u0189\u018a\7,\2\2\u018a"+
		"\u018e\3\2\2\2\u018b\u018d\13\2\2\2\u018c\u018b\3\2\2\2\u018d\u0190\3"+
		"\2\2\2\u018e\u018f\3\2\2\2\u018e\u018c\3\2\2\2\u018f\u0191\3\2\2\2\u0190"+
		"\u018e\3\2\2\2\u0191\u0192\7,\2\2\u0192\u0193\7+\2\2\u0193\u0194\3\2\2"+
		"\2\u0194\u0195\b?\2\2\u0195~\3\2\2\2\u0196\u019a\7}\2\2\u0197\u0199\13"+
		"\2\2\2\u0198\u0197\3\2\2\2\u0199\u019c\3\2\2\2\u019a\u019b\3\2\2\2\u019a"+
		"\u0198\3\2\2\2\u019b\u019d\3\2\2\2\u019c\u019a\3\2\2\2\u019d\u019e\7\177"+
		"\2\2\u019e\u019f\3\2\2\2\u019f\u01a0\b@\2\2\u01a0\u0080\3\2\2\2\u01a1"+
		"\u01a5\t\3\2\2\u01a2\u01a4\t\4\2\2\u01a3\u01a2\3\2\2\2\u01a4\u01a7\3\2"+
		"\2\2\u01a5\u01a3\3\2\2\2\u01a5\u01a6\3\2\2\2\u01a6\u0082\3\2\2\2\u01a7"+
		"\u01a5\3\2\2\2\u01a8\u01ae\7)\2\2\u01a9\u01aa\7)\2\2\u01aa\u01ad\7)\2"+
		"\2\u01ab\u01ad\n\5\2\2\u01ac\u01a9\3\2\2\2\u01ac\u01ab\3\2\2\2\u01ad\u01b0"+
		"\3\2\2\2\u01ae\u01ac\3\2\2\2\u01ae\u01af\3\2\2\2\u01af\u01b1\3\2\2\2\u01b0"+
		"\u01ae\3\2\2\2\u01b1\u01b2\7)\2\2\u01b2\u0084\3\2\2\2\u01b3\u01b5\4\62"+
		";\2\u01b4\u01b3\3\2\2\2\u01b5\u01b6\3\2\2\2\u01b6\u01b4\3\2\2\2\u01b6"+
		"\u01b7\3\2\2\2\u01b7\u0086\3\2\2\2\u01b8\u01ba\4\62;\2\u01b9\u01b8\3\2"+
		"\2\2\u01ba\u01bb\3\2\2\2\u01bb\u01b9\3\2\2\2\u01bb\u01bc\3\2\2\2\u01bc"+
		"\u01bd\3\2\2\2\u01bd\u01bf\7\60\2\2\u01be\u01c0\4\62;\2\u01bf\u01be\3"+
		"\2\2\2\u01c0\u01c1\3\2\2\2\u01c1\u01bf\3\2\2\2\u01c1\u01c2\3\2\2\2\u01c2"+
		"\u0088\3\2\2\2\13\2\u018e\u019a\u01a5\u01ac\u01ae\u01b6\u01bb\u01c1\3"+
		"\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}