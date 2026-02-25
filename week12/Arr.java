package week12;
import java.util.*;

/**
 * Write a description of class Arr here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Arr
{
   public static void main(String[] args){
       ArrayList arrlist= new ArrayList();
       System.out.println(arrlist.isEmpty());   //true
       arrlist.add("Neharika");
       arrlist.add(101);
       arrlist.add(70.50);
       
       System.out.println(arrlist);
       
       ArrayList <Integer> arrlist = new ArrayList<>();
       System.out.println(arrlist.isEmpty());   //true
       arrlist.add(1);
       arrlist.add(101);
       arrlist.add(70);
       
       System.out.println(arrlist);
       arrlist.add(0,85);
       
       System.out.println(arrlist);
       System.out.println(arrlist.size());
       arrlist.remove(0);
       System.out.println(arrlist.get(0));
       arrlist.set(0,100);
       System.out.println(arrlist);
       System.out.println(arrlist.contains(95));
       System.out.println(arrlist.indexOf(95));
       //arrlist.clear();
       System.out.println(arrlist);
       
       for(int arr:arrlist)
       {
           System.out.println(arr);
           
       }
           
       
       Iterator<Integer> itr=arrlist.iterator();
       while(itr.hasNext()){
           int marks= itr.next();
           System.out.println(marks);
           
       }
       
       
       
       
       
       
       
   }
}