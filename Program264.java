import java.util.*;

class Program264
{
   public static void main(String arr[])
   {
      Scanner sobj = new Scanner(System.in);
      int iCnt = 0;
      
      System.out.println("Enter the size of array");
      int iSize = sobj.nextInt();
      
      int Arr[] = new int[iSize];
      System.out.println("Enter the elements of array");
      for(int i=0;i<Arr.length;i++)
      {
        Arr[i] = sobj.nextInt();
      }
      
      int iSum = 0;
      for(int i=0;i<Arr.length;i++)
      {
         iSum = iSum + Arr[i];
      }
      System.out.println("Addition is :"+iSum);
      
   
   }
}

