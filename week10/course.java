package week10;


/**
 * Write a description of class course here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class course
{
    private int courseId;
    private String courseName;
    private double baseFee;
    
    public course(int courseId, String courseName, double baseFee) {
        this.courseId= courseId;
        this.courseName= courseName;
        this.baseFee= baseFee;
        
    }
    public void setcourseId(int newId) {
        this.courseId= newId;
        
    }
    public int getcoursetId() {
        return this.courseId;
        
    }
    public void setcourseName(String courseName) {
        this.courseName= courseName;
        
    }
    public String getcourseName() {
        return this.courseName;
        
    }
    public void setbaseFee(int baseFee){
        this.baseFee= baseFee;
    }
    public double getbaseFee() {
        return this.baseFee;
    }
    
    public double calculateFee(){
      return this.baseFee;
      
    }
    
    public double calculateFee(double discountAmount){
        return this.baseFee-discountAmount;
    }
    
    public void displaycourse() {
        System.out.println("course Id: "+ this.courseId);
        System.out.println("course Name: "+ this.courseName);
                
    }
    
    
}