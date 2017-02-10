
/**
 * Write a description of class sort here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.*;
public class sort
{
    public sort()
    {
        
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public static int[] insert(int[] a)
    {
        for (int i=0;i<a.length;i++){
            if(i!=0&&a[i]<a[i-1]){
                int k = a[i-1];
                a[i-1]=a[i];
                a[i]=k;
                i-=2;
            }
        }
        return a;
    }
    public static ArrayList<Integer> insert(ArrayList<Integer> a)
    {
        for (int i=0;i<a.size();i++){
            if(i!=0&&a.get(i)<a.get(i-1)){
                int k = a.get(i-1);
                a.set(i-1,a.get(i));
                a.set(i,k);
                i-=2;
            }
        }
        return a;
    }
    public static int[] select(int[] a)
    {
        int s=Integer.MAX_VALUE;
        int k=0;
        for(int i=0;i<a.length-1;i++){
            for (int j=i;j<a.length;j++)
                if (a[j]<s){
                    s=a[j];
                    k=j;
                }
            a[k]=a[i];
            a[i]=s;
            s=Integer.MAX_VALUE;
        }
        return a;
    }
    public static ArrayList<Integer> select(ArrayList<Integer> a)
    {
        int s=Integer.MAX_VALUE;
        int k=0;
        for(int i=0;i<a.size()-1;i++){
            for (int j=i;j<a.size();j++)
                if (a.get(j)<s){
                    s=a.get(j);
                    k=j;
                }
            a.set(k,a.get(i));
            a.set(i,s);
            s=Integer.MAX_VALUE;
        }
        return a;
    }
}
