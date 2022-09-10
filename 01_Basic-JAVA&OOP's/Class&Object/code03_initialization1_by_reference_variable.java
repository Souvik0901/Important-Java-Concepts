class stu
{
    int id;
    String name;
}

public class code03_initialization1_by_reference_variable{
    public static void main(String[] args)
    {
        stu s1 = new stu(); 
        s1.id = 101; //Initialization
        s1.name ="Souvik"; //Initialization
        System.out.println(s1.id+" "+s1.name); // Printing te members with a white space

    }
}
