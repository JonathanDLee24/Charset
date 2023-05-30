/*
Program request: Geoffrey Akerlund
Write a program that returns all 256 ASCII characters (with their integer values) 
in a formatted 16 by 16 table. Print the cumulative sum of all the values after the table.

Author: Jonathan Lee
Professor: Gita Faroughi
Class: CSCI12
Date: March 26 2021

*/
import java.util.*;
import java.nio.charset.Charset;
public class Ascii
{
   public static void main (String args[])
   {
      intro();
   }


   public static void intro()
   {
      for (char i = 32; i <= 255; i+=0)
      {
         for(int j = 0; j<=16; j++)
         {
            if(i>=127 && i<161)
            {
               System.out.print("na");
               System.out.print((i)-0+"\t");
               i++;
               continue;
            }
            System.out.print(i+":");
            System.out.print((i)-0+"\t");
            i++;
         }
         System.out.println();
         System.out.println();
      }
      Charset o = Charset.defaultCharset();
      System.out.println("\nThe default charset of the machine is :" + o.displayName());
   
   }
}
