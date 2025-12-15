
/**
 * Write a description of class week06qn7 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class week06qn7
{
    public static void main(String [] args) {
        String[][] seats = new String[2][3];

      
        seats[0][0] = "Alice";
        seats[0][1] = "Bob";
        seats[0][2] = "Charlie";

        
        for (int row = 0; row < seats.length; row++) {
            for (int col = 0; col < seats[row].length; col++) {
                if (seats[row][col] == null || seats[row][col].isEmpty()) {
                    System.out.print("[empty]\t");
                } else {
                    System.out.print(seats[row][col] + "\t");
                }
            }
            System.out.println(); 
        }
    }
}
