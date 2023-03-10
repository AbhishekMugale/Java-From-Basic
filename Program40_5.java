/* Write a program which accept number of rows and number of rows and number of columns from user and display below pattern.

Input : iRow = 4   iCol = 5

Output :  1  2  3  4  5
          1  2        5 
          1     3     5
          1        4  5

*/

import java.util.*;

class Pattern
{
   public void xPattern(int iRow,int iCol)
   {
     for(int i=1;i<=iRow;i++)
     {
        for(int j=1;j<=iCol;j++)
        {
           if(i==1||j==1||j==iCol)
           {
              System.out.print(j+"\t");
           }
           else if(i==j)
           {
              System.out.print(i+"\t");
           }
           else
           {
              System.out.print("\t");
           }
           
        }
        System.out.println();
     }
   }
}

class Program40_5
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
