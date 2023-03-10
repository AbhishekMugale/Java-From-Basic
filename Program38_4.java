/* Write a java program which accept String from user and display below pattern.

Input : Hello

Output :  H  e  l  l  o
		  H  e  l  l  
		  H  e  l  
		  H  e  
          H  
		  H  e   
		  H  e  l  
		  H  e  l  l  
          H  e  l  l  o
*/

import java.util.*;

class Pattern
{
   public void xPattern(String str)
   {
      
      for(int i=str.length();i>1;i--)
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
      for(int i=0;i<str.length();i++)
      {
            
         for(int j=0;j<=i;j++)
         {          
              System.out.print(str.charAt(j)+"\t");      
         }
         
         System.out.println();
      }
   }
}

class Program38_4
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
