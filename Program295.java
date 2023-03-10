import java.util.*;

/*
   Row = 4
   Col = 4
   
   1  2  3  4 
   5  6  7  8
   9  1  2  3
   4  5  6  7

*/
class Pattern
{
   public void Display(int iRow,int iCol)
   {
       int i=0,j=0;
       int iCnt = 0;
       
        for(i=0;i<iRow;i++)
        {
           for(j=0;j<iCol;j++)
           {
              
              System.out.print((iCnt%9)+1+"\t");
              iCnt++;
           }
           System.out.println();
        }   
   }

}

class Program295
{
   public static void main(String a[])
   {
      Pattern pobj = new Pattern();
      Scanner sobj = new Scanner(System.in);
      
      System.out.println("Enter the Number of rows : ");
      int i = sobj.nextInt();
      
      System.out.println("Enter the Number of Columns : ");
      int j = sobj.nextInt();
      pobj.Display(i,j); 
   
   }

}
