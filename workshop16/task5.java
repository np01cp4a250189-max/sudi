package workshop16;
import java.util.Scanner;

/**
 * Write a description of class task5 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class task5
{
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String s1 = input.next();

        System.out.print("Enter second string: ");
        String s2 = input.next();

        StringBuilder sb = new StringBuilder(s1);
        sb.append(s2);
        sb.append(100);
        sb.append("@");
        System.out.println("Final String: " + sb.toString());
    }

}