
/**
 * Write a description of class HourlyEmployee here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class HourlyEmployee extends Employee
{
    private double hourlyRate;
    
    private int dailyHours;
    
    public HourlyEmployee(){
        hourlyRate = 10.5;
        dailyHours = 8;
    }
    
    public HourlyEmployee(double hr, int dh){
        hourlyRate = hr;
        dailyHours = dh;
    }
    
    public double getHR(){
        return hourlyRate;
    }
    
    public void setHR(double hr){
        hourlyRate = hr;
    }
    
    public int getDH(){
        return dailyHours;
    }
    
    public void setDH(int dh){
        dailyHours = dh;
    }
    
    public double calcPay(){
        return hourlyRate * dailyHours;
    }
    
    public String info(){
        return "This class demonstrates an example of a worker that gets paid by the hour";
    }
}
