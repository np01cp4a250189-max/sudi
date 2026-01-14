package week11;


/**
 * Write a description of class DeliveryApp here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class DeliveryApp
{
    public static void main (String[] args){
        Delivery d1= new cardelivery(101, 12, "Budanilkantha","lagankhel");
        System.out.println(d1.calculateCharge());
    }
}