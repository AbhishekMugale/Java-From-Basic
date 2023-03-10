import java.util.*;


class Program484
{
    public static void main(String ar[])
    {
       Scanner sobj = new Scanner(System.in);
       
       System.out.println("Enter the string ");
       String str = sobj.nextLine();
       
       char Arr[] = str.toCharArray();
    
       for(int i=0;i<Arr.length;i++)
       {
          if((Arr[i] >= 'A') && (Arr[i] <= 'Z'))
          {// Due to strict typechecing in java we use in typecasting it is not there in c and c++ so there there we dont use typecasting due to loose typecating.
             Arr[i] = (char)(Arr[i] + 32);
          }
       }
       
      String output = new String(Arr);
      
      System.out.println(output);
    }
}
