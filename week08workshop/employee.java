package week08workshop;


/**
 * Write a description of class employee here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class employee
{
    


    private double basicSalary;

    
    public employee(double basicSalary) {
        this.basicSalary = basicSalary;
    }

    
    public double calculateGrossSalary() {
        double bonus = basicSalary * 0.20;
        return basicSalary + bonus;
    }

    
    public double getBasicSalary() {
        return basicSalary;
    }
}
    
