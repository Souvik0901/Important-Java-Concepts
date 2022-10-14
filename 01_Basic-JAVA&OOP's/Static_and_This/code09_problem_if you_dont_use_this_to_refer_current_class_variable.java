//09 if you dont use this to refer current variable
 class Student
 {
    public  int roll;
    public String name;
    public float fees;
    public Student(int roll, String name, float fees)
    {
        roll=roll;
        name =name;
        fees=fees;
    }

    public void display()
    {
        System.out.println(roll+" "+name+" "+fees);
    }
 }




 
  public class code09_this
 {
    public static void main(String args[])
    {
        Student obj = new Student(12,"Aniket",34500f);
        obj.display();
    }
}
