/* Write a program which accept number from user from user and return the difference between summation of even digits and summation of odd digits. 

Input : 2395
Output : -15  (2-17)

Input : 1018
Output : 6    (8-2)

Input : 8440
Output : 16  (16-0)

Input : 5773
Ouput : -18   (0-18)
*/

import java.util.*;

class Digit
{
   public int Count(int iVal)
   { 
       int itemp = 0;
       int iDigit = 0,iCnt=0;
       while(iVal!=0)
       {
          
          iDigit = iVal%10;
          if(iDigit%2 == 0)
          {
             iCnt = iCnt + iDigit;
          }
          else
          { 
             itemp = itemp + iDigit;
          }
          iVal = iVal/10;
       }
       System.out.println();
       return iCnt-itemp;
   }
}

class Program33_5
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
