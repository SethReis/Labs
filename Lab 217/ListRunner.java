
/**
 *Benchmark 3
 *By: Seth Reis
 *Date: 11/21/16
 */
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
public class ListRunner
{
    public ListRunner()
    {
        
    }
    
    public static void main(String[] args)
    {
        StudentList list = new StudentList();
        Scanner sc = new Scanner(System.in);
        String input = " ";
        while(!input.equals("Q")) 
        {
            System.out.println("What would you like to do?");
            System.out.println("1. Add a student");
            System.out.println("2. Print the student list");
            System.out.println("3. Delete a student from list");
            System.out.println("4. Find all students given a maximum");
            System.out.println("5. Sort by GPA");
            System.out.println("Q: End program");
            input = sc.nextLine();
            if(input.equals("1")){
                String name;
                int id = 0;
                double gpa = 0.0;
                System.out.println("******************************");
                System.out.println("What is the student's name?");
                name = sc.nextLine();
                System.out.println("What is the student's ID?");
                try { 
                    id = sc.nextInt();
                }catch (java.util.InputMismatchException e) { 
                    System.out.println("Error: Do not enter a double");
                    System.out.println("Student ID registered as 0");
                    id = 0;
                }
                sc.nextLine();
                System.out.println("What is the student's GPA?");
                try { 
                    gpa = sc.nextDouble();
                }catch (java.util.InputMismatchException e) { 
                    System.out.println("Error: Do not enter am interger");
                    System.out.println("Student GPA registered as 0.0");
                    gpa = 0.0;
                }
                
                sc.nextLine();
                list.addStudent(name, id, gpa);
                System.out.println("Info added.");
                System.out.println("******************************");
            }
            else if(input.equals("2")) 
            {
                list.printStudent();
            }
            else if(input.equals("3"))
            {
                list.deleteStudentInfo();
            }
            else if(input.equals("4"))
            {
                list.filterSearchStudentList();
            }
            else if(input.equals("5"))
            {
                System.out.println("How do you want to sort?");
                System.out.println("1. Sort by Insertion");
                System.out.println("2. Sort by Selection");
                System.out.println("3. Sort by CompareTo");
                System.out.println("3. Sort by Merge");
                input = sc.nextLine();
                if(input.equals("1"))
                {
                    list.sortInsertion();
                }
                else if(input.equals("2"))
                {
                    list.sortSelection();
                }
                else if(input.equals("3"))
                {
                    list.sortCompareTo();
                }
                else if(input.equals("4"))
                {
                    list.sortMerge();
                }
            }
        }
    }
}
