
/**
 * Write a description of class RetailCustomer here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class RetailCustomer extends Customer
{
    private double markupRate;
    
    public RetailCustomer()
    {
        markupRate = 0.0;
    }
    
    public RetailCustomer(double mur)
    {
        markupRate = mur;
    }
    
    public double getMUR(){
        return markupRate;
    }
    
    public void setMUR(double mur){
        markupRate = mur;
    }
    
    public String info(){
        return "This class is an example of a customer who buys products based or retailer";
    }
}
