/* Write java Program which accept N numbers from user and display all such elements which are  multiples of 11.

Input : N : 6
     Elements : 85  66  3  55  93   88
Output : 66  55   88 

*/

import java.util.*;

class ArrayDemo
{
   public int Arr[];
   public ArrayDemo(int iSize)
   {
      Arr = new int[iSize];
   }
   public void Accept()
   {
       Scanner sobj = new Scanner(System.in);
       System.out.println("Enter "+ Arr.length + "elements in array");
       for(int i=0;i<Arr.length;i++)
       {
          Arr[i] = sobj.nextInt();
       }
       System.out.println();
       
   }
   public void Display()
   {
      for(int i=0;i<Arr.length;i++)
      {
         if(Arr[i]%11==0)
         {
            System.out.print(Arr[i]+"\t");
         }
      }
      System.out.println();
   
   }
   

}

class Program32_5

{
  public static void main(String args[])
  {
     Scanner sobj = new Scanner(System.in);
     System.out.println("Enetr the count of elements u want ");
     int iSize = sobj.nextInt();
     
     ArrayDemo a1 = new ArrayDemo(iSize);
     a1.Accept();
     a1.Display();
  }

} 
