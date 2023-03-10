
package Marvellous;
import java.util.*;

public class Program34_2a
{
   public int Arr[];
   public Program34_2a(int iSize)
   {
      Arr = new int[iSize];
   }   
   public void Accept()
   {
     Scanner sobj = new Scanner(System.in);
      System.out.println("Enter " + Arr.length + " elements in Array : ");
      for(int i=0;i<Arr.length;i++)
      { 
          System.out.println("Enter element no. " + (i+1) );
          Arr[i] = sobj.nextInt();
      }
   }
   public void Display()
   {
      System.out.println("Elements Present in  array are : ");
      for(int i=0;i<Arr.length;i++)
      {
         System.out.println(Arr[i]);
      }
      System.out.println();
   }
}
