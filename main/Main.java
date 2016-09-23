package main;
import java.io.*;
import lexer.*;
import parser.*;

public class Main {
    public static void main(String[] args) throws IOException {

        Lexer lex;

        if(args.length == 0) {
            System.out.println("error: no input files");
            lex = new Lexer();
        } else {
            File file = new File(args[0]);
            FileInputStream fs = new FileInputStream(file);
            if(file == null || fs == null) {
                System.out.println("error: can not open file");
            } else {
                System.out.println("reading file...");
            }
            lex = new Lexer(fs);
        }

        Parser parser = new Parser(lex);
        parser.program();

        System.out.write('\n');
    }
}
