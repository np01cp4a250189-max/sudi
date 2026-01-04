package week09tutorial;


/**
 * Write a description of class a here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */


class ContractEmployee extends Employee {
    int workingDays;

    ContractEmployee(int employeeId, String name, double basicSalary,
                     int workingDays) {
        super(employeeId, name, basicSalary);
        this.workingDays = workingDays;
    }

    double calculateTotalSalary() {
        return basicSalary * workingDays;
    }
}