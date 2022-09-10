public class code03_Variables_narrowing_by_type_casting {
    public static void main(String args[])
    {
        float f = 10.5f;
        //int a = f; // Compiler time error
        int a =(int)f;
        System.out.println(f);
        System.out.println(a);
    }
}
