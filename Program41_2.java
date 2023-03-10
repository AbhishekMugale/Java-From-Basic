/*  Write a java program which accept two arrays from user and display 
even contents of each array.

Input :   2   9   6   5    2    3   
         45   6   12  18   23   4
       
       
Output:  2   6   2
         6   12  18   4

*/


import java.util.*;


class MyArray
{
   
     int Arr[];
   public MyArray(int iSize)
   {
      Arr = new int[iSize]; 
   }
   public void Accept()
   {
      Scanner sobj = new Scanner(System.in);
      System.out.println("Enter the " + Arr.length + " Elements in Array");
      
      for(int i=0;i<Arr.length;i++)
      {
         Arr[i] = sobj.nextInt();
      }
   }
   public void DisplayEven()
   {
      System.out.println("The Even Elements in the Array are ");
      for(int i=0;i<Arr.length;i++)
      {
         if(Arr[i]%2==0)
         {
            System.out.println(Arr[i]+"\t");
         }
      }
   }

}


class Program41_2
{
   public static void main(String a[])
   {
      Scanner sobj = new Scanner(System.in);
      System.out.println("Enter the Size of Array ");
      int iNo = sobj.nextInt();
      
      MyArray m1 = new MyArray(iNo);
      m1.Accept();
      m1.DisplayEven();
   }

}
