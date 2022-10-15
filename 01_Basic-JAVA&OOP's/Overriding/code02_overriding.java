//code2_method_overriding_runs_the_method_at_runtime
class Student
{
    void study()
    {
        System.out.println("We are studing in class 10");
    }
}

class Kids extends Student{
    void Study()
    {
        System.out.println("We are studing in class 1");
    }
    void Play()
    {
        System.out.println("We are playing indoor game");
    }
}

public class code02_overriding {
    
    public static void main(String args[])
    {
        Student a= new Student(); // Student reference and object
        Student b= new Kids();    // Student reference and Kids object
        a.study();
        b.study();
        b.Play();                //b's reference type Student does not have a play method

    }
    
}
