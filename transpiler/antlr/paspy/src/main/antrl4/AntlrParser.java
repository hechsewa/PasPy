/* how to add antlr to intellij:
download jar from antlr website
click PPM on antlr folder, Open Module Settings -> Dependencies -> (+) -> Jar on dependencies -> (find the jar)
 */

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

import java.io.IOException;

public class AntlrParser {

    public static void main(String []args) throws IOException {
        CharStream charstream = CharStreams.fromFileName("/home/hushmans/Dokumenty/studia/s6/kompilatooor/kompilatory/transpiler/antlr/paspy/src/main/examples/helloworld.pas");
        pascalLexer lex = new pascalLexer(charstream);
        CommonTokenStream token = new CommonTokenStream(lex);
        pascalParser parse = new pascalParser(token);

        parse.getBuildParseTree();
    }
}
