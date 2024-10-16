package Medium;

public class MaximumWidthRamp {
  
    public int maxWidthRamp(int[] nums) {
      int max = 0;
      for(int i=0;i<nums.length - 1;i++){
        for(int j=i+1;j<nums.length;j++){
            if(nums[j]>=nums[i] && max < j - i){
                max = j - i;
            }
        }
      }
       return max;
    }
    public static void main(String[] args) {
        int []nums={6,0,8,2,1,5};
        MaximumWidthRamp maxWidthRamp = new MaximumWidthRamp();
        int result=maxWidthRamp.maxWidthRamp(nums);
        System.out.println(result);
    }
}

  