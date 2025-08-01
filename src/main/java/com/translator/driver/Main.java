package com.translator.driver;
// adapted by Ioannis Sfyrakis
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

import com.translator.antlr.EropExtractorListener;
import com.translator.antlr.EropPatientAILexer;
import com.translator.antlr.EropPatientAIParser;
import com.translator.antlr.TranslationWriter;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import com.translator.utils.Translator;
import com.translator.utils.VariableFlagger;
import com.translator.utils.VariablesMemory;
import com.translator.utils.XmlLookup;

/**
 *
 */
public class Main {

    public static void main(String[] args) {
        InputStream is = null;

        String inputFP = args[0];
        String outputFP = args[1];

        if (inputFP != null) {
            try {
                is = new FileInputStream(inputFP);
            } catch (FileNotFoundException e) {
                System.err.println("file not found: " + e.toString());
            }
        }

        ANTLRInputStream input = null;
        try {
            input = new ANTLRInputStream(is);
        } catch (IOException e) {
            System.err.println("File does not exist: " + e.toString());
        }

        VariableFlagger flagger = new VariableFlagger();
        VariablesMemory memory = new VariablesMemory();
        TranslationWriter writer = new TranslationWriter(inputFP, outputFP);
        Translator translator = new Translator(memory, writer, new XmlLookup());

        EropPatientAILexer lexer = new EropPatientAILexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        EropPatientAIParser parser = new EropPatientAIParser(tokens);
        ParseTree tree = parser.contractDocument(); // parse
        ParseTreeWalker walker = new ParseTreeWalker(); // create standard walker
        EropExtractorListener extractor = new EropExtractorListener(parser, flagger, memory);
        walker.walk(extractor, tree); // initiate walk of tree with listener

        translator.translate();

        writer.closeWrite();
        System.out.println("Finished writing to file.");
    }

}
