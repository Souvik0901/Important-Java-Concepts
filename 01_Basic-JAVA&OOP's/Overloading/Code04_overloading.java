
class Adder
{
     static int add(int a, int b)
     {
        return a+b;
     }
     static double add(int a, int b)
     {
        return a+b;
     }
}





public class Code03_overloading {
    public static void main(String args[])
    {
       System.out.println(Adder.add(3, 4));// ambiguity //Error
       
    }
}
