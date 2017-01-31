
/**
 * Write a description of class WholesaleCustomer here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class WholesaleCustomer extends Customer
{
    private double markupRate;
    
    private String company;
    
    public WholesaleCustomer()
    {
        markupRate = 0.0;
        company = "";
    }
    
    public WholesaleCustomer(double mur, String c)
    {
        markupRate = mur;
        company = c;
    }
    
    public double getMUR(){
        return markupRate;
    }
    
    public void setMUR(double mur){
        markupRate = mur;
    }
    
    public String getC(){
        return company;
    }
    
    public void setC(String c){
        company = c;
    }
    
    public String info(){
        return "This class is an example of a customer who buys products based or price";
    }
}
