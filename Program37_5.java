/* Write a java program which accept number of rows and number of columns from user and display below pattern.

Input : iRow = 3   iCol = 4
Output :  1  1  1  1
		  2  2  2  2
		  3  3  3  3
          
*/

import java.util.*;

class Pattern
{
   public void xPattern(int iRow,int iCol)
   {
      
      for(int i=1;i<=iRow;i++)
      {
            
         for(int j=0;j<iCol;j++)
         {          
             
              System.out.print(i+"\t");     
              
             
         }
         
         System.out.println();
      }
   }
}

class Program37_5
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
