/* Write a java program which accept string from user and check whether it contains vowels in it or not.

Input :  "marvellous"
Output : TRUE

Input : "Demo"
Output : TRUE

Input : "xyz"
Output : FALSE
*/

import java.util.*;

class StringDemo
{
    public boolean ChkVowel(String s)
    {
       int iCnt = 0;
       char Brr[] = {'a','A','b','B','e','E','i','I','o','O','u','U'};
       char Arr[] = s.toCharArray();
       for(int i=0;i<Arr.length;i++)
       {
          for(int j=0;j<Brr.length;j++)
          {
             if(Arr[i]==Brr[j])
             {
                iCnt++;
                break;
             }
          }
       }
      if(iCnt!=0)
      {
        return true;
      }
      else
      {
        return false;
      }
    }

}

class Program31_4
{
   public static void main(String a[])
   {
      Scanner sobj = new Scanner(System.in);
      boolean bRet = false;
      
      System.out.println("Enter the string : ");
      String s = sobj.nextLine();
      
      StringDemo obj =new StringDemo();
      
      bRet = obj.ChkVowel(s);
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
