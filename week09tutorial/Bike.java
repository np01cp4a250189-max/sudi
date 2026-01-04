package week09tutorial;


/**
 * Write a description of class bike here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Bike extends vehicle
{
    
    private int engineCapacity;

    
    public Bike(int vehicleId, String brand, double basePrice,
                int engineCapacity) {
        super(vehicleId, brand, basePrice);
        this.engineCapacity = engineCapacity;
    }

    
    public double calculateFinalPrice() {
        return BasePrice + super.calculateTax();
    }

    
    public void displayBikeInfo() {
        super.displayVehicleInfo();
        System.out.println("Engine Capacity: " + engineCapacity + "cc");
        System.out.println("Tax: " + calculateTax());
        System.out.println("Final Price: " + calculateFinalPrice());
    }
}
    
