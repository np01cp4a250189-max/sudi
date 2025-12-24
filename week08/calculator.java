package week08;


/**
 * Write a description of class calculator here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class calculator
{
    //instance method
    //void return type + no parameters
    public void displayInfo() {
        System.out.println("Welcome to calulator app");
    
    }
    //void return type + parameters
    public void add(int a, int b)  // formal parameter
    { 
        System.out.println("The sum of two number are: "+(a+b));
        
    }
    //return type + no parameters
    
    public int getFixedNumber() 
    {
        return 10;
    }
    //return types +parameters
    public int multiply(int c, int d)
    {
        int mul = c*d;
        return mul;
    }
    //Static method
    public static int square(int a) {
        return a*a;
    }
}