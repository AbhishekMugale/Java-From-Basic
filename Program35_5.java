/* Accept string from user and check whether the string is palindrome or not without considering its case.

Input  :  "1abccBA1"
		  
Output :  TRUE

*/

import java.util.*;

class StringDemo
{
  public boolean StrPalindrome(String str)
  {
       char Arr[] = str.toCharArray();
       boolean bflag = true;
       int iEnd=Arr.length-1;
       int iStart = 0;
    for(int i=0;i<Arr.length;i++)
    {
      if((Arr[i]>='A'&&Arr[i]<='Z'))
      {
         Arr[i] += 32;
      } 
      if(Arr[iEnd]>='A'&&Arr[iEnd]<='Z')
      {
         Arr[iEnd] +=32;
      }
      if(Arr[iStart]!=Arr[iEnd])
      {
         bflag = false;
         break;
      } 
      iStart++;
      iEnd--;
    }
   return bflag;
   }
}

class Program35_5
{
   public static void main(String a[])
   {
      Scanner sobj = new Scanner(System.in);
      System.out.println("Enter first string");
      String s1 = sobj.nextLine();
     
      
      StringDemo obj = new StringDemo();
      boolean bRet=obj.StrPalindrome(s1);
     
      System.out.println(bRet);
   }

}
