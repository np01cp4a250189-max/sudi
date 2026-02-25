package workshop16;
import java.util.Scanner;

/**
 * Write a description of class task2 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class task2
{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input =sc.nextLine();
        
        String trimmed = input.trim();
        System.out.println("After trim: " +trimmed);
        
        if (trimmed.length()>=10) {
            System.out.println("Frist 10 characters:" + trimmed.substring(0,10));
            
        }
        String [] words= trimmed.split("");
        System.out.println("Words");
        for (String word : words) {
            System.out.println(word);
        }
        
    }
}
    
    