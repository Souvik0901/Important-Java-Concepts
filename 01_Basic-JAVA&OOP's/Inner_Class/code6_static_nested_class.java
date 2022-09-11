
 class Outer_Demo{
    static class Nested_Demo
    {
        public void Fun()
        {
            System.out.println("Hey man! I'm Souvik");
        }
    }
}




public class code6_static_nested_class {
    
    public static void main(String args[])
    {
        Outer_Demo.Nested_Demo N =   new Outer_Demo.Nested_Demo();
        N.Fun();
    }
}
