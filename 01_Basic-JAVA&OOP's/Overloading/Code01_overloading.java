//code1_method_overloading1_changing_no_of_arguments
class adder
{
    static int add(int a, int b, int c)
    {
        return a+b+c;
    }
    static int add(int a, int b)
    {
        return a+b;
    }
}




public class Code01_overloading {
    public static void main(String args[])
    {
         
         System.out.println(adder.add(4,6));
         System.out.println(adder.add(3,4,5));

    }
}
