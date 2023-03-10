import java.util.*;

class Digits
{
  
  public boolean CheckArmstrong(int iNo)
  {
      int iDigitCount = 0;
      int iTemp = iNo;
      int iDigit = 0;
      int iPower = 1;
      int iSum = 0;
      while(iTemp != 0)
      {
         iDigitCount++;
         iTemp = iTemp/10;
      }
      iTemp = iNo;
      
      while(iTemp!=0)
      {
        iDigit = iTemp%10;
        
        for(int iCnt=1;iCnt<=iDigitCount;iCnt++)
        {
           iPower = iPower*iDigit;
        }
        iSum = iSum + iPower;
        iPower = 1;
        
        iTemp = iTemp/10;
      } 
      if(iNo==iSum)
      {
         return true;
      }
      else
      {
        return false;
      }
      
      
      
  }   
}

class Program257

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
