/* Write a java program which accept two array from user and copy the contents of that array into another array in reverse order and return new array.

*/

import java.util.*;
import Vikram.Prg;


class MyArray extends Vikram.Prg
{
    public int Crr[];
    public int k=0;
    public MyArray(int i,int j)
    {
       super(i,j);
       k=i+j;
       Crr = new int[k];
    }
    public int[] CopyArrRev()
    {
       int i=0;       
       
       for(int j=Brr.length-1;j>-1;j--)
       {
          Crr[i] = Brr[j]; 
          i++;
       }
       for(k=Arr.length-1;k>-1;k--)
       {
          Crr[i] = Arr[k];
          i++;
       }
       return Crr;
       
    } 
}

class Program42_3
{
   public static void main(String ar[])
   {
      Scanner sobj = new Scanner(System.in);
      System.out.println("Enter the size of array1");
      int iSize1 = sobj.nextInt();
      System.out.println("Enter the size of array2");
      int iSize2 = sobj.nextInt();
      
      MyArray m1 = new MyArray(iSize1,iSize2);
      m1.Accept();
      int iRet[] = m1.CopyArrRev();
      System.out.println();
      for(int i=0;i<iSize1+iSize2;i++)
      {
        System.out.println(iRet[i]);
      }
   }

}
