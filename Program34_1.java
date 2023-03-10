/* Write a program which accept n numbers from user and accept one another number as NO, check whether NO is present or not.

Input :   N  :  6
         No  :  66
         
      Elements :  85  66   3   66  93  88

Output : TRUE


Input :   N  :  6
         No  :  12
         
     Elements :  85  66   3   66  93  88

Output : FALSE

*/

import java.util.*;

class Abhi
{
   protected int Arr[];
   public Abhi(int iSize)
   {
      Arr = new int[iSize];
   }   
   protected void Accept()
   {
     Scanner sobj = new Scanner(System.in);
      System.out.println("Enter " + Arr.length + " elements in Array : ");
      for(int i=0;i<Arr.length;i++)
      { 
          System.out.println("Enter element no. " + (i+1) );
          Arr[i] = sobj.nextInt();
      }
   }
   protected void Display()
   {
      System.out.println("Elements Present in  array are : ");
      for(int i=0;i<Arr.length;i++)
      {
         System.out.println(Arr[i]);
      }
      System.out.println();
   }
}
 
class Number extends Abhi
{
   boolean bflag = false;
   public Number(int iSize)
   {
      super(iSize);
   }
   public boolean Check(int No)
   {
      for(int i=0;i<Arr.length;i++)
      {
         if(Arr[i]==No)
         {
            bflag = true;
         }
      }
      return bflag;
   }
}

class Program34_1
{
   public static void main(String a[])
   {
      Scanner sobj = new Scanner(System.in);
      System.out.println("Enter the number of elements u want : ");
      int iSize = sobj.nextInt();
      Number n1 = new Number(iSize);
      n1.Accept();
      System.out.println("Enter the element u want to search ");
      int iNo = sobj.nextInt();
      n1.Display();
      boolean bRet = n1.Check(iNo);
      if(bRet == true)
      {
         System.out.println("TRUE");
      } 
      else
      {
         System.out.println("FALSE");
      } 
   }
}
