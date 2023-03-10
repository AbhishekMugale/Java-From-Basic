/* Write a program which accepts 2 trings from user and check whether first N contents of two strings are equal or not.

Note : If third parameter is greater than the size of second string then concat whole string after first string.

Input  :  "Marvellous Infosystems"
		  "Marvellous Logic Building"
		  10
		  
Output :  TRUE

*/

import java.util.*;

class StringDemo
{
   public String StrNCatCmpX(String src,String dest,int iCnt)
   {
       
       
       int iCount=0;
       if(iCnt<dest.length())
       {
         for(int i=0;i<iCnt;i++)
          {
           if(src.charAt(i) == dest.charAt(i))
           {
              iCount++;
           }
          }
       }
       else
       {
          return src + " " + dest;  
       }
       
       if(iCount == iCnt)
       {
         return "True";
       }
       else
       {
         return "False";
       }
       
   }
}

class Program35_3
{
   public static void main(String a[])
   {
      Scanner sobj = new Scanner(System.in);
      System.out.println("Enter first string");
      String s1 = sobj.nextLine();
      System.out.println("Enter Second string");
      String s2 = sobj.nextLine();
      System.out.println("Enter the number of characterxs u want to concat");
      int No = sobj.nextInt();
      
      StringDemo obj = new StringDemo();
      String iRet=obj.StrNCatCmpX(s1,s2,No);
      System.out.println(iRet);
   }

}
