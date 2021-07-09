//Comp 282
//Allen Zohrabians
//Project 1
//StringLinkedList.java

public class StringLinkedList
{
   private StringNode head;
   private StringNode tail;

   public StringLinkedList()
   {
      head = null;
      tail = null;
   }
   
   public int size()
   {
      if (head != null)
      {
         return head.size();
      }
      else
      {
         return 0;
      }
   }
   
   public StringNode head()
   {
      return head;
   }
   
   public void setHead (StringNode newHead)
   {
      head = newHead;
   }
   
   public StringNode tail()
   {
      return tail;
   }
   
   public void setTail (StringNode newTail)
   {
      tail = newTail;
   }
   
   public void add (String element)
   {
      if (head != null)
      {
         tail = tail.add(new StringNode(element));
      }
      else
      {
         head = new StringNode(element);
         tail = head;
      }
   }
   
   public void print()
   {
      if (head != null)
      {
         head.print();
      }
   }
   
}
