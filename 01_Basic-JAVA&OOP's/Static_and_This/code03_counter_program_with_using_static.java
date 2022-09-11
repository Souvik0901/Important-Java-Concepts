
class Counter
{
    static int count =0;  // Will get memory only  once and retain its value
    
    Counter()
    {
        count++;
        System.out.println(count);
    }
}




public class code03_counter_program_with_using_static {
     public static void main(String args[])
     {
        Counter C1= new Counter();
        Counter C2= new Counter();
        Counter C3= new Counter();
     }
}
