

class A{
    int z;
    public void addition(int x, int y)
    {
        z = x+y;
        System.out.println("Addition of x, y will be "+z);
    }

    public void subtract(int x, int y)
    {
        z = x-y;
        System.out.println("Substraction of x, y will be "+z);
    }
}





public class code05_single_inheritance_multiple_methods extends A {
   
     void multiplication(int x, int y)
    {
         z= x*y;
         System.out.println("Multiplication of x, y will be "+z);
    }

    public static void main(String args[])
    {
         
         int a = 10;
         int b = 40;
        
         code05_single_inheritance_multiple_methods obj = new code05_single_inheritance_multiple_methods();
         obj.addition(a,b);
         obj.subtract(a,b);
         obj.multiplication(a, b);

    }
}
