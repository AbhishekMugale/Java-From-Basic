/* Write a java program which accept number of rows and number of columns from user and display below pattern.

Input : iRow = 3    iCol = 4
Output : 1   2   3   4
		 5   6   7   8
		 9  10  11   12

*/

import java.util.*;

class Pattern
{
   public void xPattern(int iRow,int iCol)
   {
      int iCnt = 1;
      for(int i=0;i<iRow;i++)
      {
            
         for(int j=0;j<iCol;j++)
         {          
              System.out.print(iCnt+"\t");     
              iCnt++;
         }
         
         System.out.println();
      }
   }
}

class Program36_5
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
