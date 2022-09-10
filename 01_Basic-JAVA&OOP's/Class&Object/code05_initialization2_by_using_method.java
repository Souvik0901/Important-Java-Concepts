class Student{
    int rollno;
    String name;

    void insertRecord(int r, String n)
    {
        rollno= r;
        name= n;
    }

    void display()
    {
        System.out.println(rollno+" "+name);
    }
}


public class code05_initialization2_by_using_method {
    public static void main(String args[])
    {
        Student s1 =new Student();
        Student s2 =new Student();
        s1.insertRecord(111,"Antareep");
        s2.insertRecord(122,"Antra");
        s1.display();
        s2.display();

    }
}
