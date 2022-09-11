abstract class AnonymousInner
{
    public abstract void Fun();
}


public class code4_anonymous_inner_class {
    
    public static void main(String args[])
    {
       AnonymousInner i = new AnonymousInner() 
       {
          public void Fun()
          {
            System.out.println("This is a Example of Anonymous Inner class");
          } 
       };

       i.Fun();
    }
}
