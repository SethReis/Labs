
/**
 * Write a description of class Employee here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Employee extends Person
{
    private int startDate;
    
    private String positionTitle;
    
    public Employee()
    {
       startDate = 0;
       positionTitle = "";
    }

    public Employee(int sd, String pt)
    {
        startDate = sd;
        positionTitle = pt;
    }
    
    public int getSD(){
        return startDate;
    }
    
    public String getPT(){
        return positionTitle;
    }
    
    public void setPT(String pt){
        positionTitle = pt;
    }
    
    public void setST(int sd){
        age = sd;
    }
    
    public int yearsServed(){
        return currentDate
    }
    
    public String info(){
        return 
    }
}
