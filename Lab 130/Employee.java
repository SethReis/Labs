
/**
 * Write a description of class Employee here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Employee extends Person
{
    private int startDate;
    
    private int currentDate;
    
    private String positionTitle;
    
    public Employee()
    {
       startDate = 1995;
       currentDate = 2017;
       positionTitle = "";
    }

    public Employee(int sd, int cd, String pt)
    {
        startDate = sd;
        currentDate = cd;
        positionTitle = pt;
    }
    
    public int getSD(){
        return startDate;
    }
    
    public int getCD(){
        return currentDate;
    }
    
    public String getPT(){
        return positionTitle;
    }
    
    public void setPT(String pt){
        positionTitle = pt;
    }
    
    public void setSD(int sd){
        startDate = sd;
    }
    
    public void setCD(int cd){
        currentDate = cd;
    }
    
    public int yearsServed(){
        return currentDate - startDate;
    }
    
    public String info(){
        return "Employee extends Person and desribes an employee that works in the company";
    }
}
