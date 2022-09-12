
class Superclass
{
    int age;

    Superclass(int age)
    {
       this.age = age;
    }

    public void getage()
    {
        System.out.println("The value of the variable named age in super class is :" +age);
    }

}



public class code06_using_super_keyword_invoking_superclass_constructor  extends Superclass{
      
    code06_using_super_keyword_invoking_superclass_constructor(int age)
    {
         super(age);
    }

    public static void main(String args[])
    {
        code06_using_super_keyword_invoking_superclass_constructor obj = new code06_using_super_keyword_invoking_superclass_constructor(24);
        obj.getage();
    }
    
}
