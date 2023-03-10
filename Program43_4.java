/* Write java program which accept array of characters from user and count number of capital characters.

Input : b  N  j  B	 R	 b   A    d   G   G
Output : 6

*/

import java.util.*;

class MyArray
{
   public int Count(char Arr[])
   {
      int iCnt = 0;
       for(int i=0;i<Arr.length;i++)
       {
          if(Arr[i]>='A'&&Arr[i]<='Z')
          {
             iCnt++;
          }  
       }
       return iCnt;
   }
}

class Program43_4
{
   public static void main(String a[])
   {
      Scanner sobj = new Scanner(System.in);
      System.out.println("Enter the Size of Array");
      int iSize = sobj.nextInt();
      char Arr[] = new char[iSize];
      System.out.println("Enter the characters in the array ");
      for(int i=0;i<iSize;i++)
      {
         Arr[i] = sobj.next().charAt(0);
      }
      
      MyArray m1 = new MyArray();
      int iRet = m1.Count(Arr);
      System.out.println(iRet);
       
   }


}
