package Tutorial;

public class Bank
{
    private String name;
     int  fd;  //default can access within package but outside package it can't
    protected int savings; // Protected can access within the package 
    public  Bank()
    {
        name = "Souvik Sen";
        savings= 20000;
        fd= 40000;

    }
    protected void Bankdetails() // It can't accessed outside package (If the class is not Child class)
    {
        System.out.println("Protected Function\n");
    }

    public void Show()
    {
        System.out.println("\nName:"+ this.name+"\nSavings Bal:"+ this.savings +"\nFixed Deposit Bal:"+this.fd);
    }
}