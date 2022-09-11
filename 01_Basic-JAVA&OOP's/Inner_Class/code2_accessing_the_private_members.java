class Outer_Demo{
    private int num = 175;

    class Inner_Demo{
        public int getnum(){
            System.out.println("This is the getnum method of inner class");
            return num;
        }
       
    }
}



public class code2_accessing_the_private_members {
    public static void main(String args[])
    {
        // Instantiating the outer class
        Outer_Demo O = new Outer_Demo();
        

        // Instantiating the inner class
        Outer_Demo.Inner_Demo i =  O.new Inner_Demo();
        System.out.println(i.getnum());
    }
}
