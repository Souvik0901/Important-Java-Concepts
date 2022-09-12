
class A{
    void msg()
    {
        System.out.println("Hello");
    }
}

class B{
      void msg()
      {
        System.out.println("Welcome to Kolkata");
      }
}


class code04_problem_of_multiple_inheritance_through_class extends A,B {  // Suppose If It Possible
    public static void main(String args[])
    {
        code04_problem_of_multiple_inheritance_through_class obj = new code04_problem_of_multiple_inheritance_through_class();
        obj.msg(); //Now Which msg() method would be invoked?
    }
}
