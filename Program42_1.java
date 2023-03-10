/* Write a java program which accept two arrays from user and display the difference between Summation of arrays.

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
   public int DisplayDiffernce()
   {
      System.out.println("The  Difference between Summation of two Arrays is ");
       int iSum = 0;
      for(int i=0;i<Arr.length;i++)
      {
        iSum =iSum+Arr[i];      
      }

      int iNum = 0;
      for(int j=0;j<Brr.length;j++)
      {
          iNum = iNum + Brr[j];
      }
      return iSum-iNum;
   }

}


class Program42_1
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
      int iRet = m1.DisplayDiffernce();
      System.out.println(iRet);
   }

}
