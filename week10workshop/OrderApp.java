package week10workshop;


/**
 * Write a description of class orderApp here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class OrderApp {
    public static void main(String[] args) {

        NormalOrder normal = new NormalOrder(101, "Ram", 1500);
        PremiumOrder premium = new PremiumOrder(102, "Sita", 2000);

        System.out.println("Normal Order Invoice:");
        System.out.println(normal);
        System.out.println("Final Amount: " + normal.calculateFinalAmount());

        System.out.println("\nPremium Order Invoice:");
        System.out.println(premium);
        System.out.println("Final Amount (no discount): " + premium.calculateFinalAmount());
        System.out.println("Final Amount (with discount): " + premium.calculateFinalAmount(300));
    }
}