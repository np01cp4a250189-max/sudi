import java.util.Scanner;

/**
 * Write a description of class PassorFail here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class PassorFail
{
    public static void main (String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your grades = ");
        int grade = input.nextInt();
        String isValid = (grade >= 40) ? "PASS" : "FAIL";
        System.out.println(isValid);
        
        
        
    }
}