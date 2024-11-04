import java.util.Arrays;
import java.util.HashMap;

public class ContainsDuplicate {
     public static boolean containsDuplicate(int[] nums) {
        HashMap <Integer,Integer> nam =new HashMap<>();
         for(int i=0;i<nums.length;i++)
             {
                 if(nam.containsKey(nums[i]))
                    {
                         return true;
                     }
                 nam.put(nums[i], i);
             }
        return false;
     }
    public static void main(String[] args) {
        int [] nums = {1,2,3,4,3};
        System.out.println(containsDuplicate(nums));
    }
}
