/* Write a java program which accept String from user and display below pattern.

Input : Hello
Output :  H  #  #  #  #
		  H  e  #  #  # 
		  H  e  l  #  #
		  H  e  l  l  #
          H  e  l  l  o
*/

import java.util.*;

class Pattern
{
   public void xPattern(String str)
   {
      for(int i=0;i<str.length();i++)
      {
            
         for(int j=0;j<str.length();j++)
         {          
              if(i>=j)
              {
               System.out.print(str.charAt(j)+"\t");
              }
              else
              {
                 System.out.print("#"+"\t");
              }     
         }
         
         
         System.out.println();
      }
   }
}

class Program39_3
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
