/**
 * Student class
 * 
 * @Kara Herson 
 * @11/9/16 
 * @2/2/17
 */
public class Student implements Comparable<Student>
{
    public int compareTo(Student s)
    {
        if(this.getStudentNumber() > s.getStudentNumber())
        {
            return 1;
        }else if(this.getStudentNumber() < s.getStudentNumber())
        {
            return -1;
        }
        return 0;
    }
}
