package week07senario;


/**
 * Write a description of class main here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class main
{

    public static void main (String[]args)
    {
    
        BankAccount Customer1 = new BankAccount(0001, "Sudi", 180000);
        
        Customer1.displayDetails();
        Customer1.depositamt(1000);
        Customer1.withdrawl(-200);
        Customer1.currentbalance();
         
        System.out.println();
        
        BankAccount Customer2 = new BankAccount(0011, "Neha", 8000);
        
        Customer2.displayDetails();
        Customer2.depositamt(40000);
        Customer2.withdrawl(40000);
        Customer2.currentbalance();
    
    }
}
