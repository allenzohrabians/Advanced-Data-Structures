//Comp 282
//Allen Zohrabians
//Project 1
//StringQueue.java

public class StringQueue extends StringArray
{
   public StringQueue()
   {
      super();
   }
   
   public String poll()
   {
      String output = get(0);
      remove(0);
      return output;
   }
}