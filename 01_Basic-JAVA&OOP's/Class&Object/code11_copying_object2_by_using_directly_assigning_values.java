
class Student
{
    int id;
    String name;
    Student(int i, String n)
    {
        id=i;
        name =n;
    }
    Student()
    {

    }
    void display()
    {
        System.out.println(id+" "+name);
    }
}

public class code11_copying_object2_by_using_directly_assigning_values {
    public static void main(String args[])
    {
       Student s1= new Student(98,"King");
       Student s2 = new Student();
       s2.id=s1.id;
       s2.name = s1.name;
       s1.display();
       s2.display();
    }
}
