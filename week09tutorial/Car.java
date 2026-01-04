package week09tutorial;


/**
 * Write a description of class car here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Car extends vehicle

{
  
    private int numberOfDoors;
    private String fuelType;

    
    public Car(int vehicleId, String brand, double basePrice,int numberOfDoors, String fuelType) {
        super(vehicleId, brand, basePrice);
        this.numberOfDoors = numberOfDoors;
        this.fuelType = fuelType;
    }

    
    public double calculateFinalPrice() {
        double tax = super.calculateTax();
        double luxuryCharge = BasePrice * 0.05;
        return BasePrice + tax + luxuryCharge;
    }

    
    public void displayCarInfo() {
        super.displayVehicleInfo();
        System.out.println("Number of Doors: " + numberOfDoors);
        System.out.println("Fuel Type: " + fuelType);
        System.out.println("Tax: " + calculateTax());
        System.out.println("Final Price: " + calculateFinalPrice());
    }
}
