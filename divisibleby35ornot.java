import java.util.Scanner;

/**
 * Write a description of class divisibleby35ornot here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class divisibleby35ornot
{ 
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Enter the number=");
        int num= input.nextInt();
        if(num%3==0 && num%5==0) {
          System.out.println("It is divisible by 3 and 5");
        }  
        else {
            System.out.println("It is neither divisible by 3 nor 5");
        
            
        }
        }
        
    }
    
