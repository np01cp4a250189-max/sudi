package workshop11;


/**
 * Write a description of class rice here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Rice extends Crop implements Logistic {

    public Rice(String cropName, String season, double landArea) {
        super(cropName, season, landArea);
    }

    @Override
    public double calculateYield() {
        return landArea * 4.5; 
    }

    @Override
    public double calculateWaterRequirement() {
        return landArea * 1200;
    }

    @Override
    public void estimateTransportCost() {
        System.out.println("Rice Transport Cost: NPR " + (landArea * 2000));
    }

    @Override
    public void estimateStorageRequirement() {
        System.out.println("Rice Storage Required: " + (landArea * 5) + " tons");
    }
}