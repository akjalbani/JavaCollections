/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Filining;

import java.io.File;
import java.io.IOException;

/**
 *
 * @author AAJ
 */
public class FileReadingDemo {
    public static void main(String[] args) throws IOException {
        File f = new File("sample.txt");
        if (f.createNewFile())
            System.out.println("File: "+f.getName()+" was created.");
        
        else
            System.out.println("File: "+f.getName()+" could not be created");
   
    }
         
}
