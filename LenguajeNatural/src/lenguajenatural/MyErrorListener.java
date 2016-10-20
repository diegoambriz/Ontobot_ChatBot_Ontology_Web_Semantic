/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lenguajenatural;

/**
 *
 * @author Basu
 */
import java.util.BitSet;
import org.antlr.v4.runtime.BaseErrorListener;
import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;
import org.antlr.v4.runtime.atn.ATNConfigSet;
import org.antlr.v4.runtime.dfa.DFA;

/**
 *
 * @author Basu
 */
public class MyErrorListener extends BaseErrorListener {
    public boolean error = false;
    @Override
    public void syntaxError(Recognizer<?,?> recognizer,
               Object offendingSymbol,
               int line,
               int charPositionInLine,
               String msg,
               RecognitionException e)
    {
        System.out.println("Lo siento, no te entiendo syntax error");
        error = true;
    }
    
    @Override
    public void reportAmbiguity(Parser recognizer,
                   DFA dfa,
                   int startIndex,
                   int stopIndex,
                   boolean exact,
                   BitSet ambigAlts,
                   ATNConfigSet configs)
    {
        System.out.println("Lo siento, no te entiendo report ambiguity");
    }
    
    @Override
    public void reportAttemptingFullContext(Parser recognizer,
                               DFA dfa,
                               int startIndex,
                               int stopIndex,
                               BitSet conflictingAlts,
                               ATNConfigSet configs)
    {
        System.out.println("Lo siento, no te entiendo report attemping full context");
    }
    
    @Override
    public void reportContextSensitivity(Parser recognizer,
                            DFA dfa,
                            int startIndex,
                            int stopIndex,
                            int prediction,
                            ATNConfigSet configs)
    {
        System.out.println("Lo siento, no te entiendo report context sensitivity");
    }
}

