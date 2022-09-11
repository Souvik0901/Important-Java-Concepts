// Program of static method 
// A static method belongs to the class rather than object of a class.
// A static method can be invoked without the need for creating an instance of a class.
// static method can access static data member and can change the value of it. 
class Student
{
   int rollno;
   String name;
   static String college = "BPPIMT";

   static void change()
   {
      college = "JU";
   }

   Student(int r, String n)
   {
       rollno = r;
       name = n;
   }

   void Display()
   {
    System.out.println(rollno+" "+name+" "+college);
   }
}



class code04_using_static_methods 
{
    public static void main(String args[])
    {

       Student.change(); 
       Student s1 = new Student(47,"Rishav Sarkar");
       Student s2 = new Student(21, "Antra Gupta");
       Student s3 = new Student(32, "Swaraj Khan");

       s1.Display();
       s2.Display();
       s3.Display();

    }
}
