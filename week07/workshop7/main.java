package week07.workshop7;


/**
 * Write a description of class main here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class main
{
    public static void main(String [] args) {
        book b1= new book();
        b1.title = "It ends with us";
        b1.author = "Hoover Collen";
        b1.price = 2000;
        
        System.out.println(b1.title);
        System.out.println(b1.author);
        System.out.println(b1.price);
        
        book b2= new book();
        b2.title = "Can love happen twice";
        b2.author = "Ravinder Singh";
        b2.price = 1500;
        
        System.out.println(b2.title);
        System.out.println(b2.author);
        System.out.println(b2.price);
        
        rectangle r1= new rectangle();
        r1.length = 15;
        r1.breath = 10;
        r1.area();
        

        
        rectangle r2= new rectangle();
        r2.length = 12;
        r2.breath = 14;
        
        
        r2.area();
        
      Employee e1 = new Employee();
      e1.id = 01;
      e1.name ="neharika";
      e1. salary = 2000000;
      e1.displayemployee();
      
      Employee e2 = new Employee();
      e2.id = 03;
      e2.name ="neh";
      e2. salary =18000009;
      System.out.println(e2.id);
      System.out.println(e2.name);
      System.out.println(e2.salary);
       
      
      Employee e3 = new Employee();
      e3.id = 03;
      e3.name ="neha";
      e3. salary = 29878780;
      System.out.println(e3.id);
      System.out.println(e3.name);
     System.out.println(e3.salary);
      
      
      if(e1.salary>e2.salary && e1.salary> e3.salary)
      {
        System.out.println("emp 1"+e1.salary);
        
        }
      else if(e2.salary>e1.salary && e2.salary> e3.salary)
       {
        System.out.println("emp 2"+e2.salary);
        
        }
        else
        {
         
            System.out.println("emp 3"+e3.salary);
        
        }

        
      Laptop l1 = new Laptop("Macbook", 4, 200000);
      l1.displaylap();
      Laptop l2 = new Laptop("Dell",8, 400000);
      l2.displaylap();
      Laptop l3 = new Laptop ("HP",16, 400000);
      l3.displaylap();
      
      Mobile m1 = new Mobile("Samsung", 40000);
      m1.isaffordable();
      Mobile m2 = new Mobile("honour", 2000);
      m2.isaffordable();
      
      Result res1 = new Result(50, 77, 66);
      re1.total();
      re1.percentage();
      
      Result res2 = new Result(75, 79, 90);
      re2.total();
      re2.percentage();
      
      Result res3 = new Result(80, 60, 19);
      re3.total();
      re3.percentage();
      
        
        
        
        
        
        
        
        
        
}
}