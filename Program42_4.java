/* Write a java program which accept two array from user and copy the contents of that array into another array  and return new array.

*/

import java.util.*;
import Vikram.Prg;

class MyArray extends Vikram.Prg
{
   public int Crr[];
   public MyArray(int i,int j)
   {
      super(i,j);
      Crr = new int[i+j];
   }
   public int[] CopyArray()
   {
      int i=0;
      for(i=0;i<Arr.length;i++)
      {
         Crr[i] = Arr[i]; 
      }
      
      for(int j=0;j<Brr.length;j++)
      {
         Crr[i+j] = Brr[j];
      }
      return Crr;
   }
}

class Program42_4
{
   public static void main(String a[])
   {
      Scanner sobj = new Scanner(System.in);
      System.out.println("Enter the size of array1");
      int iSize1 = sobj.nextInt();
      System.out.println("Enter the size of array2");
      int iSize2 = sobj.nextInt();
      
      MyArray m1 = new MyArray(iSize1,iSize2);
      m1.Accept();
      int iRet[] = m1.CopyArray();
      System.out.println();
      for(int i=0;i<iSize1+iSize2;i++)
      {
        System.out.println(iRet[i]);
      }
   }
   
}
