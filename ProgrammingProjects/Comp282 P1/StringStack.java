//Comp 282
//Allen Zohrabians
//Project 1
//StringStack.java

public class StringStack extends StringArray
{
   public StringStack()
   {
      super();
   }
   
   public String pop()
   {
      String output = get(size()-1);
      remove (size()-1);
      return output;
   }
}