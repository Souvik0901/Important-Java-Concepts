
//13 'this' keyword to invoke current default constructor
class Student{
    Student()
    {
      System.out.println("Hello! default Constructor");
    }
    Student(int x)
    {
        this(); // It's use to invoke default Constructor
        System.out.println(x);
    }
}



public class code13_this {
    public static void main(String args[])
    {
        Student obj = new Student(12);
        
    }
}
