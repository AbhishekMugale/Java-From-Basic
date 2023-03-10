/* Accept string from user and reverse the cotents of the string by toggling the case.

Input  : "aCBdef"
Output : "FEDcbA"

*/

import java.util.*;

class StringDemo
{
   public String strRevTog(String str)
   {
       String iRet = "";
       char Arr[] = str.toCharArray();
       for(int i=Arr.length-1;i>-1;i--)
       {
          if(Arr[i]>='a'&&Arr[i]<='z')
          {
             Arr[i] -= 32;
          }
          else
          {
             Arr[i] += 32; 
          }
          iRet = iRet + Arr[i];
       }
       return iRet;
   }
   
}

class Program35_4
{
   public static void main(String a[])
   {
      Scanner sobj = new Scanner(System.in);
      System.out.println("Enter the String");
      String s = sobj.nextLine();
      StringDemo obj = new StringDemo();
      String iRet = obj.strRevTog(s);
      System.out.println(iRet); 
   
   }
}
