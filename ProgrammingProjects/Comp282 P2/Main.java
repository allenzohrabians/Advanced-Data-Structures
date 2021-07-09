//Comp 282
//Allen Zohrabians
//Project 2
//Main.java

import java.util.Scanner;

public class Main
{
   public static void main (String[] args)
   {
      AVLTree tree = new AVLTree();
      Scanner input = new Scanner(System.in);
      int option = 0;
      while (option != 4) 
      {
         System.out.println("AVL Tree (Project 2)\nPlease select an option:\n");
         System.out.println("1 - Add to the tree");
         System.out.println("2 - Remove from the tree");
         System.out.println("3 - Search for a value in the tree");
         System.out.println("4 - Quit\n");
         System.out.print("Option: ");
         option = input.nextInt();
         if (option == 1) 
         {
            System.out.print("\nPlease enter a value: ");
            int value = input.nextInt();
            tree.insert(new AVLNode(value));
            System.out.println(value + " was inserted");
            System.out.println("\nIn Order Traversal:");
            tree.inOrderTraversal();
            System.out.println("\nPrint:");
            tree.print();
            System.out.println("\n");
         } 
         else if (option == 2) 
         {
            System.out.print("\nPlease enter a value: ");
            int value = input.nextInt();
            tree.delete(new AVLNode(value));
            System.out.println(value + " was deleted");
            System.out.println("\nIn Order Traversal:");
            tree.inOrderTraversal();
            System.out.println("\nPrint:");
            tree.print();
            System.out.println("\n");
         } 
         else if (option == 3) 
         {
            System.out.print("\nPlease enter a value: ");
            int value = input.nextInt();
            if (tree.lookup(value) != null) 
            {
               System.out.println("\nYes, " + value + " is in the tree\n");
            } 
            else 
            {
               System.out.println("\nNo, " + value + " is not in the tree\n");
            }
         } 
         else if (option == 4) 
         {
            System.out.println("\nThank you and goodbye!");
         } 
         else 
         {
            System.out.println("\nPlease try again\n");
         }
      }
      input.close();
   }
}