//14 'this' keyword is used to invoke current parameterized constructor

class Student{
    Student()
    {
        this(19);// invoke parameterized constructor
       System.out.println("Default Constractor");
    }
    Student(int x)
    {
        System.out.println(x);

    }
}

public class code14_this {
    public static void main(String args[])
    {
         Student  obj = new Student();
    }
}
