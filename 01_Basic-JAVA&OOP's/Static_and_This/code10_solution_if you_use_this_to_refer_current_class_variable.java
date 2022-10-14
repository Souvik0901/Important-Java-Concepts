
//10 if you use this to refer current variable
 class Student
 {
   public  int roll;
    public String name;
    public float fees;
    public Student(int roll, String name, float fees)
    {
        this.roll=roll;
        this.name =name;
        this.fees=fees;
    }

    public void display()
    {
        System.out.println(roll+" "+name+" "+fees);
    }
 }




 
  public class code10_this
 {
    public static void main(String args[])
    {
        Student obj = new Student(12,"Aniket",34500f);
        obj.display();
    }
}
