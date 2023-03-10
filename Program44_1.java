/* Write a java program which accept array of characters from users and replace each capital character with its corresponding small character.

Input  : b  N  j  B  R  b  A  d  G  G
Output : b  n  j  b  r  b  a  d  g  g

*/
import java.util.*;

class MyArray
{
    public void ArrayReplace(char Arr[])
    {  
       //int iCnt; 
       for(int i=0;i<Arr.length;i++)
       { 
          // iCnt=0;
          if(Arr[i]>='A'&&Arr[i]<='Z')
          {
             /*iCnt = Arr[i];
             iCnt = iCnt+32;
             Arr[i] = (char)iCnt;*/
             Arr[i] += 32;
          }
          System.out.print(Arr[i]+"\t");
       
       }
       System.out.println();
    
    }  

}

class Program44_1
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
      m1.ArrayReplace(Arr);
   }  

}
