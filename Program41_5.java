/* Write a java program which accept two arrays from user and display Summation of each array.

Input : 2   9   7   5   2   3   
        9   3   5   5
        
Output: 28    22  
        
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
   public void DisplaySum()
   {
      System.out.println("The  Sum of Elements in the Both Array are ");
       int iSum = 0;
      for(int i=0;i<Arr.length;i++)
      {
        iSum =iSum+Arr[i];      
      }
      System.out.print(iSum+"\t");
      int iNum = 0;
      for(int j=0;j<Brr.length;j++)
      {
          iNum = iNum + Brr[j];
      }
      System.out.print(iNum+"\t");
      System.out.println();
   }

}


class Program41_5
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
      m1.DisplaySum();
   }

}
