//code8_method_overloading_with_argument_type_promotion_ambiguity_gives_error

class Student
{
    void a(int a, long b)
    {
        System.out.println("1st method gets invoked");
    }

    void a(long a, int b)
    {
        System.out.println("2nd method gets invoked");
    }
}



public class Code08_overloading {
    public static void main(String args[])
    {
        Student obj = new Student();
        obj.a(2, 9); //now ambiguity , Error
    }
    
}