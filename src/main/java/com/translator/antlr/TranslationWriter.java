package com.translator.antlr;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

//import com.translator.gui.GuiFrame;

public class TranslationWriter {

    //private String inputFilePath;
    private final File outputFile;
    private BufferedWriter bw;
    private FileWriter fw;


    public TranslationWriter(String inputFilePath) {
        //this.inputFilePath = inputFilePath;
        this.outputFile = new File(createOutputFilepath(inputFilePath));
        try {
            this.fw = new FileWriter(outputFile.getAbsoluteFile(), true);
            this.bw = new BufferedWriter(fw);
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public TranslationWriter(String inputFilePath, String outputFilePath) {
        //this.inputFilePath = inputFilePath;
        this.outputFile = new File(outputFilePath);
        try {
            this.fw = new FileWriter(outputFile.getAbsoluteFile(), true);
            this.bw = new BufferedWriter(fw);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    private String createOutputFilepath(String inputFilePath) {
        String[] filePathAndExtension = inputFilePath.split("\\."); // escape .
        String translationFilePath = filePathAndExtension[0] + "TRANSLATION.txt";

        return translationFilePath;
    }

    public void writeToTranslationFile(String content) {
        try {
            // if file doesnt exists, then create it
            if (!outputFile.exists()) {
                outputFile.createNewFile();
            }
            bw.write(content);

            //System.out.println("Done");

        } catch (IOException e) {

            e.printStackTrace();
        }
    }

    public void writeNewLine() {
        try {
            // if file doesnt exists, then create it
            if (!outputFile.exists()) {
                outputFile.createNewFile();
            }
            bw.newLine();

            //System.out.println("Done");

        } catch (IOException e) {

            e.printStackTrace();
        }
    }


    public void closeWrite() {
        try {
            bw.close();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
