/* Write a java program which accept  array from user and check whether that array and its elements are palindrome or not.

Input  :  11 252 387783 252 11
Output : True

Input  :  11 252 387783 77 11
Output : False

Input  :  11 252 786 252 11
Output : False

Input  :  11 252 786 253 11
Output : False

*/

import java.util.*;

class MyArray
{
    public boolean Display(int Arr[])
    {
       int iDigit = 0;
       int temp = 0,iCnt=0,count=0;
       int iStart = 0;
       int iEnd = Arr.length-1;
       int j=0;
       for(int i=0;i<Arr.length;i++)
       {
          iDigit = 0;
          temp = 0;   
          j = Arr[i];
          while(j!=0)
          {
             iDigit = j%10;
             temp = temp*10+iDigit;
             j = j/10; 
          }
          if(temp==Arr[i])
          {
             iCnt++;
          }
          if(Arr[iStart]==Arr[iEnd])
          {
             count++;
             iStart++;
             iEnd--;
          }
       }
       if(iCnt==Arr.length && count==Arr.length)
       {
          return true;
       }
       else
       {
          return false;
       }
    
    }
}

class Program42_5
{
   public static void main(String a[])
   {
      Scanner sobj = new Scanner(System.in);
      System.out.println("Enter the Size of Array");
      int iSize = sobj.nextInt();
      int Arr[]; 
      Arr = new int[iSize];
      System.out.println("Enter " +iSize +" Elements in the array");
      for(int i=0;i<iSize;i++)
      {
         Arr[i] = sobj.nextInt();
      }
      MyArray m1 = new MyArray();
      boolean bRet = m1.Display(Arr);
      if(bRet==true)
      {
         System.out.println("TRUE");
      }
      else
      {
        System.out.println("FALSE");
      }
   }

}
