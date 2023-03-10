/* Write a java program which accept string from user and print frequency of each word.

Input :  India is Demo India Hello Demo
Output : India    2
		 is 	  1
		 Demo	  2
		 Hello	  1
*/

import java.util.*;

class MyArray
{
   public void Freq(String s)
   {
       int iCnt = 0,i=0,j=0;
      for(i=0;i<s.length();i++)
      {
         for(j=i+1;j<s.length();j++)
         {
            if(s.charAt(i)==s.charAt(j))
            {
               iCnt++;
            }
         }
         System.out.println(s.charAt(i)+""+iCnt);
         iCnt = 0;
      }
      
   }

} 

class Program45_2
{
   public static void main(String arr[])
   {
      Scanner sobj = new Scanner(System.in);
      System.out.println("Enter the first string");
      String s = sobj.nextLine();
      
      MyArray m1 = new MyArray();
      m1.Freq(s);
      
      
      
   }
}
