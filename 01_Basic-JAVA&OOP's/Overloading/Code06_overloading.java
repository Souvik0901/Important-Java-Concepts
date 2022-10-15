//code6_method_overloading_with_argument_type_promotion
class Adder{
    void add(int a, long b)
    {
        System.out.println("Sum :" + (a+b));
    }

    void add(int a, int b, int c)
    {
        System.out.println("Sum :" + (a+b+c));
    }
}



public class Code06_overloading {
    
    public static void main(String args[])
    {
       Adder obj =  new Adder();
       obj.add(2, 8);      // Now second int literal will be promoted to long
       obj.add(4, 9, 5);
    }
}
