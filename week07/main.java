package week07;



public class main
{
    public static void main(String [] args){
       student s1= new student(); 
       s1.collegeID= "np014sp10";
       s1.name="Sandesh";
       s1.age=22;
       
       System.out.println(s1.collegeID);
       System.out.println(s1.name);
       System.out.println(s1.age);
       
       student s2= new student();
       s2.collegeID= "np001868s8";
       s2.name="Neharika";
       s2.age=18;
       
       System.out.println(s2.collegeID);
       System.out.println(s2.name);
       System.out.println(s2.age);
       
       
       //CAR
       car c1= new car();
       c1.Colour= "Red";
       c1.Brand= "Mercedes";
       c1.Model= "G-Wagon";
       c1.Price= 4000000;
       
       System.out.println(c1.Colour);
       System.out.println(c1.Brand);
       System.out.println(c1.Price);
       System.out.println(c1.Model);
       
       
     
    }
}