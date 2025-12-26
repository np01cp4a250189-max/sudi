package week08workshop;


/**
 * Write a description of class ElectricityBill here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ElectricityBill
{
    
    
    private String consumerName;
    private int unitsConsumed;

    
    public ElectricityBill(String consumerName, int unitsConsumed) {
        this.consumerName = consumerName;
        this.unitsConsumed = unitsConsumed;
    }

    
    public void setUnitsConsumed(int unitsConsumed) {
        this.unitsConsumed = unitsConsumed;
    }

    
    public int getUnitsConsumed() {
        return unitsConsumed;
    }

    
    public double calculateBill() {
        double bill;

        if (unitsConsumed <= 100) {
            bill = unitsConsumed * 5;
        } else {
            bill = (100 * 5) + ((unitsConsumed - 100) * 8);
        }

        return bill;
    }

    
    public String getConsumerName() {
        return consumerName;
    }
}
