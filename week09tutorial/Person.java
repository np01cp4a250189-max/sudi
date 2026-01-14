package week09tutorial;


/**
 * Write a description of class f here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
 public class Person {
    int id;
    String name;
    double basicSalary;
    static String collegeName = "ABC College";

    
    Person(int id, String name, double basicSalary) {
        this.id = id;
        this.name = name;
        this.basicSalary = basicSalary;
    }

    
    double calculateAnnualSalary(){
        return basicSalary * 12;
        
        
    }
} 