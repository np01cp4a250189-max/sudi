
/**
 * Write a description of class MathOperator here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MathOperators
{ 
    public static void main(String[] args){
     
    // Arithmetic operator
    
    int a = 10;
    int b = 20;  
    
    int sum = a+b;
    System.out.println("The sum of a and b is: " + sum);
    
    int difference = a-b;
    System.out.println("The difference of a and b is:" + difference);
    
    int multiply =a*b;
    System.out.println("The multiply of a and b is:" + multiply);
    
    int divide = a/b;
    System.out.println("The divide of a and b is:" + divide);
    
    //Unary operater
    
    System.out.println("Post increment = " + a++);
    System.out.println("value of a = " + a);
    System.out.println("Pre increment = " + ++a);
    
    
    System.out.println("Post decrement = " + a--);
    System.out.println("value of a = " +a);
    System.out.println("Pre decrement = " + --a);
    
    
    //Assignment operator
    
    int m = 3;
    int n = 5;
    int o = m+n;
    
    //relational operator
    
    int y = 7;
    int z = 9;
    
    System.out.println( y < z);
    
    //logical operator
    
    System.out.println(a > b && a != b);
    
    //ternary operator
    
    String isValid =(a > b) ? "A is greater than B" : "B is greater than A" ;
    System.out.println(isValid);
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
}