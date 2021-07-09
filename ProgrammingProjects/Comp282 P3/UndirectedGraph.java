//Comp 282
//Allen Zohrabians
//Project 3
//UndirectedGraph.java

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class UndirectedGraph
{
   private ArrayList<GraphNode> graphNodes;
   
   public UndirectedGraph()
   {
      graphNodes = new ArrayList<GraphNode>();
   }
   
   public void insert (int nodeValA, int nodeValB, int edgeVal)
   {
      GraphNode nodeA = findNode(nodeValA);
      GraphNode nodeB = findNode(nodeValB);
      nodeA.insert(nodeB, edgeVal);
      nodeB.insert(nodeA, edgeVal);
   }
   
   private GraphNode findNode (int value)
   {
      for (GraphNode node : graphNodes)
      {
         if (node.getValue() == value)
         {
            return node;
         }
      }
      
      GraphNode newNode = new GraphNode(value);
      graphNodes.add(newNode);
      return newNode;
   }
   
   public void organize()
   {
      for (GraphNode node : graphNodes)
      {
         node.organize();
      }
   }
   
   public void print()
   {
      for (GraphNode node : graphNodes)
      {
         node.print();
      }
   }
   
   public void depthFirstSearch()
   {
      if (graphNodes.size() > 0)
      {
         graphNodes.get(0).depthFirstSearch();
         System.out.println();
      }
   }
   
   public void breadthFirstSearch()
   {
      if (graphNodes.size() > 0)
      {
         Queue<GraphNode> nodeQueue = new LinkedList<GraphNode>(); 
         Queue<Integer> edgeQueue = new LinkedList<Integer>();   
         graphNodes.get(0).addToQueue (nodeQueue, edgeQueue, 0);
         while (nodeQueue.size() > 0)
         {
            GraphNode node = nodeQueue.poll();
            int edge = (int) edgeQueue.poll();
            node.breadthFirstSearch (nodeQueue, edgeQueue, edge);
         }
         
         System.out.println();
      }
   }
   
   public void minimumSpanningTree()
   {
      if (graphNodes.size() > 0)
      {
         ArrayList <GraphNode> nodeArray = new ArrayList <GraphNode>();
         ArrayList <Integer> edgeArray = new ArrayList <Integer>();
         graphNodes.get(0).addToArray (nodeArray, edgeArray, 0);
         while (nodeArray.size() > 0)
         {
            int smallestIndex = 0;
            
            for (int i = 1; i < nodeArray.size(); i++)
            {
               if (edgeArray.get(smallestIndex) > edgeArray.get(i))
               {
                  smallestIndex = i;
               }
            }
            
            GraphNode node = nodeArray.remove(smallestIndex);
            int edge = (int) edgeArray.remove(smallestIndex);
            node.minimumSpanningTree (nodeArray, edgeArray, edge);
         }
         
         System.out.println();
      }
   }
}