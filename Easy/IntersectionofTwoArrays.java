import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class IntersectionofTwoArrays {
    public static int[] intersection(int[] nums1, int[] nums2) {
          HashSet<Integer> set=new HashSet<>();
          for (int num : nums1) {
                set.add(num);
          } 
        ArrayList <Integer>ans=new ArrayList();  
          for(int num: nums2){
            if(set.contains(num)){
                ans.add(num);
                set.remove(num);
            }
          } 
          
          int[] res=new int[ans.size()];
          for (int i = 0; i < ans.size(); i++) {
                res[i]=ans.get(i);
          }
          return res;
    }
    public static void main(String[] args) {
        int []nums1 = {1,2,2,1};
        int []nums2 = {2,2};

        System.out.println(Arrays.toString(intersection(nums1, nums2)));
    }

}