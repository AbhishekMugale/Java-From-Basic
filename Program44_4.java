/* Write a java program which accept array of characters from user and
accept one character. Return the differnce between frequency of capital and frequency of small letters.

Input  : b  N  e  B  R  b  A  I  O  G  i  
		 
		 
Output : 3  (7-4)

*/
import java.util.*;

class MyArray
{
    public int Difference(char Arr[])
    {  
        int iCnt=0;
        int itemp = 0;
        
       for(int i=0;i<Arr.length;i++)
       { 
            
          if(Arr[i]>='A'&&Arr[i]<='Z')
          {
              iCnt++;  
          }          
          else
          {
             itemp++;
          }
          
       }
       return iCnt-itemp;
    
    }  

}

class Program44_4
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
      
      int iRet = m1.Difference(Arr);
      System.out.println();
      System.out.println(iRet);
   }  

}
