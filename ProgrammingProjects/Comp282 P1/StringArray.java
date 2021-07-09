//Comp 282
//Allen Zohrabians
//Project 1
//StringArray.java

public class StringArray
{
   private String[] vector;
   private int size;
   
   public StringArray()
   {
      vector = new String[10];
      size = 0;
   }
   
   public int size()
   {
      return size;
   }
   
   public String get (int index)
   {
      if(index >= 0 && index < size)
      {
         return vector[index];
      }
      else
      {
         return "Error";
         
      }
   }
   
   public void set (int index, String element)
   {
      if(index >= 0 && index < size)
      {
         vector[index] = element;
      }
   }
   
   public void add (String element)
   {
      if (size == vector.length)
      {
         String[] newVector = new String[vector.length*2];
         for (int i = 0; i < vector.length; i++)
         {
            newVector[i] = vector[i];
         }
         vector = newVector;
      }
      vector[size] = element;
      size++;
   }
   
   public void remove (int index)
   {
      if (index >= 0 && index < size)
      {
         for (int i = index; i < size-1; i++)
         {
            vector[i] = vector[i+1];
         }
         size--;
         
         if (size == vector.length/2 && size >= 10)
         {
            String[] newVector = new String[vector.length/2];
            for (int i = 0; i < newVector.length; i++)
            {
               newVector[i] = vector[i];
            }
            vector = newVector;
         }
      }

   }
   
   public void print()
   {
      for (int i = 0; i < size; i++)
      {
         System.out.print(vector[i]);
         if (i < size-1)
         {
            System.out.print(" ");
         }
         else
         {
            System.out.println();
         }
        
      }
   }
  
   
}
