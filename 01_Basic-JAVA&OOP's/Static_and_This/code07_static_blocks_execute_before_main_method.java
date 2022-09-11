
// Program of static block
// Is used to initialize the static data member.
// It is executed before main method at the time of classloading.



public class code07_static_blocks_execute_before_main_method {
    static
    {
        System.out.println("Static Blocke is Invoked");

    }

    public static void main(String args[])
    {
        System.out.println("Souvik Here!");
    }
}
