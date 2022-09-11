// The static method can not use non static data member or call non-static method directly.
// this and super cannot be used in static context.

class code06_static_methods_cannot_use_non_static_variable_or_method {
     int a = 40; // non static
    public static void main(String args[])
    {
      System.out.println(a); // ERROR : Compile Time Error
    }

}
