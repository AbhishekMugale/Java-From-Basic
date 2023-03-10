/* Write a java program which accept array of characters from users and return the number of vowels present in array.

Input  : b  N  e  B  R  b  A  i  G  i  B
Output : 4

*/
import java.util.*;

class MyArray
{
    public int CountVowels(char Arr[],char brr[])
    {  
        int iCnt=0;
       for(int i=0;i<Arr.length;i++)
       { 
          
          for(int j=0;j<brr.length;j++)
          {
              if(Arr[i]==brr[j])
              {
                 iCnt++;
              }
          }
          
       }
       return iCnt;
    
    }  

}

class Program44_2
{
   public static void main(String a[])
   {
      Scanner sobj = new Scanner(System.in);
      System.out.println("Enter the size of array");
      int iSize = sobj.nextInt();
      char Arr[] = new char[iSize];
      System.out.println("Enter " +iSize+ " Letters in Array");
      for(int i=0;i<iSize;i++)
      {
         Arr[i] = sobj.next().charAt(0);
      }
      MyArray m1 = new MyArray();
      char brr[] = {'a','e','i','o','u','A','E','I','O','U'};
      int iRet = m1.CountVowels(Arr,brr);
      System.out.println();
      System.out.println(iRet);
   }  

}
