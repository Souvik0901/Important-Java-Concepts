//code3_method_overriding_using_the_super_keyword

class Animal
{
    public void move()
    {
        System.out.println("Animals can move");
    }
   
}

class Dog extends Animal
{
    public void move()
    {
        super.move();
        System.out.println("Dogs can run");
    }
}

public class code03_overriding {
    public static void main(String args[])
    {
       
        Animal obj2 = new Dog();
        obj2.move();
    
    }
}
