package week08;


/**
 * Write a description of class main here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class main
{
    public static void main(String [] args) {
        calculator calc = new calculator();
        // invoking a method or method invocation
        calc.displayInfo();
        calc.add(10,20);  //actual parameters
        calc.add(30,40);
        calc.add(50,60);
        
        calc.getFixedNumber();
        int fixnum= calc.getFixedNumber();
        System.out.println("The fix number is :" +(fixnum));
        
        int multi= calc.multiply(10,20);
        int multi1= calc.multiply(30,40);
        
        System.out.println("The multiplication of first two numbers are:"+ multi);
        
        calculator.square(10);
        
        
        
        
        
    }
}