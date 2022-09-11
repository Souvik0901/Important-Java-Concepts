class Outer_Demo
{
     int num;

     //Inner Class
     private class Inner_Demo
     {
        public void Fun()
        {
            System.out.println("This is an Inner CLASS");
        }   
     }
    
     void display_inner()
     {
        Inner_Demo i = new Inner_Demo();
        i.Fun();
     }
    

}

public class code1_basic_inner_class {
    public static void main(String args[])
    {
        Outer_Demo O = new Outer_Demo();
        O.display_inner();
    }
}
