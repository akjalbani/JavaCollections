/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Filining;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author AAJ
 */
public class WriteTextFileArayList {
    
    public static void main(String[] args) {
        File filename = new File("sampleList.txt");
        ArrayList aList = new ArrayList();
        
        Scanner input = new Scanner(System.in);
        String name =" ";
        while(!name.isEmpty()){
            System.out.println("Enter Friend Name: ");
            name = input.nextLine();
            if (!name.isEmpty())
                aList.add(name);
        }
        try{
            FileWriter fw = new FileWriter(filename);
            Writer output = new BufferedWriter(fw);
            int length = aList.size();
            for(int i =0; i<length; i++){
                output.write(aList.get(i).toString()+"\n");  
            }
            output.close();
        }catch(Exception e){}
    }
}
