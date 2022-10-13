import Tutorial.Bank;

public class BankDetails {
        private void Display()  // Private Access Only within a class. 
                                  // can't be accessed from outside the class.
        {
            System.out.println("Hi!");
        }
    
    public static void main(String args[])
    {
         
           BankDetails obj2= new BankDetails();
           obj2.Display();
        

        Bank obj = new Bank();
        obj.Show();
        //obj.Bankdetails();    can't accessed from outside package, coz its protected
       
        
       
    }
}
