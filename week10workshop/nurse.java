package week10workshop;


/**
 * Write a description of class nurse here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class nurse extends person
{
  
    private String shift;
    private double extraallowance;
    
     public nurse(int id, String name, String shift, double extraallowance)
    {
        super(id, name);
        this.shift=shift;
        this.extraallowance= extraallowance;
    }
    
    @Override
    public double calculatesalary()
    {
        return super.calculatesalary()+ extraallowance;
    }
    
    @Override
    public String toString()
    {
        return super.toString()+ "Nurse--> Shift:"+shift+", Extra allowance:" +extraallowance;
    }    
}
