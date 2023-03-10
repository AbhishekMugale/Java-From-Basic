/* Write a program which accept n numbers from user and accept one another number as NO, return index of first occurence of that NO.

Input :   N  :  6
         No  :  66
         
      Elements :  85  66   3   66  93  88

Output : 1


Input :   N  :  6
         No  :  12
         
     Elements :  85  66   3   66  93  88

Output : -1

*/


import java.util.*;
import Marvellous.Program34_2a;


class Number extends Marvellous.Program34_2a
{
   int iCnt=0;
   public Number(int iSize)
   {
      super(iSize);
   }
   public int Check(int No)
   {
      for(int i=0;i<Arr.length;i++)
      {
         if(Arr[i]==No)
         {
            iCnt = i;
            break;
         }
      }
      if(iCnt!=0)
      {
       return iCnt;
      }
      else
      {
        return -1;
      }
    }
}

class Program34_2
{
   public static void main(String a[])
   {
      Scanner sobj = new Scanner(System.in);
      System.out.println("Enter the number of elements u want : ");
      int iSize = sobj.nextInt();
      Number n1 = new Number(iSize);
      n1.Accept();
      System.out.println("Enter the element u want to search ");
      int iNo = sobj.nextInt();
      n1.Display();
      int iRet = n1.Check(iNo);
      System.out.println(iRet);
      
   }
}
