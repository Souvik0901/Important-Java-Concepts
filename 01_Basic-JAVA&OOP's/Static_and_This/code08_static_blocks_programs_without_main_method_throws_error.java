
// Program of static block
// Is used to initialize the static data member.
// It is executed before main method at the time of classloading.

// It was possible to execute programs without the main method (before JDK7) as shown below
// But it is not allowed since JDK7 and throws ERROR



public class code08_static_blocks_programs_without_main_method_throws_error {
    static{
        System.out.println("static block is involved");
        System.exit(0);//ERROR, Main method Not Found
    }
}
