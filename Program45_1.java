/* Write a java program which accept two strings from user and check whether first string is the rotation of second string or not.

Input : abcdefg     cdefgab
Output : True

*/

import java.util.*;

class MyArray
{
   public boolean Check(String s,String s1)
   {
       int iCnt = 0,i=0,j=0;
      for(i=0;i<s.length();i++)
      {
         for(j=0;j<s1.length();j++)
         {
            if(s.charAt(i)==s1.charAt(j))
            {
               iCnt++;
            }
         }
      
      }
      if(iCnt==s.length())
      {
        return true;
      }
      else
      {
         return false;
      }
   }

} 

class Program45_1
{
   public static void main(String arr[])
   {
      Scanner sobj = new Scanner(System.in);
      System.out.println("Enter the first string");
      String s = sobj.nextLine();
      System.out.println("Enter the Second string");
      String s1 = sobj.nextLine();
      MyArray m1 = new MyArray();
      boolean bRet = m1.Check(s,s1);
      if(bRet==true)
      {
         System.out.println("True");
      }
      else
      {
          
         System.out.println("False");
      }
      
      
   }
}
