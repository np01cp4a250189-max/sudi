package week09tutorial
;


/**
 * Write a description of class vehcile here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class vehicle
{
    protected int vehicleID;
    protected String brand;
    protected double BasePrice;
    
    public vehicle(int vehicleID, String brand, double BasePrice)
    {
        this.vehicleID= vehicleID;
        this.brand= brand;
        this.BasePrice= BasePrice;
        
    }
    
    void displayVehicleInfo()
    {
        System.out.println("The vehicleID of this vehicle is"+this.vehicleID);
        System.out.println("The brand name of this vehicle is "+this.brand);
        System.out.println("The base price of this vehicle is"+this.BasePrice);
        
    }
    double calculateTax()
    {
        return(0.1+BasePrice);
        
    }
}

