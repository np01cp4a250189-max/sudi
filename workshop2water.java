
/**
 * Write a description of class workshop2water here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class workshop2water
{
   

    public static void main(String[] args) {

        
        int waterLevel = 1000;   

        
        System.out.println("Current Water Level: " + waterLevel + " liters");

        
        String message = (waterLevel >= 1000)
                ? "WARNING: Water level has reached 1000L or more!"
                : "Status: Normal";

        
            
        System.out.println(message);
    }
}

