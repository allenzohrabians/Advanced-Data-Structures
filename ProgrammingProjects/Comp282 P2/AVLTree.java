//Comp 282
//Allen Zohrabians
//Project 2
//AVLTree.java

public class AVLTree
{
   private AVLNode root;
   
   public AVLTree()
   {
      root = null;
   }
   
   public void insert (AVLNode n) 
   {
      if (root != null)
      {
         root = insert (root,n);
      }
      else
      {
         root = n;
      }
   }
   
   public void delete (AVLNode n) 
   {
      if (root != null)
      {
         root = delete (root,n);
      }
   }
   
   public void inOrderTraversal() 
   {
      if (root != null)
      {
         inOrderTraversal(root);
         System.out.println();
      }
   }
   
   public AVLNode lookup (int v) 
   {
      if (root != null)
      {
         return lookup (root,v);
      }
      else
      {
         return null;
      }
   }
   
   public void print() 
   {
      if (root != null)
      {
         print(root);
         System.out.println();
      }
   }
   
   private void inOrderTraversal (AVLNode current)
   {
      if (current.getLeft() != null)
      {
         inOrderTraversal (current.getLeft());
      }
      
      System.out.print(current.getValue() + " ");
      
      if (current.getRight() != null)
      {
         inOrderTraversal (current.getRight());
      }
   }
   
   private void print (AVLNode current)
   {
      System.out.print("(" + current + ", " + current.getValue() + ", ");
      
      if (current.getLeft() != null)
      {
         System.out.print (current.getLeft() + ", ");
      }
      else
      {
         System.out.print ("-1, ");
      }
      
      if (current.getRight() != null)
      {
         System.out.print (current.getRight() + ") ");
      }
      else
      {
         System.out.print ("-1) ");
      }
      
      if (current.getLeft() != null)
      {
         print (current.getLeft());
      }
      
      if (current.getRight() != null)
      {
         print (current.getRight());
      }
      
   }
   
   private AVLNode lookup (AVLNode current, int v)
   {
      if (current.getValue() > v) 
      {
         if (current.getLeft() != null)
         {
            return lookup (current.getLeft(), v);
         }
         else
         {
            return null;
         }
      }
      
      else if (current.getValue() < v) 
      {
         if (current.getRight() != null)
         {
            return lookup (current.getRight(), v);
         }
         else
         {
            return null;
         }
      }
      else
      {
         return current;
      }
   }
   
   private AVLNode insert (AVLNode current, AVLNode n)
   {
      if (current.getValue() > n.getValue())
      {
         if (current.getLeft() != null)
         {
            current.setLeft (insert(current.getLeft(), n));
            current = checkLeft(current);
         }
         else
         {
            current.setLeft(n);
         }
      }
      else if (current.getValue() < n.getValue())
      {
         if (current.getRight() != null)
         {
            current.setRight (insert(current.getRight(), n));
            current = checkRight(current);
         }
         else
         {
            current.setRight(n);
         }
      }
      return current;  
   }
   
   private AVLNode delete (AVLNode current, AVLNode n) {
      if (current.getValue() > n.getValue()) {
         if (current.getLeft() != null) {
            current.setLeft(delete(current.getLeft(), n));
            current = checkRight(current);
         }
      } else if (current.getValue() < n.getValue()) {
         if (current.getRight() != null) {
            current.setRight(delete(current.getRight(), n));
            current = checkLeft(current);
         }
      } else {
         if (current.getLeft() != null && current.getRight() != null) {
            current.setRight(insert(current.getRight(), current.getLeft()));
            current = current.getRight();
         } else if (current.getLeft() != null) {
            current = current.getLeft();
         } else if (current.getRight() != null) {
            current = current.getRight();
         } else {
            current = null;
         }
      }
      return current;
   }
   
   private AVLNode checkLeft(AVLNode current) {
      if (treeHeight(current.getLeft()) > treeHeight(current.getRight()) + 1) {
         AVLNode left = current.getLeft();
         AVLNode leftLeft = left.getLeft();
         AVLNode leftRight = left.getRight();
         if (treeHeight(leftLeft) >= treeHeight(leftRight)) {
            current.setLeft(leftRight);
            left.setRight(current);
            current = left;
         } else {
            current.setLeft(leftRight.getRight());
            leftRight.setRight(current);
            left.setRight(leftRight.getLeft());
            leftRight.setLeft(left);
            current = leftRight;
         }
      }
      return current;
   }
   
   private AVLNode checkRight(AVLNode current) {
      if (treeHeight(current.getRight()) > treeHeight(current.getLeft()) + 1) {
         AVLNode right = current.getRight();
         AVLNode rightRight = right.getRight();
         AVLNode rightLeft = right.getLeft();
         if (treeHeight(rightRight) >= treeHeight(rightLeft)) {
            current.setRight(rightLeft);
            right.setLeft(current);
            current = right;
         } else {
            current.setRight(rightLeft.getLeft());
            rightLeft.setLeft(current);
            right.setLeft(rightLeft.getRight());
            rightLeft.setRight(right);
            current = rightLeft;
         }
      }
      return current;
   }
   
   private int treeHeight (AVLNode current)
   {
      int height = 0;
      
      if (current != null) {
         height = 1;
         if (current.getLeft() != null && current.getRight() != null) {
            int leftHeight = treeHeight(current.getLeft());
            int rightHeight = treeHeight(current.getRight());
            if (leftHeight >= rightHeight) {
               height += leftHeight;
            } else {
               height += rightHeight;
            }
         } else if (current.getLeft() != null) {
            height += treeHeight(current.getLeft());
         } else if (current.getRight() != null) {
            height += treeHeight(current.getRight());
         }
      }
      
      return height;
   }
}
