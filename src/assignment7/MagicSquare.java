package assignment7;

import java.io.BufferedReader;

import java.io.FileReader;
import java.io.IOException;

public class MagicSquare {
  public static boolean testMagic(String pathName) {
      int lastSum = -1;
      boolean isMagic = true; 
      try {
      FileReader fr = new FileReader(pathName);
      BufferedReader br = new BufferedReader(fr);
      String newLine = br.readLine();
      while(newLine != null) {
          String[] parts = newLine.split("\t");
          System.out.println(parts);
          int sum = 0 ;
          for (String part : parts) {
              // Trim and check if the part is not empty
              if (!part.trim().isEmpty()) {
                  sum += Integer.parseInt(part.trim());
              }
          }
          System.out.println(sum);
          // if this is the first row , remember the first sum 
          if(lastSum ==-1) {
              lastSum = sum;
          }else if(sum != lastSum) {
              isMagic = false; 
              break; 
          }
          
          newLine = br.readLine();
      }
      
      br.close();
      
      
      
      
      }catch(IOException err) {
          System.out.println(err);
      }
      
      return isMagic;
      
  }
    public static void main(String[] args) {
       String fileName = "Luna.txt";
       System.out.println(fileName + " is magic? " + testMagic(fileName));
       
    }
}
