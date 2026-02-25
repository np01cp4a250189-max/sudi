package workshop11;


/**
 * Write a description of class rectangle here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class rectangle extends shape 
{
    private int length;
    private int height;
    private int breadth;
    
    public rectangle (int length, int height, int breadth){
        this.length = length;
        this.height = height;
        this.breadth = breadth;
        
    }
    @Override
    public double calculateArea() {
        return this.length*breadth;
    }
    
    @Override
    public double calculatePerimeter(){
        return 2 * (this.length + this.breadth);
    }
    
    @Override
    public void draw(){
        System.out.println("This is circle");
    }
    
    
}