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
   
     int Arr[],Brr[];
   public MyArray(int iSize,int no)
   {
      Arr = new int[iSize];
      Brr = new int[no]; 
   }
   public void Accept()
   {
      Scanner sobj = new Scanner(System.in);
      System.out.println("Enter the " + Arr.length + " Elements in Array1");
      
      for(int i=0;i<Arr.length;i++)
      {
         Arr[i] = sobj.nextInt();
      }
      
      System.out.println("Enter the " + Brr.length + " Elements in Array2");
      
      for(int i=0;i<Brr.length;i++)
      {
         Brr[i] = sobj.nextInt();
      }
   }
   public void DisplayOdd()
   {
      System.out.println("The Odd Elements in the Array are ");
      for(int i=0;i<Arr.length;i++)
      {
         if(Arr[i]%2!=0 )
         {
            System.out.println(Arr[i]+"\t");
         }
      }
      System.out.println();
      for(int j=0;j<Brr.length;j++)
      {
         if(Brr[j]%2!=0)
         {
             System.out.println(Brr[j]+"\t");
         }
      }
      System.out.println();
   }

}


class Program41_3
{
   public static void main(String a[])
   {
      Scanner sobj = new Scanner(System.in);
      System.out.println("Enter the Size of Array1 ");
      int iNo = sobj.nextInt();
      
      System.out.println("Enter the Size of Array2 ");
      int iNo1 = sobj.nextInt();
      
      MyArray m1 = new MyArray(iNo,iNo1);
      m1.Accept();
      m1.DisplayOdd();
   }

}
