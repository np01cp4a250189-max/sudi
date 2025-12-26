package week08workshop;


/**
 * Write a description of class bankaccounttest here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Atm
{
    public static void main(String [] args) {
      

        
        BankAccount acc = new BankAccount(101, "Neharika", 5000);
        acc.deposit(2000);
        System.out.println("Balance after deposit: " + acc.getBalance());

        
        if (acc.withdraw(3000)) {
            System.out.println("Withdrawal successful");
        } else {
            System.out.println("Insufficient balance");
        }

        
        System.out.println("Final Balance: " + acc.getBalance());
    }
}
    
