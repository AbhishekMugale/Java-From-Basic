/* Write a program which accept number from user from user and return the count of even digits.

Input : 2395
Output : 1

Input : 1018
Output : 2

Input : -1018
Output : 2

Input : 8462
Ouput : 4
*/

import java.util.*;

class Digit
{
   public int Count(int iVal)
   { 
       int iDigit = 0,iCnt=0;
       while(iVal!=0)
       {
          iDigit = iVal%10;
          if(iDigit%2==0)
          {
             iCnt++;
          }
          iVal = iVal/10;
       }
       System.out.println();
       return iCnt;
   }
}

class Program33_1
{
   public static void main(String a[])
   {
       Scanner sobj = new Scanner(System.in);
       
       System.out.println("Enter a number ");
       int iNum = sobj.nextInt();
       
       Digit a1 = new Digit();
       int iRet = a1.Count(iNum);
       System.out.println(iRet);
   }
}
