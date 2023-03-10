import java.util.*;

class Digits
{
  private int CountDigits(int iNo)
  {
     int iCnt = 0;
     while(iNo != 0)
     {
        iCnt++;
        iNo = iNo/10;
     } 
     return iCnt;
  }
  
  private int Power(int Base,int index)   // Base = 4  index = 5
  {
    int iAns = 1;
    for(int iCnt = 1;iCnt <= index;iCnt++)
    {
       iAns = iAns * Base;
    }
    return iAns;
  }
  
  public boolean CheckArmstrong(int iNo)
  {
      int iCount = CountDigits(iNo);
      int itemp = iNo;
      int iDigit = 0; 
      int iSum  = 0;
      int iRet  = 0;
      while(itemp!=0)
      {
           iDigit = itemp%10;
           iRet = Power(iDigit,iCount);
           iSum = iSum + iRet;
           itemp = itemp/10;
      }
      if(iSum == iNo)
      {
         return true;
      }
      else 
      {
         return false;
      }
  }
}

class Program256

{
   public static void main(String a[])
   {
       Scanner sobj = new Scanner(System.in);
       
       System.out.println("Please enter number : ");
       int iNo1 = sobj.nextInt();
       
       Digits dobj = new Digits();
       
      boolean bRet = dobj.CheckArmstrong(iNo1);
      if(bRet == true)
      {
         System.out.println(iNo1 + " is a Armstrong number. ");
      }
      else
      {
         System.out.println(iNo1 + " is a not a Armstrong number. ");
      }
       
   }
}
