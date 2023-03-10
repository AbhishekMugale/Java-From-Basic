import java.util.*;


class Program487
{
    public static void main(String ar[])
    {
       Scanner sobj = new Scanner(System.in);
       
       System.out.println("Enter the string ");
       String str = sobj.nextLine();
       
       String data = str.replaceAll("\\s+"," ");// Multiple white spaces are replaced by single white white space.
       
       String newstr = data.trim(); // Initial and last white spaces are removed.
       
       String Arr[] = newstr.split(" ");
       
       System.out.println("Number of words : "+Arr.length);
    }
}
