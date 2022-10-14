class Student{
    int roll;
    int age;
    String name;
    float fees;
    Student(int roll, int age, String name)
    {
       this.roll=roll;
       this.age=age;
       this.name=name;
    }
    Student(int roll, int age, String name, float fees)
    {
       this(roll,age,name);
       this.fees=fees;
    }
    void display()
    {
        System.out.println("Name: "+this.name+ " Age: "+this.age+" Roll: "+this.roll+" Fees: "+this.fees);
    }
}



public class code15_this {
    public static void main(String args[])
    {
       Student obj1 = new Student(12,21,"Antu Rana");
       Student obj2 = new Student(22,22,"Souvik Sen",50000f);
       obj1.display();
       obj2.display();

    }
}
