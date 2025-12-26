package week08workshop;


/**
 * Write a description of class student here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class student
{
    private int id;
    private String name;
    private String address;
    private long phoneNumber;
    private static String collegeName;

    
    public student(int id, String name, String address, long phoneNumber, String collegeName) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        student.collegeName = collegeName;
    }

    
    public void displayInfo() {
        System.out.println("id: " + id);
        System.out.println("name: " + name);
        System.out.println("address: "+ address);
        System.out.println("phone Number: " + phoneNumber);
        System.out.println("college Name: " + collegeName);
    }
}
