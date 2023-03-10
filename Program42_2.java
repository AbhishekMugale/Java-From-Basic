/* Write a java program which accept two arrays from user and display minimum element of each array.

Input : 2   9   7   5   2   3   
        9   3   5   5
        
Output: 2    3  
        
*/

import java.util.*;
import Vikram.Prg;

class MyArray extends Vikram.Prg
{
   public MyArray(int m,int n)
   {
      super(m,n);
   }
   public void Minimum()
   {
      int a=0,b=0;
      a = Arr[0];
      b = Brr[0];
      for(int i=0;i<Arr.length;i++)
      {
         
         if(a>Arr[i])
         {
            a = Arr[i];
         }
      }
      System.out.println("The Minimum element from both the arrays are ");
      System.out.print(a+"\t");
      for(int i=0;i<Brr.length;i++)
      {
         if(b>Brr[i])
         {
           b = Brr[i];
         }
      }
      System.out.println(b);
   }
}

class Program42_2
{
   public static void main(String a[])
   {
     Scanner sobj = new Scanner(System.in);
     System.out.println("Enter the Size of First Array");
     int iNo = sobj.nextInt();
     System.out.println("Enter the size of Second Array");
     int iNo1 = sobj.nextInt();
     MyArray m1 = new MyArray(iNo,iNo1);
     m1.Accept();
     m1.Minimum();
   }
   
}

