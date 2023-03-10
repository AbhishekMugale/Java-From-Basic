/* Write a java program which accept string from user and display it in in reverse order.

Input : "MarvellouS"
Output : "SuollevraM"

*/

import java.util.*;

class StringDemo
{
   public void Reverse(String s)
   {   
       int i= 0; 
       char Arr[] = s.toCharArray();
       for(i = (Arr.length)-1;i>-1;i--)
       {
           System.out.print(Arr[i]);
       }
       System.out.println();
   }
}
class Program31_5
{
   public static void main(String a[])
   {
      Scanner sobj = new Scanner(System.in);
      System.out.println("Enter the string : ");
      String s = sobj.nextLine();
      
      StringDemo obj = new StringDemo();
      
      obj.Reverse(s);
   }
}
