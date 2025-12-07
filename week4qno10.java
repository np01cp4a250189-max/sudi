import java.util.Scanner;
/**
 * Write a description of class week4qno10 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class week4qno10
{
    
            public static void main (String[] args){
         Scanner input = new Scanner (System. in) ;
         System.out.println("enter the category");
        String cat = input.next();
           switch(cat)
             {
           case "AO":
              System.out.println("841 x 1189 mm (33.1 x 46.8 inches)");
           case "A1" :
              System.out.println("594 x 841 mm (23.4 x 33.1 inches)");
           case "A2" :
                System.out.println("420 x 594 mm (16.5 x 23.4 inches)");
            case "A3":
                System. out.println("297 x 420 mm (11.7 x 16.5 inches)");
           case "A4":
                System.out.println("210 x 297 mm (8.3 x 11.7 inches)");
           case "A5":
                 System.out.println("148 x 210 mm (5.8 x 8.3 inches)");
}
}
}