/* Write a java program which accept array from user and replace each member with summation of its digit.

Input :   89  687  56  549   87   9
Output :  17  21   11  18    15   9

*/

import java.util.*;

class MyArray 
{
   
    public void ReverseArray(int Arr[])
    {
       int j=0;
       int iDigit=0;
       int temp = 0;
       System.out.println(" Summation of each elements of Array is ");
       for(int i=0;i<Arr.length;i++)
       {
            j=Arr[i];
            while(j!=0)
            {
               iDigit = j%10;
               temp = temp+iDigit;
               j = j/10;
            }
            Arr[i] = temp;
            temp=0;
            
            System.out.println(Arr[i]);
       }           
    }

}

class Program43_2
{
   public static void main(String a[])
   {
      Scanner sobj = new Scanner(System.in);
      System.out.println("Enter the Size of Array");
      int iSize = sobj.nextInt();
      int Arr[] = new int[iSize];
      System.out.println("Enter " +iSize+ " Elements in Array");
      for(int i=0;i<iSize;i++)
      {
         Arr[i] = sobj.nextInt();
      }
      MyArray m1 = new MyArray();
      m1.ReverseArray(Arr);           
   }
}
