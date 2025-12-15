
/**
 * Write a description of class week06qn6 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class week06qn6
{
    public static void main(String [] args){
    
    
    int [][] marks = new int[2][2];
     
    marks[0][0] = 80;
    marks[0][1] = 76;
    marks[1][0] = 45;
    marks[1][1] = 54;
    
      System.out.println("Marks Table:");
        System.out.println("Student\tNepali\tEnglish");
        for (int i = 0; i < marks.length; i++) {
            System.out.print("S" + (i + 1) + "\t");
            for (int j = 0; j < marks[i].length; j++) {
                System.out.print(marks[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println("\nTotal Marks:");
        for (int i = 0; i < marks.length; i++) {
            int total = 0;
            for (int j = 0; j < marks[i].length; j++) {
                total += marks[i][j];
            }
            System.out.println("Student " + (i + 1) + ": " + total);
        }
    }
}   
    