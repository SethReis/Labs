
/**
 * Write a description of class Sort here.
 * 
 * @author (Seth Reis) 
 * @version (a version number or a date)
 */
public class Sort
{
    public static void run() {
        Sort s = new Sort();
        int[] nums = {1,2,3,4,5,6,7,8,9};
        System.out.println(s.sequential(nums,2));
        System.out.println(s.binary(nums,2));
    }
    
    public int sequential(int[] nums, int goal) {
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] == goal) {
                return i;
            }
        }
        return -1;
    }
    
    public int binary(int[] nums, int goal) {
        int high = nums.length-1;
        int low = 0;
        while(high >= low) {
            int mid = high/2;
            if(nums[mid] < goal) {
                low++;
            }
            else if(nums[mid] > goal) {
                high--;
            }
            else if(nums[mid] == goal) {
                return mid;
            }
        }
        return -1;
    }
}
