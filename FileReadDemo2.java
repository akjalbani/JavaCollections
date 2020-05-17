/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Filining;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author AAJ
 */
public class FileReadDemo2 {
    public static void main(String[] args) throws IOException {
       
        int inVal = 0;
        // associate file name with File object
        File infile = new File("sample2.txt");
        
        // point the scanner stream to the file
        Scanner fstream = new Scanner(infile);
        
        System.out.println("File Contents........");
        while(fstream.hasNext()){
            inVal = fstream.nextInt();
            System.out.println(inVal);
        }
        
        fstream.close();
              
    }
    
}
