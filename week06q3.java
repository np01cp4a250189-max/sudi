import java.util.Scanner;

/**
 * Write a description of class week06q3 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class week06q3
{
    public static void main(String[] args){
        String [] name={"saroj","sushant","ujjwal","rabina","sandesh"};
        for (int i=0; i<name.length; i++){
            System.out.println(name [i]);
            
        }
        System.out.println(name[2]);
        
        name [4]= "Sudi";
        System.out.println(name[4]);
        
        Scanner input= new Scanner(System.in);
        System.out.print( "Enter the name");
        
        
        
        for (int j=0; j<name.length; j++)
        {
           name [j]= input.next();
           
        }  
           
            
        
         for (int j=0; j<name.length; j++
         ) {
         System.out.println(name [j]);
         
        
        
        
        
        
        
        
    }
}
}