package workshop16;


/**
 * Write a description of class task4 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class task4
{
     public void check (String ulc){
        ulc = "neharika mainali";
        
        String upp = ulc.toUpperCase();
        System.out.println("upper case:"+ upp);
        
        String low = ulc.toLowerCase();
        System.out.println("Lower case:"+ low);
        
        //titlecase
        String[] words = ulc.split("\\s+");
        StringBuilder sb = new StringBuilder();
        
        for(String word: words)
        {
            String first = word.substring(0,1).toUpperCase();
            String rest = word.substring(1).toLowerCase();
            
            sb.append(first).append(rest);
        }
        
        System.out.println(sb);
        
    }

}