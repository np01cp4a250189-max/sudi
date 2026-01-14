package week11;


/**
 * Write a description of class delivery here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public abstract class Delivery
{
   private int orderId;
   private double distanceInKm;
   private String pickUpLocation;
   private String dropOffLocation;
   
   public Delivery( int orderId, double distanceInkm, String pickup, String dropOff){
       this.orderId= orderId;
       this.distanceInKm= distanceInKm;
       this.pickUpLocation= pickUpLocation;
       this.dropOffLocation= dropOff;

}
public int getOrderId(){
    return this.orderId;
    
}

public double getDistance(){
    return this.distanceInKm;
    
}

public String getpickUpLocation(){
    return this.pickUpLocation;
    
}

public String getdropOffLocation(){
    return this.dropOffLocation;
    
}

abstract double calculateCharge();
abstract double estimateTime();
}
