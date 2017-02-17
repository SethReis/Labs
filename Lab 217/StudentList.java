
/**
 * Write a description of class StudentList here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.ArrayList;
import java.util.Scanner;
import java.util.*;
public class StudentList
{
    ArrayList<Student> students = new ArrayList<Student>();
    public void addStudent(String name, int id, double gpa)
    {
        Student student = new Student();
        parseUserInput(name, student);
        student.setID(id);
        student.setGPA(gpa);
        students.add(student);
    }

    public void printStudent()
    {
        for(int i = 0; i < students.size(); i++) 
        {
            System.out.println("******************************");
            System.out.println("Name: " + students.get(i).getFName() + " " + students.get(i).getMName() + " " + students.get(i).getLName());
            System.out.println("ID: " + students.get(i).getID());
            System.out.println("GPA: " + students.get(i).getGPA());
            System.out.println("******************************");
        }
    }

    public void parseUserInput(String name, Student stu) 
    {
        if(name.indexOf(",") > -1)
        {
            stu.setLName(name.substring(0, name.indexOf(",")));
            String student = name.substring(name.indexOf(" ") + 1);
            stu.setFName(student.substring(0, student.indexOf(" ")));
            stu.setMName(student.substring(student.indexOf(" ") + 1));
        }
        else if(name.substring(name.indexOf(" ") + 1).indexOf(" ") > -1) 
        {
            stu.setFName(name.substring(0, name.indexOf(" ")));
            String student = name.substring(name.indexOf(" ") + 1);
            stu.setMName(student.substring(0, student.indexOf(" ")));
            stu.setLName(student.substring(student.indexOf(" ") + 1));
        }
        else 
        {
            stu.setFName(name.substring(0, name.indexOf(" ")));
            stu.setLName(name.substring(name.indexOf(" ") + 1));
            stu.setMName("");
        }
    }
    
    public void deleteStudentInfo()
    {
        String input = " ";
        int input2 = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("******************************");
        System.out.println("How do you want to find the student?");
        input = sc.nextLine();
        if(input.equals("Name"))
        {
            System.out.println("Enter the students name:");
            input = sc.nextLine();
            for(int i = 0; i < students.size(); i++) 
            {
                String fullName = students.get(i).getFName() + " " + students.get(i).getMName() + " " + students.get(i).getLName();
                if(fullName.equals(input))
                {
                    System.out.println("Student deleted.");
                    System.out.println("******************************");
                    students.remove(i);
                }
            }
        }
        else if(input.equals("ID"))
        {
            System.out.println("Enter the students ID:");
            input2 = sc.nextInt();
            for(int i = 0; i < students.size(); i++) 
            {
                int id = students.get(i).getID();
                if(id==(input2))
                {
                    System.out.println("Student deleted.");
                    System.out.println("******************************");
                    students.remove(i);
                }
            }
        }
        else
        {
            System.out.println("That is not a valid search term.");
        }
    }
    
    public void filterSearchStudentList()
    {
        String input = " ";
        int input2 = 0;
        double input3 = 0.0;
        Scanner sc = new Scanner(System.in);
        System.out.println("******************************");
        System.out.println("How do you want to find the students?");
        input = sc.nextLine();
        if(input.equals("GPA"))
        {
            System.out.println("Enter the maximum GPA:");
            input3 = sc.nextFloat();
            for(int i = 0; i < students.size(); i++) 
            {
                double gpa = students.get(i).getGPA();
                String fullName = students.get(i).getFName() + " " + students.get(i).getMName() + " " + students.get(i).getLName();
                if(gpa<=input3+0.001)
                {
                    System.out.print(fullName + ", ");
                }
            }
            System.out.print("\n");
            System.out.println("******************************");
        }
        else if(input.equals("ID"))
        {
            System.out.println("Enter the students ID:");
            input2 = sc.nextInt();
            for(int i = 0; i < students.size(); i++) 
            {
                int id = students.get(i).getID();
                String fullName = students.get(i).getFName() + " " + students.get(i).getMName() + " " + students.get(i).getLName();
                if(id<=input2)
                {
                    System.out.print(fullName + ", ");
                }
            }
            System.out.print("\n");
            System.out.println("******************************");
        }
        else
        {
            System.out.println("That is not a valid search term.");
        }
    }
     
    public void sortCompareTo()
    {
        Student[] s = new Student [students.size()];
        for (int i = 0; i < students.size(); i++)
        {
            s[i] = students.get(i);
        }
        Arrays.sort(s);
        for (int i = 0; i < students.size(); i++)
        {
            students.set(i, s[i]);
        }
    }    
        
    public void sortInsertion()
    {
        double temp;
        for (int i = 0; i < students.size(); i++)
        {
            for (int j = i; j > 0; j--)
            {
                if (students.get(j).getGPA() < students.get(j-1).getGPA())
                {
                    temp = students.get(j).getGPA();
                    students.set(j, students.get(j-1).getGPA()).setGPA();
                    students.set(j-1, temp).setGPA();
                }
            }
        }
    }
    
    public void sortSelection()
    {
        for (int i = 0; i < students.size(); i++)
        {
            double index = 0.0;
            for (int j = i+1; j < students.size ; j++)
            {
                if (students.get(j).getGPA() < students.get(index).getGPA())
                {
                    index = j;
                }
                double smallNum = students.get(index).getGPA();
                students.set(index, students.get(i).getGPA()).setGPA();
                students.set(i, smallNum).setGPA();
            }
        }
    }
    
    public void sortMerge()
    {
       
    }
}