//Comp 282
//Allen Zohrabians
//Project 1
//Main.java

import java.util.Scanner;

public class Main
{
   public static void main(String[] args)
   {
      try
      {
         String filename;
         if(args.length > 0)
         {
            filename = args[0];
         }
         else
         {
            filename = "input.txt";
         }
         Scanner input = new Scanner(new java.io.File(filename));
         StringArray array = new StringArray();
         StringLinkedList list = new StringLinkedList();
         StringQueue queue = new StringQueue();
         int words = 0;
         while(input != null && input.hasNext())
         {
            String currentWord = input.next();
            array.add(currentWord);
            list.add(currentWord);
            queue.add(currentWord);
            words++;
         }
         input.close();
         System.out.println("# of words: " + words);
         part3(array);
         part4(list);
         part5(queue);
      }
      catch(java.io.FileNotFoundException e)
      {
         System.out.println("Error, File Not Found");
      }
      
     }
   
   public static void part3 (StringArray array)
   {
      long beginTime = System.nanoTime();
      for (int i = 0; i < array.size() / 2; i++)
      {
         int j = array.size() - 1 - i;
         String temp = array.get(i);
         array.set(i, array.get(j));
         array.set(j, temp);
      }
      array.print();
      System.out.println("Part 3 - Time = " + (System.nanoTime() - beginTime));
   }
   
   public static void part4 (StringLinkedList list)
   {
      long beginTime = System.nanoTime();
      StringNode cTail = list.tail();
      while(!list.head().equals(cTail))
      {
         StringNode cNode = list.head();
         StringNode nNode = list.head().next();
         while(!nNode.equals(cTail))
         {
            cNode = cNode.next();
            nNode = nNode.next();
         }
      nNode.setNext(cNode);
      cTail = cNode;
      }
      list.head().setNext(null);
      list.setHead(list.tail());
      list.setTail(cTail);
      list.print();
      System.out.println("Part 4 - Time = " + (System.nanoTime() - beginTime));
   }
   
   public static void part5 (StringQueue queue)
   {
      long beginTime = System.nanoTime();
      StringStack stack = new StringStack();
      while (queue.size() > 0)
      {
         stack.add(queue.poll());
      }
      while (stack.size() > 0)
      {
         queue.add(stack.pop());
      }
      queue.print();
      System.out.println("Part 5 - Time = " + (System.nanoTime() - beginTime));
   }
}