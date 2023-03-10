/* Write a java program which accept String from user and display below pattern.

Input : Hello
Output :  H  e  l  l  o
		  H  e  l  l  
		  H  e  l  
		  H  e  
          H
*/

import java.util.*;

class Pattern
{
   public void xPattern(String str)
   {
       
      for(int i=str.length();i>0;i--)
      {
            
         for(int j=0;j<str.length();j++)
         {          
              if(i>j)
              {
               System.out.print(str.charAt(j)+"\t");      
              }
         }
         
         System.out.println();
      }
   }
}

class Program38_2
{
   public static void main(String arr[])
   {
      Scanner sobj = new Scanner(System.in);
      System.out.println("Enter the Stirng");
      String i = sobj.nextLine();
      
      Pattern obj = new Pattern();
      obj.xPattern(i);
      
   }

}
