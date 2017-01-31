
/**
 * Write a description of class SalariedEmployee here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SalariedEmployee extends Employee
{
    private double annualSalary;
    
    private int payPeriod;
    
    public SalariedEmployee(){
        annualSalary = 125000;
        payPeriod = 245;
    }
    
    public SalariedEmployee(double as, int pp){
        annualSalary = as;
        payPeriod = pp;
    }
    
    public double getAS(){
        return annualSalary;
    }
    
    public void setAS(double as){
        annualSalary = as;
    }
    
    public int getPP(){
        return payPeriod;
    }
    
    public void setPP(int pp){
        payPeriod = pp;
    }
    
    public double calcPay(){
        return annualSalary;
    }
    
    public String info(){
        return "This class demonstrates an example of a worker that gets paid annualy based on the number of days they've worked";
    }
}
