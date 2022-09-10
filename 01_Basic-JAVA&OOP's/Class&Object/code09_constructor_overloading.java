

class Student{
    int id;
    String name;
    int age;

    Student(int i, String n)
    {
        id= i;
        name= n;
    }

    Student(int i, String n, int a)
    {
        id = i;
        name =n;
        age =a;
    }

    void display()
    {
        System.out.println(id+" "+name+" "+age);

    }
}

 class code09_constructor_overloading {
    public static void main(String args[])
    {
        Student st1 = new Student(111,"Souvik");
        Student st2= new Student(122,"Antra",24);
        st1.display();
        st2.display();
    }
}
