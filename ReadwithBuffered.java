/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Filining;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Scanner;

/**
 *
 * @author AAJ
 */
public class ReadwithBuffered {

    public static void main(String[] args) {
        String lineOfText;
        
        try {

            FileReader filename = new FileReader("sample3.txt");
            BufferedReader inFile = new BufferedReader(filename);
            lineOfText = inFile.readLine();
            System.out.println("File Contents....");
            System.out.println("Student ID " + " " + " FirstName" + " " + "LastName");
            while (lineOfText != null) {

                System.out.println(lineOfText + "\n");
                lineOfText = inFile.readLine();
            }
            inFile.close();
        } catch (Exception e) {
            e.printStackTrace();
            System.out.append("File Error");
        }
    }
}
