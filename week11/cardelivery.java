package week11;


/**
 * Write a description of class cardelivery here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class cardelivery extends Delivery implements Notification
{
    private static final double PER_KM_CHARGE=60;
    private static final double MIN_PER_KM=5;
    
    public cardelivery( int orderId, double distanceInkm, String pickUp, String dropOff){
        super(orderId, distanceInkm, pickUp, dropOff);
        
    }
    
    @Override
    public double calculateCharge() {
        return super.getDistance() * PER_KM_CHARGE;
        
    }
    
    @Override
    public double estimateTime(){
        return super.getDistance() * MIN_PER_KM;
    }
    
    @Override
    public void notify(String message){
        System.out.println(message);
    }
    
    public void display(){
        System.out.println("Charge"+ this.calculateCharge());
    }
    
}