import java.util.Scanner;
/**
 * Write a description of class week4qno8 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class week4qno8
{
    public static void main (String [] args){
Scanner input = new
Scanner (System.in);
System.out.println("enter the GPA") ;
float gpa = input.nextFloat();
if (gpa<=1.8)
System.out.println("NOT GRADED");
else if (gpa>=1.8 && gpa<=2.5)
System.out.println("C");
else if (gpa>2.5 && gpa<=2.8)
System.out.println("C+");
else if (gpa>2.8 && gpa<=3.15)
System.out.println("B");
else if (gpa>3.15 && gpa<=3.25)
System.out.println("B+"); 
else if (gpa>3.25 && gpa<=3.6)
System.out.println("A");
else if (gpa>3.6)
System.out.println("A+");
}
}