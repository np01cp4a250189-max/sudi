package week12;
import java.util.*;

/**
 * Write a description of class StudentApp here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class StudentApp
{
    public static void main(String [] args){
        ArrayList<Student> students= new ArrayList<>();
        students.add(new Student(101,"Neharika"));
        students.add(new Student(102,"Sudikshya"));
        students.add(new Student(103,"Eshmarika"));
        
        System.out.println(students.get(0));
        for(Student std: students)
        {
            System.out.println(std);
        }
        
    }
}