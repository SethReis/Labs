
/**
 * Abstract class Person - write a description of the class here
 * 
 * @author (your name here)
 * @version (version number or date here)
 */
public abstract class Person
{
    private String name;
    
    private int age;

    private String contract;
    
    private String gender;
    
    public Person()
    {
        name = "";
        age = 0;
        contract = "";
        gender = "";
    }
    
    public Person(String qui, int quae, String quod, String quem)
    {
        name = qui;
        age = quae;
        contract = quod;
        gender = quem;
    }
    
    public String getName(){
        return name;
    }

    public String getContract(){
        return contract;
    }
    
    public int getAge(){
        return age;
    }
    
    public String getGender(){
        return gender;
    }
    
    public void setName(String qui){
        name = qui;
    }
    
    public void setAge(int quae){
        age = quae;
    }
    
    public void setContract(String quod){
        contract = quod;
    }
    
    public void setGender(String quem){
        gender = quem;
    }
    
    public abstract class info{};
}
