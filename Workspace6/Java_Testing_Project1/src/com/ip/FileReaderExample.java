package com.ip;

import java.io.*;

public class FileReaderExample {
	
   public static void main(String[] args) {
	   
      try {
    	  
         File file = new File("demo.txt");
         FileInputStream fileInputStream = new FileInputStream(file);
         byte[] buffer = new byte[1024];
         int bytesRead = 0;
         
         while ((bytesRead = fileInputStream.read(buffer)) != -1) {
            System.out.print(new String(buffer, 0, bytesRead));
         }
         
         fileInputStream.close();
         
      } catch (FileNotFoundException e) {
         e.printStackTrace();
         
      } catch (IOException e) {
         e.printStackTrace();
      }
      
   }
   
}
