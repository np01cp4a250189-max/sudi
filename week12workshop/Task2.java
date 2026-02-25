package week12workshop;
import java.util.*;

/**
 * Write a description of class names here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Task2

{
    public static void main(String [] args){
        ArrayList<String> names = new ArrayList<String>();
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        
        numbers.add(10);
        numbers.add(15);
        numbers.add(20);
        
        names.add("Sudikshya");
        names.add("Neharika");
        names.add("Pyaroj");
        names.add("sudi");
        names.add("hello");
        names.add("byee");
        
        
        for (int arr:numbers){
            System.out.println(arr);
            
        }
        Iterator<Integer> itr= numbers.iterator();
        while(itr.hasNext()){
            int num= itr.next();
            System.out.println(num);
            
        }
        for(String arry:names){
            System.out.println(arry);
            
        }
        
        Iterator<String> ite=names.iterator();
        while(ite.hasNext()){
            String nam= ite.next();
            System.out.println(nam);
            
        }
        names.remove(2);
        System.out.println(numbers.size());
        System.out.println(names.size());
        
        numbers.clear();
        System.out.println(numbers);
        
        System.out.println(names.get(2));
        System.out.println(names.get(4));
        
        
        
        
        
        
    }
}