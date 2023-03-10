/* Write a program which accept number of rows and number of rows and number of columns from user and display below pattern.

Input : IRow = 4   iCol = 4

Output :  *   *   *   #
		  *   *   #   @
		  *   #   @   @
	      #   @   @   @

*/

import java.util.*;

class Pattern
{
   public void xPattern(int iRow,int iCol)
   {
     for(int i=iRow;i>0;i--)
     {
        for(int j=1;j<=iCol;j++)
        {
           if(i<j)
           {
              System.out.print("@"+"\t");
           }
           else if(i==j)
           {
              System.out.print("#"+"\t");
           }
           else
           {
              System.out.print("*"+"\t");
           }
        
        }
        System.out.println();
     }
   }
}

class Program40_2
{
   public static void main(String a[])
   {
      Scanner sobj = new Scanner(System.in);
      System.out.println("Enter the number of rows ");
      int iNo = sobj.nextInt();
      System.out.println("Enter the number of Column");
      int No = sobj.nextInt();
      Pattern obj = new Pattern();
      obj.xPattern(iNo,No);
       
   }
}
