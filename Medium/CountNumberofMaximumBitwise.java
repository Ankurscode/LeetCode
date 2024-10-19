package Medium;

public class CountNumberofMaximumBitwise {
    public void backtracking(int[] nums, int index, int currentOR, int maxOR, int[] count)
    {
        if(currentOR==maxOR){
            count[0]++;
        }
        for (int i = index; i < nums.length; i++) {
            backtracking(nums,i+1,currentOR |nums[i],maxOR,count );
        }
    }
    public int countMaxOrSubsets(int[] nums) {
       
        

        int maxOR = 0;

        for(int num:nums){
            maxOR |=num;
        }
        int[] count=new int[1];
        backtracking(nums,0,0,maxOR,count);
        return count[0];
    }
    
}
