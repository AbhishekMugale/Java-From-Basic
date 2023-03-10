/* Write a program which accept number from user from user and return the Multiplication of all digits. 

Input : 2395
Output : 270

Input : 1018
Output : 8

Input : -1018
Output : 8

Input : 9440
Ouput : 144
*/

import java.util.*;

class Digit
{
   public int Count(int iVal)
   { 
       int iDigit = 0,iCnt=1;
       while(iVal!=0)
       {
          
          iDigit = iVal%10;
          if(iDigit == 0)
          {
             iDigit = 1;
          }
          iCnt = iCnt*iDigit;
          iVal = iVal/10;
       }
       System.out.println();
       return iCnt;
   }
}

class Program33_4
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
