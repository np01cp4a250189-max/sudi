package workshop11;


/**
 * Write a description of class wheat here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
 public class Wheat extends Crop implements Logistic {

    public Wheat(String cropName, String season, double landArea) {
        super(cropName, season, landArea);
    }

    @Override
    public double calculateYield() {
        return landArea * 3.2;
    }

    @Override
    public double calculateWaterRequirement() {
        return landArea * 800;
    }

    @Override
    public void estimateTransportCost() {
        System.out.println("Wheat Transport Cost: NPR " + (landArea * 1500));
    }

    @Override
    public void estimateStorageRequirement() {
        System.out.println("Wheat Storage Required: " + (landArea * 4) + " tons");
    }
}


