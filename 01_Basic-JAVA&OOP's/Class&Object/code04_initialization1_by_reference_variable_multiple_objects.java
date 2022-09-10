class Student
{
    int  id;
    String name;
}


public class code04_initialization1_by_reference_variable_multiple_objects 
{
    public static void main(String args[])
   {
      Student s1=new Student();
      Student s2=new Student();
      s1.id = 101;
      s1.name= "Virat Kholi";
      s2.id= 71;
      s2.name= "Yuvraj Singh";
      System.out.println(s1.id+" "+s1.name);
      System.out.println(s2.id+" "+s2.name);
   }
    
}
