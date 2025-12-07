import java.util.Scanner;
/**
 * Write a description of class Ifelsepassorfail here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Ifelsepassorfail
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your grades = ");
        
        int grade= input.nextInt();
        
        if(grade>=40) {
            System.out.println("it is pass");
        }
        else
        {
            System.out.println("it is fail");
            
        }
            
        
        
    }
}