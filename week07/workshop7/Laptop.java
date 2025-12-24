package week07.workshop7;


/**
 * Write a description of class laptop here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */


public class Laptop
{
    String brand;
    int ram;
    double price;
    
    public Laptop(String brand, int ram, double price )
    {
        
    this.brand = brand;
    this.ram = ram;
    this.price = price;
    }
    
     void displaylap()
     { 
         if (ram > 8)
         {
        System.out.println("brand name is "+ brand);
        System.out.println("Ram is "+ ram+"GB");
        System.out.println("Price is "+ price);
        
        }
    }
     
}
