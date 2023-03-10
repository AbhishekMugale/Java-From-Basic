/* Write a java program which accepts 2 strings from user snd concat N characters of second string after first string.Value of N should be accepted from user.
Note : If third parameter is greater than the size of second string then concat whole string after first string.

Input  :   "Marvellous Infosystems"
			"Logic Building"
			5
			
Output :	"Marvellous Infosystems Logic"

*/

import java.util.*;

class StringDemo
{
   public String StrNCatX(String src,String dest,int iCnt)
   {
       String iRet = "";
       if(iCnt<dest.length())
       {
        for(int i=0;i<iCnt;i++)
        {
           iRet = iRet + dest.charAt(i);
        }
       
       iRet = src + " " + iRet;
      }
      else
      {
         iRet = src + " " + dest;
      }
      return iRet;
      
   }
}

class Program35_1
{
   public static void main(String a[])
   {
      Scanner sobj = new Scanner(System.in);
      System.out.println("Enter first string");
      String s1 = sobj.nextLine();
      System.out.println("Enter Second string");
      String s2 = sobj.nextLine();
      System.out.println("Enter the number of characterxs u want to concat");
      int No = sobj.nextInt();
      StringDemo obj = new StringDemo();
      String iRet=obj.StrNCatX(s1,s2,No);
      System.out.println(iRet);
   }

}
