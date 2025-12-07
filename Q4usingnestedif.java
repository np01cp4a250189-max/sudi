import java.util.Scanner;
/**
 * Write a description of class Q4usingnestedif here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Q4usingnestedif
{ 
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Enter the number=");
        int num= input.nextInt(); 
        
        if(num%3==0) {
            if(num%5==0) {
                System.out.println("the number is both divisible by 3 and 5");
            }
            else 
               System.out.println("the number is only divisible by 3");
            }
        else if (num%5==0){
            if (num%3==0){
                System.out.println("the number is divisible by both 3 and 5");
            }
            else{
                System.out.println("the number is only divisible by 5");
            } 
            }
            else{
                System.out.println("the number is neither divisible by 3 nor 5");
        }
    }
}