/* how to add antlr to intellij:
download jar from antlr website
click PPM on antlr folder, Open Module Settings -> Dependencies -> (+) -> Jar on dependencies -> (find the jar)
 */
package main.antrl4;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.*;

import static org.antlr.v4.runtime.CharStreams.fromStream;

public class PaspyTranspiler {

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("program.py"));
        String fileName = "D:\\studia\\s6\\kompilatory\\kompilatory\\transpiler\\antlr\\paspy\\src\\main\\examples\\helloworld.pas";
        File input = new File(fileName);
        InputStream inputStream = new FileInputStream(input);
        tokens.pascalTokens tokenizer = new tokens.pascalTokens(fromStream(inputStream));

        CommonTokenStream tokens = new CommonTokenStream(tokenizer);
        PascalGrammar parser = new PascalGrammar(tokens);
        ParseTree tree = parser.program();
        ParseTreeWalker walker = new ParseTreeWalker();
        walker.walk(new PascalGrammarBaseListener(bufferedWriter), tree);
        bufferedWriter.close();
    }
}
