package week09tutorial;


/**
 * Write a description of class c here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class BankApp {
    public static void main(String[] args) {

        
        SavingsAccount sa = new SavingsAccount(101, "Ram", 5000, 5);
        sa.deposit(2000);
        sa.addInterest();
        System.out.println("Savings Balance: " + sa.getBalance());

        System.out.println("--------------------------------");

        
        CurrentAccount ca = new CurrentAccount(201, "Sita", 3000, 2000);
        ca.deposit(1000);
        ca.withdraw(5000);
        System.out.println("Current Balance: " + ca.getBalance());
    }
}

