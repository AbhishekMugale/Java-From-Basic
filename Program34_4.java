/*  Write a java program which accept N numbers from user and accept Range, Display all elements from that range

Input :   N  :  6
         Start  :  60
         End    :  90
         
      Elements :  85  66   3   76  93  88

Output : 66  76  88


Input :   N  :  6
         Start  :  30
         End    :  50
         
      Elements :  85  66   3   76  93  88

Output : 


*/

import java.util.*;
import Marvellous.Program34_2a;

class Number extends Marvellous.Program34_2a
{
   public Number(int iLength)
   {
      super(iLength);
   }
   public void DisplayRange(int iStart,int iEnd)
   {
      for(int i=0;i<Arr.length;i++)
      {
         if(Arr[i]>iStart&&Arr[i]<iEnd)
         {
            System.out.print(Arr[i]+"\t");
         }
      }
   }
}


class Program34_4
{
   public static void main(String a[])
   {
      Scanner sobj = new Scanner(System.in);
      System.out.println("Enter the size : ");
      int iSize = sobj.nextInt();
      Number n1 = new Number(iSize);
      n1.Accept();
      System.out.println("Enter the start element from where the search begins : ");
      int iStart = sobj.nextInt();
      System.out.println("Enter the End element from  the search ends ");
      int iEnd = sobj.nextInt();
      n1.DisplayRange(iStart,iEnd);
   }
}
