/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Filining;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

/**
 *
 * @author AAJ
 */
public class writeWithBuffered {

    public static void main(String[] args) {
        String lineOfText;
        BufferedReader inFile;
        BufferedWriter outFile;
        try {

            FileReader infilename = new FileReader("sample3.txt");
            FileWriter outfilename = new FileWriter("sample4.txt");
            inFile = new BufferedReader(infilename);
            outFile = new BufferedWriter(outfilename);

            lineOfText = inFile.readLine();
                        
            while (lineOfText != null) {

                //System.out.println(lineOfText + "\n");
                outFile.write(lineOfText + "\n");
                lineOfText = inFile.readLine();
            }
            inFile.close();
            outFile.close();
        } catch (Exception e) {
            e.printStackTrace();
            System.out.append("File Error");
        }
    }
}
