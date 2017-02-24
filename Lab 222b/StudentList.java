
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
    private Scanner scr;
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
    
    public void sortGPA(){
        System.out.println("How do you want to sort?");
        System.out.println("1. Sort by Insertion");
        System.out.println("2. Sort by Selection");
        System.out.println("3. Sort by CompareTo");
        System.out.println("4. Sort by Merge");
        System.out.println("5. Sort by Binary");
        String input = scr.nextLine();
        if(input.equals("1"))
        {
            sortInsertion();
        }
        else if(input.equals("2"))
        {
            sortSelection();
        }
        else if(input.equals("3"))
        {
            sortCompareTo();
        }
        else if(input.equals("4"))
        {
            sortMerge(students);
        }
        else if(input.equals("5"))
        {
            sortBinary();
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
        for (int i = 1; i < students.size(); i++)
        {
            double temp = students.get(i).getGPA();
            Student s = students.get(i);
            for (int j = i-1; j > -1; j--)
            {
                double orary = students.get(j).getGPA();
                Student r = students.get(j);
                if (temp < orary)
                {
                    students.set(j, s);
                    students.set(j+1, r);
                } else {
                    break;
                }
            }
        }
    }
    
    public void sortSelection()
    {
        for (int i = 0; i < students.size()-1; i++)
        {
            int index = i;
            Student temp = students.get(i);
            for (int j = i+1; j < students.size(); j++)
            {
                double test = students.get(j).getGPA();
                double current = students.get(index).getGPA();
                if (test < current)
                {
                    index = j;
                }
            }
            students.set(i, students.get(index));
            students.set(index, temp);
        }
    }
    
    public ArrayList<Student> sortMerge(ArrayList<Student> array)
    {
         if (array.size() == 1)
        {
            return array;
        }
        if (array.size() == 2)
        {
            Student temp = array.get(0);
            if (array.get(1).getGPA() < array.get(0).getGPA())
            {
                array.set(0, array.get(1));
                array.set(1, temp);
            }
            return array;
        }
        int mid = array.size()/2;
        ArrayList<Student> array1 = new ArrayList<Student>();
        for (int i = 0; i < mid; i++)
        {
            array1.add(array.get(i));
        }
        ArrayList<Student> array2 =  new ArrayList<Student>();
        for (int i = 0; i < array.size()-mid; i++)
        {
            array2.add(array.get(mid + i));
        }
        return merge(sortMerge(array1), sortMerge(array2));
    }
    
    public ArrayList<Student> merge (ArrayList<Student> array1, ArrayList<Student> array2)
    {
        ArrayList<Student> newArray = new ArrayList<Student>(array1.size() + array2.size());
        int i = 0;
        int j = 0;
        while (i < array1.size() && j < array2.size())
        {
            if (array1.get(i).getGPA() > array2.get(j).getGPA())
            {
                newArray.add (array2.get(j));
                j++;
            }
            else {
                newArray.add(array1.get(i));
                i++;
            }
        }
        if (i < array1.size())
        {
            for (int c = i; c < array1.size(); c++)
            {
                newArray.add(array1.get(c));
            }
        }
        else {
            for (int d = j; d < array2.size(); d++)
            {
               newArray.add(array2.get(d));
            }
        }
        return newArray;
    }
    
    public void sortBinary()
    {
        int low;
        int high;
        while(high >= low)
        {
            int mid = (low + high) / 2;
            if(students.get(mid).getGPA() == students.getGPA())
            {
                return;
            }
        }
    }
}