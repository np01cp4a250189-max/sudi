package workshop16;


/**
 * Write a description of class task6 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class task6
{
    public static void main(String [] args)
    {
        String text= "Hello";
        StringBuilder sb= new StringBuilder();
        
        for(int i=text.length()-1; i>=0; i--){ 
            sb.append(text.charAt(i));
        
    }
    System.out.println(sb.toString());
    
}
}