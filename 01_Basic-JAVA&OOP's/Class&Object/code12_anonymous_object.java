// Anonymous Simply means nameless
// An object which has no reference is known as anonymous object
// It Creates at the time of object creation only.




 class code12_anonymous_object 
{
    void fact(int n)
   {
        int fact=1;
        for(int i=1; i<=n; i++)
        {
            fact= fact*i;
        }
   
        System.out.println("Factorial is "+fact);
   }

    public static void main(String args[])
    {
       new code12_anonymous_object().fact(5); // Calling method with anonymous object
    }
}
