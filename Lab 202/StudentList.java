/**
 * StudentList
 * 
 * @Kara Herson 
 * @11/21/16
 */
import java.util.ArrayList;
import java.util.Scanner;
import java.util.*;
public class StudentList
{
    public void sortByCompareTo()
    {
        Student[] s = new Student [students.size()];
        for (int i = 0; i < students.size(); i++)
        {
            s[i] = students.get(i);
        }
        Arrays.sort(s);
        for (int i = 0; i < students.size(); i++)
        {
            students.set (i, s[i]);
        }

    }
}
