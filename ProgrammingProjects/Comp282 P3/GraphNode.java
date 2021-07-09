//Comp 282
//Allen Zohrabians
//Project 3
//GraphNode.java

import java.util.ArrayList;
import java.util.Queue;

public class GraphNode
{
   private int value;
   private boolean depthChecked;
   private boolean breadthChecked;
   private boolean minimumChecked;
   private ArrayList<GraphNode> nodeList;
   private ArrayList<Integer> edgeList;
   
   public GraphNode (int v)
   {
      value = v;
      depthChecked = false;
      breadthChecked = false;
      minimumChecked = false;
      nodeList = new ArrayList <GraphNode>();
      edgeList = new ArrayList <Integer>();
   }
   
   public int getValue()
   {
      return value;
   }
   
   public void insert (GraphNode node, int edge)
   {
      nodeList.add(node);
      edgeList.add(edge);
   }
   
   public void organize()
   {
      for (int i = 0; i < nodeList.size() - 1; i++)
      {
         for (int j = i + 1; j < nodeList.size(); j++)
         {
            if (edgeList.get(i) > edgeList.get(j))
            {
               GraphNode tempNode = nodeList.get(i);
               nodeList.set(i, nodeList.get(j));
               nodeList.set(j, tempNode);
               Integer tempEdge = edgeList.get(i);
               edgeList.set(i, edgeList.get(j));
               edgeList.set(j, tempEdge);
            }
         }
      }
   }
   
   public void print()
   {
      System.out.print("(" + value + ") = {");
      for (int i = 0; i < nodeList.size(); i++)
      {
         System.out.print(nodeList.get(i).value + ":" + edgeList.get(i));
      
         if (i < nodeList.size() - 1)
         {
            System.out.print(", ");
         }
      }
   
      System.out.println("}");
      
   }
   
   public void depthFirstSearch()
   {
      System.out.print("(" + value + ")");
      depthChecked = true;
      
      for (int i = 0; i < nodeList.size(); i++)
      {
         if (! nodeList.get(i).depthChecked)
         {
            System.out.print(" " + edgeList.get(i) + " ");
            nodeList.get(i).depthFirstSearch();
         }
      }
   }
   
   public void addToQueue (Queue<GraphNode> nodeQueue, Queue<Integer> edgeQueue, int edge)
   {
      breadthChecked = true;
      nodeQueue.add(this);
      edgeQueue.add(edge);
   }
   
   public void breadthFirstSearch (Queue<GraphNode> nodeQueue, Queue<Integer> edgeQueue, int edge)
   {
      if (edge > 0)
      {
         System.out.print (" " + edge + " ");
      }
      
      System.out.print ("(" + value + ")");
      
      for (int i = 0; i <nodeList.size(); i++)
      {
         if (! nodeList.get(i).breadthChecked)
         {
            nodeList.get(i).addToQueue(nodeQueue, edgeQueue, edgeList.get(i));
         }
      }
   }
   
   public void addToArray (ArrayList<GraphNode> nodeArray, ArrayList<Integer> edgeArray, int edge)
   {
      int previousIndex = -1;
      for (int i = 0; i < nodeArray.size(); i++)
      {
         if (nodeArray.get(i) == this)
         {
            previousIndex = i;
            break;
         }
      }
      if (previousIndex > -1) 
      {
         if (edgeArray.get(previousIndex) < edge) 
         {
            edgeArray.set(previousIndex, edgeArray.get(previousIndex));
         } 
         
         else 
         {
            edgeArray.set(previousIndex, edge);
         }
      } 
      
      else 
      {
         nodeArray.add(this);
         edgeArray.add(edge);
      }
   }
   
   public void minimumSpanningTree (ArrayList<GraphNode> nodeArray, ArrayList<Integer> edgeArray, int edge)
   {
      if (edge > 0)
      {
         System.out.print(" " + edge + " ");
      }
      
      System.out.print ("(" + value + ")");
      minimumChecked = true;
      for (int i = 0; i < nodeList.size(); i++)
      {
         if (! nodeList.get(i).minimumChecked)
         {
            nodeList.get(i).addToArray(nodeArray, edgeArray, edgeList.get(i));
         }
      }
   }
}