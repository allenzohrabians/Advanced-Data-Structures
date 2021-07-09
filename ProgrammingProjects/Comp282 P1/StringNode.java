//Comp 282
//Allen Zohrabians
//Project 1
//StringNode.java

public class StringNode
{
   private String value;
   private StringNode nextNode;
   
   public StringNode (String element)
   {
      value = element;
      nextNode = null;
   }
   
   public StringNode next()
   {
      return nextNode;
   }
   
   public void setNext (StringNode newNode)
   {
      nextNode = newNode;
   }
   
   public int size()
   {
      int result = 1;
      if (nextNode != null)
      {
         result += nextNode.size();
      }
      return result;
   }
   
   public StringNode add (StringNode newNode)
   {
      nextNode = newNode;
      return newNode;
   }
   
   public void print()
   {
      System.out.print(value);
      if(nextNode != null)
      {
         System.out.print(" ");
         nextNode.print();
      }
      else
      {
         System.out.println();
      }
   }
}