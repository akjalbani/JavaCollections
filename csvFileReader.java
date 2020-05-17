/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Filining;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author AAJ
 */
public class CSVReaderExample {
    public static void main(String[] args) {
        String filename = "test.csv";
        File file = new File(filename);
        try {
            Scanner fstream = new Scanner(file);
            while(fstream.hasNext()){
                String data = fstream.nextLine();
                String [] values= data.split(",");                
                System.out.println(values[0]);
            }
            fstream.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(CSVReaderExample.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
}
