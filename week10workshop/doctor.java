package week10workshop;


/**
 * Write a description of class doctor here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class doctor extends person
{
    public String specialization;
    private double consultationfee;
    
    public doctor(int personId, String personName, String specialization, double consultationfee){
        super(personId, personName);
        this.specialization= specialization;
        this.consultationfee= consultationfee;
        
    }
    @Override
    public double calculatesalary(){
        return super.calculatesalary()+consultationfee;
        
    }
    public double calculatesalary(int emergencycases){
        return this.calculatesalary()+(emergencycases*500);
    }
    @Override
    public String toString(){
        return super.toString()+ ",specialization: "+this.specialization;
    }
    
    
}