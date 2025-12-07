import java.util.Scanner; 
/**
 * Write a description of class week4qno9 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class week4qno9
{
    public static void main (String[] args){
     Scanner input = new Scanner (System. in) ;
     System.out.println("enter the GPA");
      float gpa = input.nextFloat();
       System.out.println("enter the attendance");
       float atte = input.nextFloat();
      System.out.println("enter the attitude score");
       float atti = input.nextFloat();

     if (gpa >= 3.2)
    if
     (atte >80)
      if
      (atti <5)
        System.out.println("student is eligible for a scholarship");
      else
             System.out.println("student is eligible for a scholarship atti>5");

      else
            System.out .println( "student is eligible for a scholarship atte>80" );

  else
              System.out.println("student is not eligible for a scholarship gpa is less than 13.2") ;
}
}