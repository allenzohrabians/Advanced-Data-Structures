//Comp 282
//Allen Zohrabians
//Project 2
//AVLNode.java

public class AVLNode
{
   private int value;
   private AVLNode left;
   private AVLNode right;
   
   public AVLNode (int v)
   {
      value = v;
      left = null;
      right = null;
   }
   
   public int getValue()
   {
      return value;
   }
   
   public AVLNode getLeft()
   {
      return left;
   }
   
   public void setLeft (AVLNode l)
   {
      left = l;
   }
   
   public AVLNode getRight()
   {
      return right;
   }
   
   public void setRight (AVLNode r)
   {
      right = r;
   }
}