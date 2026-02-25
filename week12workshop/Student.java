package week12workshop;


/**
 * Write a description of class numbers here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Student

{
    private long phone;
    private String names;
    private String group;
    
    public Student(String names, String group, long phone){
        this.names= names;
        this.group= group;
        this.phone= phone;
        
    }
    @Override
    public String toString(){
        return "phone"+ this.phone +"names" +this.names +"group"+ this.phone;
        
    }
    public void setPhone(long newnumber){
        this.phone= newnumber;
    }
    public long getPhone() {
        return phone;
    }
    public void setName(String newname){
        this.names= newname;
    }
    public String getName(){
        return names;
    }
    public void setGroup(String newgroup){
        this.group= newgroup;
        
    }
    public String getGroup(){
        return group;
    }
    
    
}