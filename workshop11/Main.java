package workshop11;


/**
 * Write a description of class maize here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
 public class Main {
    public static void main(String[] args) {

        Crop rice = new Rice("Rice", "Monsoon", 2.0);
        rice.displayCropInfo();
        System.out.println("Yield: " + rice.calculateYield() + " tons");
        System.out.println("Water Required: " + rice.calculateWaterRequirement() + " liters");

        Logistics riceLogistics = (Logistics) rice;
        riceLogistics.estimateTransportCost();
        riceLogistics.estimateStorageRequirement();

        System.out.println("--------------------------------");

        Crop wheat = new Wheat("Wheat", "Winter", 1.5);
        wheat.displayCropInfo();
        System.out.println("Yield: " + wheat.calculateYield() + " tons");
        System.out.println("Water Required: " + wheat.calculateWaterRequirement() + " liters");
    }
}