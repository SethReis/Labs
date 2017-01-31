
/**
 * Write a description of class Customer here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Customer extends Person
{
    private String region;
    
    public Customer()
    {
        region = "America";
    }
    
    public Customer(String r)
    {
        region = r;
    }
    
    public String getR(){
        return region;
    }
    
    public void setR(String r){
        region = r;
    }
    
    public String info(){
        return "Customer extends Person and sets the basis for 2 types of customers based on region";
    }
}
