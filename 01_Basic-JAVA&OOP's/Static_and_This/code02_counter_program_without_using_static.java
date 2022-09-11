
class Counter
{
    int count =0;  // Will get memory when instance is created
    
    Counter()
    {
        count++;
        System.out.println(count);
    }
}




public class code02_counter_program_without_using_static {
     public static void main(String args[])
     {
        Counter C1= new Counter();
        Counter C2= new Counter();
        Counter C3= new Counter();
     }
}
