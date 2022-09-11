
class Outer_Demo{

    void MethodLocal_Fun()
    {
        int num = 30;

        //method-local inner class
        class Inner_Demo
        {
            public void print()
            {
                System.out.println("This is method inner class "+ num);
            }
        }

        //Accessing the InnerClass
        Inner_Demo i = new Inner_Demo();
        i.print();
    }
}





public class code3_methodLocal_inner_class {
    public static void main(String args[])
    {
        Outer_Demo O = new Outer_Demo();
        O.MethodLocal_Fun();
    }
}
