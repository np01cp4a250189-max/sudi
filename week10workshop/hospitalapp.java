package week10workshop;


/**
 * Write a description of class hospitalapp here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class hospitalapp
{
    public static void main(String [] args){
        doctor d1= new doctor(101, "Jhon Doe","Physician",5000);
        System.out.println(d1.toString());
        System.out.println("Salary:"+d1.calculatesalary());
        
        nurse n1= new nurse(102,"Sudikshya Karki","Night",2500);
        System.out.println(n1.toString());
        System.out.println("Salary:"+n1.calculatesalary());
        
    }
}