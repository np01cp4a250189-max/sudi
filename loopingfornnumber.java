import java.util.Scanner;

/**
 * Write a description of class loopingfornnumber here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class loopingfornnumber

{
    public static void main(String[] args) {
        // sum of n natural numbers;
        
        Scanner input= new Scanner(System.in);
        System.out.println("Ask for n number:");
        int n= input.nextInt();
        int sum= 0;
        
        for( int i=1; 1<=n; i++) 
        {
            sum= sum+i;
            System.out.println(sum);
            
        }
        
    
}
}