/* Write a java program which accept two arrays from user and display contents of each array.

Input : 2   9   7   5   2   3   
        9   3   5   5
        
Output: 2   9   7   5   2   3   
        9   3   5   5
        
*/


import java.util.*;


class MyArray
{
   public void Display(int Arr1[],int Arr2[])
   {
       System.out.println("Elements in Array1 ");
       for(int i=0;i<Arr1.length;i++)
       {
          System.out.print(Arr1[i]+"\t");
       }
       System.out.println("Elements in Array2 ");
       for(int i=0;i<Arr2.length;i++)
       {
          System.out.print(Arr2[i]+"\t");
       }
       
   }
}

class Program41_1
{
   public static void main(String ar[])
   {
     Scanner sobj = new Scanner(System.in);
     System.out.println("Enter the size of array1");
     int iNo = sobj.nextInt(); 
     System.out.println("Enter " + iNo + " Elements in Array1 ");
     int Arr1[] = new int[iNo];
     for(int i=0;i<iNo;i++)
     {
        Arr1[i] = sobj.nextInt();
     }
     System.out.println("Enter the size of array2");
     int iNo1 = sobj.nextInt();
     System.out.println("Enter " + iNo1 + " Elements is Array2");
     int Arr2[] = new int[iNo1];
     for(int j=0;j<iNo1;j++)
     {
       Arr2[j] = sobj.nextInt();
     }
     MyArray m1 = new MyArray();
     m1.Display(Arr1,Arr2);
   }

}        
