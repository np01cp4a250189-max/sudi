package week08workshop;


/**
 * Write a description of class employeetest here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class employeetest
{
    public static void main(String [] args) {
        employee emp = new employee(50000);
        
        System.out.println("Basic Salary: " + emp.getBasicSalary());
        System.out.println("Gross Salary: " + emp.calculateGrossSalary());
        
        
        
    }
}