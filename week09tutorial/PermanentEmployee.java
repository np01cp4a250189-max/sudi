package week09tutorial;


/**
 * Write a description of class h here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

class PermanentEmployee extends Employee {
    double hra;
    double da;

    PermanentEmployee(int employeeId, String name, double basicSalary,
                      double hra, double da) {
        super(employeeId, name, basicSalary);
        this.hra = hra;
        this.da = da;
    }

    double calculateTotalSalary() {
        return basicSalary + hra + da + calculateBonus();
    }
}
