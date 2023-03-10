/* Write a java program which accept array of characters from user and
accept one character. Return the occurence of that character without considering case.

Input  : b  N  e  B  R  b  A  i  G  i  B
		 b
		 
Output : 4

*/
import java.util.*;

class MyArray
{
    public int Search(char Arr[],char iChar)
    {  
        int iCnt=0;
        
        
       for(int i=0;i<Arr.length;i++)
       { 
            
          if(Arr[i]>='A'&&Arr[i]<='Z')
          {
              Arr[i] += 32;  
          }          
          if(Arr[i]==iChar)
          {
             iCnt++;
          }
          
       }
       return iCnt;
    
    }  

}

class Program44_3
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
      System.out.println("Enter the character whose occurence u want ");
      char iVal = sobj.next().charAt(0);
      
      MyArray m1 = new MyArray();
      
      int iRet = m1.Search(Arr,iVal);
      System.out.println();
      System.out.println(iRet);
   }  

}
