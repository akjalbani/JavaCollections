/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Filining;

import java.io.File;
import java.util.Scanner;

/**
 *
 * @author jalba
 */
public class FileReadinfDemo3 {
    public static void main(String[] args) {
        int inVal = 0;
        int id = 0;
        String firstname;
        String lastname;
        try{    
            File infile = new File("sample3.txt");
            Scanner fstream = new Scanner(infile);
        
            System.out.println("File Contents....");
            System.out.println("Student ID "+ " "+" FirstName" +" "+ "LastName");
            while(fstream.hasNext()){
                id = fstream.nextInt();
                firstname = fstream.next();
                lastname = fstream.next();
                
                System.out.println(id+" "+firstname+" "+lastname);
            }
        }catch(Exception e)
    {
        e.printStackTrace();
        System.out.append("File Error");
    }
        
    }
}
