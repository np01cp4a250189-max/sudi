package week08workshop;


/**
 * Write a description of class electricity here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class electricity
{
     public static void main(String[] args) {

        ElectricityBill bill = new ElectricityBill("Ram", 150);

        System.out.println("Consumer Name: " + bill.getConsumerName());
        System.out.println("Units Consumed: " + bill.getUnitsConsumed());
        System.out.println("Total Bill: ₹" + bill.calculateBill());
    }
}
