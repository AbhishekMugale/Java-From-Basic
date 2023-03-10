/*  Write a Java Program which acccept N numbers from user and return difference between summation of even elements and summation of odd elements.

Input   :  N :  6
       Elements : 85  66  3  80  93  88

Output : 53  (234 - 181)

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
       System.out.println("Enter elements in the array :");
       for(int k=0;k<Arr.length;k++)
       {
          Arr[k] = sobj.nextInt();
       }
    }
    public int Difference()
    {  
       int iSum = 0,iRum=0;
       for(int k=0;k<Arr.length;k++)
       {
          if(Arr[k]%2==0)
          {
             iSum = iSum + Arr[k];
          }
          else
          {
             iRum = iRum + Arr[k];
          }
       }
       return iSum-iRum;
    }
  
}


class Program32_1
{
   public static void main(String a[])
   {
      Scanner sobj = new Scanner(System.in);
      System.out.println("Enter the Count of elements u want : ");
      int i = sobj.nextInt();
      int iRet = 0;
      
      ArrayDemo a1 = new ArrayDemo(i);
      a1.Accept();
      iRet = a1.Difference();
      System.out.println("Difference between even ond odd "+iRet);      
   }
}       

