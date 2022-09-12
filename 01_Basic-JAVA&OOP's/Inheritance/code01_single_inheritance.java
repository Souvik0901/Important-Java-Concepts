
class Animal
{
    void eat()
    {
        System.out.println("Eating...");
    }


}


class Dog extends Animal
{
    void bark()
    {
        System.out.println("barking.......");
    }
}




public class code01_single_inheritance {
    public static void main(String args[])
    {
        Dog d = new Dog();
        d.bark();
        d.eat();
    }
}
