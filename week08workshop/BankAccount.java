package week08workshop;


/**
 * Write a description of class bankaccount here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

    public class BankAccount {

    
    private int accountNumber;
    private double balance;
    private String name;

    public BankAccount(int accountNumber, String name, double balance) {
        this.accountNumber = accountNumber;
        this.name = name;
        this.balance = balance;
    }


    public double getBalance() {
        return balance;
    }

    
    public void deposit(double amount) {
        if (amount > 0) {
            balance = balance + amount;
        }
    }

    public boolean withdraw( double amount) {
        if (amount > 0 && balance >= amount){
            System.out.println("Succesfully Withdraw");
            return true;
        }
    
        return false;
        
    }
    
}
