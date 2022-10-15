
//code5_method_overloading_we_can_also_overload_main_method_though_useless


public class Code05_overloading {

    
    public static void main(String args[])         // You can have any number of main methods in a class by method overloading. 
                                                   // But JVM calls main() method which receives string array as arguments only.
    {
       System.out.println("Main with String[]");
    }

    public static void main(String args)
    {
       System.out.println("main with String");
    }

    public static void main()
    {
        System.out.println("main without String");
    }
}
