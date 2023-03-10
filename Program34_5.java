/*  Write a java program which accept N numbers from user and return product of all odd elements.
Input :   N  :  6
         
      Elements :  15  66   3   70  10  88

Output : 45


Input :   N  :  6
         
      Elements :  44  66   72   70  10  88

Output : 0


*/

import java.util.*;
import Marvellous.Program34_2a;

class Number extends Marvellous.Program34_2a
{
   public Number(int j)
   {
     super(j);
   }
   int iMult = 1;
   int itemp = 1;
   public int ProductOfOdd()
   {
      
      for(int i=0;i<Arr.length;i++)
      {
         if(Arr[i]%2==1)
         {
            iMult = iMult*Arr[i];
         }
         else
         {
            itemp = itemp*Arr[i];
         }
      }
      if(iMult>=1&&itemp>=1)
      {
         return iMult;
      }
      else
      {
        return 0;
      }
   }
}

class Program34_5
{
	public static void main(String ar[])
	{
	   Scanner sobj = new Scanner(System.in);
	   System.out.println("Enter the size");
	   int iSize = sobj.nextInt();
	   Number n1 = new Number(iSize);
	   n1.Accept();
	   System.out.println();
	   int iRet = n1.ProductOfOdd();
	   System.out.println("Product of odd terms is  " + iRet);
	   n1.Display();
	   
	}
}
