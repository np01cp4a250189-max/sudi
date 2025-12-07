
/**
 * Write a description of class rowandcolumn5 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class rowandcolumn5
{
    public static void main(String [] args){
        int i;
        int j;
        for (i= 1; i<=5; i++){
            for (int space = 5; space >i; space--) {
                System.out.print(" ");
            }
            for(j=1; j<= i; j++){
                System.out.print(j);  
                
                
            } System.out.println();
            
        }
}
}