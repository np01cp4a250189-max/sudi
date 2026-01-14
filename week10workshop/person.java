package week10workshop;


/**
 * Write a description of class person here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class person
{
    private int personId;
    private String personName;
    
    public person(int personId, String personName){
        this.personId= personId;
        this.personName= personName;
        
    }
    
    public void setpersonId(int newId){
        this.personId= newId;
    }
    public int getpersonId(){
        return this.personId;
    }
    public void setpersonName(String personName) {
        this.personName= personName;
        
    }
    public String getpersonName() {
        return this.personName;
        
    }
    
    public double calculatesalary() {
        double baseSalary=30000;
        return baseSalary;
        
     }
     
     @Override
     public String toString() {
         return"person details= personId:"+getpersonId() +",person name: "+getpersonName();
         
     }
     
    
}