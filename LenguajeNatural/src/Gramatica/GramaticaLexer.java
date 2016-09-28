// Generated from Gramatica.g4 by ANTLR 4.5.3
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class GramaticaLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.5.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		DT=1, N=2, V=3, P=4, WS=5;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"DT", "N", "V", "P", "WS"
	};

	private static final String[] _LITERAL_NAMES = {
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "DT", "N", "V", "P", "WS"
	};
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


	public GramaticaLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Gramatica.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\7F\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\3\2\3\2\3\2\3\2\3\2\5\2\23\n\2\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\5\3*\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4\65\n\4\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\5\5>\n\5\3\6\6\6A\n\6\r\6\16\6B\3\6\3\6\2\2\7\3\3"+
		"\5\4\7\5\t\6\13\7\3\2\3\5\2\13\f\17\17\"\"L\2\3\3\2\2\2\2\5\3\2\2\2\2"+
		"\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\3\22\3\2\2\2\5)\3\2\2\2\7\64\3\2\2"+
		"\2\t=\3\2\2\2\13@\3\2\2\2\r\16\7g\2\2\16\23\7n\2\2\17\20\7n\2\2\20\21"+
		"\7q\2\2\21\23\7u\2\2\22\r\3\2\2\2\22\17\3\2\2\2\23\4\3\2\2\2\24\25\7j"+
		"\2\2\25\26\7q\2\2\26\27\7o\2\2\27\30\7d\2\2\30\31\7t\2\2\31*\7g\2\2\32"+
		"\33\7c\2\2\33\34\7o\2\2\34\35\7k\2\2\35\36\7i\2\2\36\37\7q\2\2\37*\7u"+
		"\2\2 !\7e\2\2!\"\7c\2\2\"#\7h\2\2#*\7g\2\2$%\7n\2\2%&\7g\2\2&\'\7e\2\2"+
		"\'(\7j\2\2(*\7g\2\2)\24\3\2\2\2)\32\3\2\2\2) \3\2\2\2)$\3\2\2\2*\6\3\2"+
		"\2\2+,\7v\2\2,-\7q\2\2-.\7o\2\2.\65\7c\2\2/\60\7v\2\2\60\61\7q\2\2\61"+
		"\62\7o\2\2\62\63\7c\2\2\63\65\7p\2\2\64+\3\2\2\2\64/\3\2\2\2\65\b\3\2"+
		"\2\2\66\67\7e\2\2\678\7q\2\28>\7p\2\29:\7u\2\2:;\7q\2\2;<\7n\2\2<>\7q"+
		"\2\2=\66\3\2\2\2=9\3\2\2\2>\n\3\2\2\2?A\t\2\2\2@?\3\2\2\2AB\3\2\2\2B@"+
		"\3\2\2\2BC\3\2\2\2CD\3\2\2\2DE\b\6\2\2E\f\3\2\2\2\b\2\22)\64=B\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}