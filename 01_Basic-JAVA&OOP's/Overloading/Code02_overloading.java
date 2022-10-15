
//code2_method_overloading2_changing_data_types_of_arguments

class Adder
{
     static int add(int a, int b){return a+b;}
     static double add(double a, double b, double c)
     {
        return a+b+c;
     }
}





public class Code02_overloading {
    public static void main(String args[])
    {
         System.out.println(Adder.add(2.6, 03.5, 4.5));
         System.out.println(Adder.add(3,4));
    }
}
