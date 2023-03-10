/* Write a program which accept number from user from user and return the count of digits in between 3 and 7.

Input : 2395
Output : 1

Input : 1018
Output : 0

Input : -1018
Output : 0

Input : 8462
Ouput : 2
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
          if(iDigit>3&&iDigit<7)
          {
             iCnt++;
          }
          iVal = iVal/10;
       }
       System.out.println();
       return iCnt;
   }
}

class Program33_3
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
