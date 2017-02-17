
/**
 * Write a description of class Student here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class Student implements Comparable<Student>
{
    public int stuID;
    public double stuGPA;
    String fName;
    String mName;
    String lName;
    public Student()
    {
        
    }

    public int getID()
    {
        return stuID;
    }
    
    public double getGPA()
    {
        return stuGPA;
    }
    
    public String getFName()
    {
        return fName;
    }
    
    public String getMName() 
    {
        return mName;
    }
    
    public String getLName()
    {
        return lName;
    }
    
    public void setID(int id)
    {
        stuID = id;
    }
    
    public void setGPA(double gpa)
    {
        stuGPA = gpa;
    }

    public void setFName(String first)
    {
        fName = first;
    }
    
    public void setMName(String middle) 
    {
        mName = middle;
    }
    
    public void setLName(String last) 
    {
        lName = last;
    }
    
    public int compareTo(Student s)
    {
        if(this.getGPA() > s.getGPA())
        {
            return 1;
        }else if(this.getGPA() < s.getGPA())
        {
            return -1;
        }
        return 0;
    }
}
