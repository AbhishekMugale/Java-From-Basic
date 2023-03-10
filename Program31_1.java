/*Write a java program which accept string from user and count number of capital characters


Input : "Marvellous Multi OS"

Output : 4

*/ 
import java.util.*;

class StringDemo
{
    public int CountCapital(String str)
    {  
        int iCnt  = 0;
        int i=0;
        for(iCnt = 1;iCnt<str.length();iCnt++)
        {
          if((str.charAt(iCnt)>='A') && (str.charAt(iCnt)<='Z'))
         {
            i++;
         }
        }
        return i;
    }
}

class Program31_1
{
   public static void main(String a[])
   {
      Scanner sobj = new Scanner(System.in); 
      System.out.println("Please Enter String : ");
      String s = sobj.nextLine(); 
      int iRet = 0;
      StringDemo obj = new StringDemo(); 
      iRet = obj.CountCapital(s);
      System.out.println("Total number of capital letters in string are : "+iRet);
   }
}
