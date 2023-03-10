/* Write a program which accepts 2 trings from user and check whether contents of two strings are equal or not.

Input  :  "Marvellous Infosystems"
		  "Marvellous Infosystems"
		  
Output :  TRUE

*/

import java.util.*;

class StringDemo
{
   public boolean StrCmpX(String src,String dest)
   {
       int iRet = src.length();
       int bRet = dest.length();
       int iCnt=0;
       if(src.length()==dest.length())
       {
         for(int i=0;i<iRet;i++)
          {
           if(src.charAt(i) == dest.charAt(i))
           {
              iCnt++;
           }
          }
       }
       if(bRet == iCnt)
       {
         return true;
       }
       else
       {
         return false;
       }
       
   }
}

class Program35_2
{
   public static void main(String a[])
   {
      Scanner sobj = new Scanner(System.in);
      System.out.println("Enter first string");
      String s1 = sobj.nextLine();
      System.out.println("Enter Second string");
      String s2 = sobj.nextLine();
      
      StringDemo obj = new StringDemo();
      boolean bRet=obj.StrCmpX(s1,s2);
     
      System.out.println(bRet);
   }

}
