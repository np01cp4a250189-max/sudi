package workshop11;


/**
 * Write a description of class circle here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class circle extends shape
{
    private int radius;
    
    public circle(int radius){
        this.radius = radius;
    
    }
    
    @Override
    public double calculateArea(){
        
        double Area = (22/7)*radius*radius;
        return Area;
        
    }
    @Override
     public double calculatePerimeter(){
         double Perimeter = (2*22*radius)/7;
         return Perimeter;
         
     }
     
    @Override
    public void draw(){
        System.out.println("This is circle");
    }
     
}