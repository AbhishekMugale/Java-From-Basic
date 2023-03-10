import java.util.*;

class Node
{
   public int Data;
   public Node Next;
   
   public Node(int No)
   {
      this.Data = No;
      this.Next = null;
   }
}

class SinglyLL
{
   public Node Head;
   public int Count;
   
   public SinglyLL()
   {
      Head = null;
      Count = 0;
   }
   
   protected void finalize()
   {
      // Memory free
   }   
   
   public void InsertFirst(int No)
   {
      Node newn = new Node(No);
      //newn.Data = No;
      //newn.Next = null;
      
      if(this.Head == null)
      {
         this.Head = newn; 
      }
      else
      {
         newn.next = this.Head;
         this.Head = newn;
      }
      this.Count++;
   }
}

class Program445
{
   public static void main(String arg[])
   {
      SinglyLL obj = new SinglyLL(); 	
      
      obj.InsertFirst(51);
      obj.InsertFirst(21);
      obj.InsertFirst(11);
   
   }
}
