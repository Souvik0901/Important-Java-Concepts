
//12 'this' keyword to invoke current class method

class Student
{
    void add()
    {
        System.out.println("Addition Function");

    }

    void multi()
    {
        System.out.println("Multiplication Function");
        this.add();
    }
}






public class code12_this {
    public static void main(String args[])
    {
        Student obj = new Student();
        obj.multi();
    }
    
}
