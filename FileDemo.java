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
 * @author Akhtar jalbani
 */
public class FileDemo {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        File file1, file2, file3, file4, file5, file6;
        File dir1;
        String parent;
        String path;

        file1 = new File(".");
        path = file1.getAbsolutePath();
        parent = path.substring(0,path.length()-1);
        
        file2 = new File(parent);
        displayFileInfo(file2);
        displayFilesInDir(file2);

                
    }
    
    
    
     public static void displayFileInfo(File aFile) {
      System.out.println("Information on file: " + aFile);
      System.out.println("aFile.toString() = " + aFile.toString());
      System.out.println("aFile.getName() = " + aFile.getName());
      System.out.println("aFile.getPath() = " + aFile.getPath());
      System.out.println("aFile.getAbsolutePath() = " + aFile.getAbsolutePath());
      System.out.println("aFile.getParent() = " + aFile.getParent());
      System.out.println("aFile.isFile() = " + aFile.isFile());
      System.out.println("aFile.isDirectory() = " + aFile.isDirectory());
      System.out.println("aFile.isAbsolute() = " + aFile.isAbsolute());
      System.out.println("aFile.exists() = " + aFile.exists());
      System.out.println("aFile.isHidden() = " + aFile.isHidden());
      System.out.println("aFile.length() = " + aFile.length() + " bytes");
      System.out.println("aFile.lastModified() = " + aFile.lastModified());
      System.out.println("aFile.canRead() = " + aFile.canRead());
      System.out.println("aFile.canWrite() = " + aFile.canWrite());
      System.out.println();

   }
     
    public static void displayFilesInDir(File aFile) {
      String[] filesInDir;
      filesInDir = aFile.list();
      System.out.println();
      System.out.println("Files in Directory: " + aFile.getAbsolutePath());
      if (aFile.isDirectory()) {
         for (int i = 0; i < filesInDir.length; i++)
            System.out.println(filesInDir[i]);
      }else
         System.out.println("Not a directory");
      System.out.println();
   }
}
