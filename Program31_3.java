/*Write a java program which accept string from user and return difference between frequency of small characters and frequency of capital characters.

Input : " MarvellouS" 
Output : 6  (8-2)

*/

import java.util.*;

class StringDemo
{
   public int CountDiff(String s)
   {
      int i=0,iCnt=0,j=0;
      for(iCnt=0;iCnt<s.length();iCnt++)
      {
         if((s.charAt(iCnt)>='a')&&(s.charAt(iCnt)<='z'))
         {
            i++;
         }
         else
         {
            j++;
         }
      }
      return i-j;
   }
}


class Program31_3
{
   public static void main(String ar[])
   {
      Scanner sobj = new Scanner(System.in);
      System.out.println("Enter the String ");
      String s = sobj.nextLine();
      int iRet = 0;
      
      StringDemo obj = new StringDemo();
      
      iRet = obj.CountDiff(s);
      System.out.println("Difference between small and capital letters is : "+iRet);
   }

}
