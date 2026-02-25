package workshop16;


/**
 * Write a description of class task3 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class task3
{
    public void find(String word)
    {
        word = "Hello World";
        
        int ind = word.indexOf("o");
        System.out.println("Index of 'o': " + ind);
        
        boolean cont= word.contains("world");
        System.out.println("contains world "+ cont);
        
        char at = word.charAt(4);
        System.out.println("Word at 4: "+at);
        
    }
}
