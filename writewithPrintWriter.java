/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Filining;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author jalba
 */
public class writewithPrintWriter {
    public static void main(String[] args) {
        String outFileName;
        String inChoice = null;
        char choice='n';
        int inQty;
        String inDesc;
        Scanner input = new Scanner(System.in);
        try{
            System.out.println("Filename for Inventroy: ");
            outFileName = input.nextLine();
            
            File f = new File(outFileName);
            // use PrintWriter Object to write in file
            
            PrintWriter ofstream = new PrintWriter(f);
            
            do{
                System.out.println("Enter quantity: ");
                inQty = input.nextInt();
                input.nextLine();
                
                System.out.println("Enter description: ");
                inDesc = input.nextLine();
                
                System.out.println("More? (Y/N): " );
                inChoice = input.nextLine();
                choice = inChoice.charAt(0);
                
                writeFileData(inQty,inDesc,ofstream);
                
            }while(choice == 'y' || choice =='Y');
            ofstream.close();
        }catch(IOException e)
        {
            System.out.append("File Error");
        }
    }

    public static void writeFileData(int inQty, String inDescription, PrintWriter outstream) {
    
        outstream.printf("%5d %20s%n", inQty, inDescription);
    }
}
