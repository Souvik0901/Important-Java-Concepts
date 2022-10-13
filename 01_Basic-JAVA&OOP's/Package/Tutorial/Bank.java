package Tutorial;

public class Bank
{
    public String name;
    public int  fd;
    public int savings;
    public  Bank()
    {
        name = "Souvik Sen";
        savings= 20000;
        fd= 40000;

    }
    public void Show()
    {
        System.out.println("\nName:"+ this.name+"\nSavings Bal:"+ this.savings +"\nFixed Deposit Bal:"+this.fd);
    }
}