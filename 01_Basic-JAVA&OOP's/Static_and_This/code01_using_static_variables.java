
// Java Static Property is shared to all objects.
// It makes your program memory efficient (i.e it saves memory)
// The static variable gets memory only once in class area at the time of class loading




class Student
{
    int rollno;
    String name;
    static String college="BPPIMT";

    Student(int r, String n)
    {
      rollno = r;
      name = n;
    }

    void Display()
    {
        System.out.println(rollno+ " " +name+" "+college);
    }

}


public class code01_using_static_variables 
{
    public static void main(String args[])
    {
       Student s1 = new Student(22, "Souvik Sen");
       Student s2 = new Student(46,"Hrittick Garain");
       s1.Display();
       s2.Display();
    }
}
