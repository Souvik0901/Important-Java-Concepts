public class code08_operators_unary_example3
{
    public static void main(String args[])
    {
        int a=10;
        int b=-10;
        boolean c= true;
        boolean d= false;
        System.out.println(~a); //-11 (minus of total positive values which starts from 0)
        System.out.println(~b); //9 (Positive of total minus, positive starts from 0)
        System.out.println(!c); //False (opposite of boolean Value)
        System.out.println(!d); //true
    }
}
