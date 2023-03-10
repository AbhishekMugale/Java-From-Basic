/*  Write a java program which accept two arrays from user and form new array which is combination of contents of first and second array.

Input :   12   57    28    3   
          99   23    54   58   6    67
        
       
Output:  12   57    28    3    99   23    54   58   6    67   
          

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
      System.out.println("The Elements in the Both Array are ");
      for(int i=0;i<Arr.length;i++)
      {
         
            System.out.print(Arr[i]+"\t");
         
      }
      
      for(int j=0;j<Brr.length;j++)
      {
          System.out.print(Brr[j]+"\t");
      }
      System.out.println();
   }

}


class Program41_4
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
