import java.util.Scanner;

/**
 * Write a description of class week06qn5 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class week06qn5
{ 
    public static void main(String[] args){
        String [] name = { "Morang","Kathmandu", "Kaski", "Sinduli"};
        
        for(int i=0; i<name.length; i++){
            System.out.println("The lists are " + (i+1) + name[i]);
              Scanner input = new Scanner(System.in);
    System.out.println("Enter the number of districts");
    int na = input.nextInt();
    
    String[] district= new String[na];
    
    for(int j=0; j<district.length; j++)
    {
     
        district[j] = input.next();
        
    }
    
    for(int j=0; j<district.length; j++)
    {
        
        System.out.println("The list of districts are: "+ district[j]);
    }
    
}
}
}
    