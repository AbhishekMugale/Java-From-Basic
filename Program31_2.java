/* Write a java program which accepts strig from user and count number of samll characters.

Input :  "Marvellous"
Output :  9

*/

import java.util.*;

class StringDemo
{
   public int CountSmall(String s)
   {
      int iCnt=0,i=0;
      char Arr[] =s.toCharArray();
      for(i=1;i<Arr.length;i++)
      {
         if((Arr[i]>='a')&&(Arr[i]<='z'))
         {
            iCnt++;
         }
      }
      return iCnt;
   }

}

class Program31_2
{
   public static void main(String a[])
   {
      Scanner sobj = new Scanner(System.in);
      System.out.println("Please Enter String");
      String str = sobj.nextLine();
      StringDemo obj = new StringDemo();
      int iRet = 0;
      iRet = obj.CountSmall(str);
      System.out.println("Total number of small Characters are : "+iRet);
   }
}
