//Comp 282
//Allen Zohrabians
//Project 3
//Main.java

import java.util.Scanner;
import java.io.FileInputStream;

public class Main
{
   public static void main (String[] args)
   {
      UndirectedGraph graph = new UndirectedGraph();
      Scanner input = new Scanner (System.in);
      System.out.println("Project 3 - Graphs\n");
      System.out.print("Please type in the name of one of the five input.txt files: ");
      String filename = input.nextLine();
      System.out.println();
      try
      {
         FileInputStream inputStream = new FileInputStream (filename);
         Scanner file = new Scanner (inputStream);
         while (file.hasNextLine())
         {
            String line = file.nextLine();
            Scanner numbers = new Scanner (line);
            if (numbers.hasNextInt())
            {
               int nodeValA = numbers.nextInt();
               
               if (numbers.hasNextInt())
               {
                  int nodeValB = numbers.nextInt();
                  
                  if (numbers.hasNextInt())
                  {
                     int edgeVal = numbers.nextInt();
                     graph.insert(nodeValA, nodeValB, edgeVal);
                  }
                  
                  else
                  {
                     continue;
                  }
               }
               
               else
               {
                  continue;
               }
            }
            
            else
            {
               continue;
            }
         }
         
         graph.organize();
         System.out.println("Graph:");
         graph.print();
         System.out.println();
         System.out.println("Breadth First Search:");
         graph.breadthFirstSearch();
         System.out.println();
         System.out.println("Depth First Search:");
         graph.depthFirstSearch();
         System.out.println();
         System.out.println("Minimum Spanning Tree:");
         graph.minimumSpanningTree();
      }
      
      catch (Exception e)
      {
         System.out.println ("Sorry, file not found.");
      }
   }
}