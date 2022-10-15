
//code7_method_overloading_with_argument_type_promotion_exact_match_found

class Student
{
    void a(int a, int b)
    {
        System.out.println("int arg a() method gets invoked");
    }

    void a(long a, long b)
    {
        System.out.println("long arg a() method gets invoked");
    }
}



public class Code07_overloading {
    public static void main(String args[])
    {
        Student obj = new Student();
        obj.a(2, 9); //now int arg a() method gets invoked  
    }
    
}
