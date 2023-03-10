/* Write a java program which accept number of rows and number of columns from user and display below pattern.

Input : iRow = 4   iCol = 4
Output :  *   *   *   #
		  *   *   #   *
		  *   #   *   *
	      #   *   *   *
          
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
             if(i==j)
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

class Program40_1
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
