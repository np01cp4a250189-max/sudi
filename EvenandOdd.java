import java.util.Scanner;

/**
 * Write a description of class EvenandOdd here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class EvenandOdd
{ public static void main(String[] args) {
    Scanner input= new Scanner(System.in);
    System.out.println("Enter your number= ");
    int num= input.nextInt();
     if(num%2== 0) {
         System.out.println("It is even");
        
     }
     else{
         System.out.println("It is odd");
         
     }
    
    
}
}