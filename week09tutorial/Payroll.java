package week09tutorial;


/**
 * Write a description of class g here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Payroll {
    public static void main(String[] args) {

        PermanentEmployee pe = new PermanentEmployee(
                101, "Ram", 30000, 5000, 3000);

        ContractEmployee ce = new ContractEmployee(
                201, "Shyam", 1000, 25);

        System.out.println("=== Permanent Employee ===");
        pe.displayEmployee();
        System.out.println("Total Salary: " + pe.calculateTotalSalary());

        System.out.println("\n=== Contract Employee ===");
        ce.displayEmployee();
        System.out.println("Total Salary: " + ce.calculateTotalSalary());
    }
}