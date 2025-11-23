import java.util.Scanner;
/**
 * Write a description of class RickshawFare here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class RickshawFare
{  public static void main(String[] args) {
    
    Scanner input= new Scanner(System.in);
     
        System.out.println("Enter Distace to be Travelled in KM");
        double dis = input.nextDouble();
        
        System.out.println("Enter Time in Minutes");
        double time = input.nextDouble();
        
        System.out.println("Is the customer a local?(yes/no)");
        String isLocalInput = input.next();
        boolean isLocal = isLocalInput.equalsIgnoreCase("yes");
        
        System.out.println("Is it night travel?(yes/no)");
        String isNightInput = input.next();
        boolean isNight = isNightInput.equalsIgnoreCase("yes");
        
        //Fare rules
        double baseFare = 70;
        double perkm = 40;
        double perMin = 4;
        double nightRateExtra = 0.40;
        double localDiscount = 0.20;
        
        double fare = baseFare + (dis * perkm) + (time * perMin);
        
        fare = (isLocal) ? fare - (fare * localDiscount) : fare;
        
        fare = (isNight) ? fare + (fare * nightRateExtra) : fare;
        
        System.out.println("----------------------------");
        System.out.println("Final Fare: Rs. "+ fare);
        System.out.println("----------------------------");
    }
}
    

