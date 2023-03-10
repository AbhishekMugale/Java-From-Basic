/* Write a java program which accept number of rows and number of columns from user and display below pattern.

Input : iRow = 4   iCol = 3
Output :  1   2   3
          1   2   3
          1   2   3
          1   2   3
*/

import java.util.*;

class Pattern
{
   public void xPattern(int iRow,int iCol)
   {
      
      for(int i=0;i<iRow;i++)
      {
            
         for(int j=1;j<=iCol;j++)
         {          
              System.out.print(j+"\t");     
              
         }
         
         System.out.println();
      }
   }
}

class Program37_2
{
   public static void main(String arr[])
   {
      Scanner sobj = new Scanner(System.in);
      System.out.println("Enter the number of rows ");
      int i = sobj.nextInt();
      System.out.println("Enter the number of col ");
      int j = sobj.nextInt();
      Pattern obj = new Pattern();
      obj.xPattern(i,j);
      
   }

}
