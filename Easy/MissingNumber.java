public class MissingNumber {
    public static int missingNumber(int[] nums) {
        int n=nums.length;
       int asm=n*(n+1)/2;
       int act=0;
       for (int i : nums) {
            act+=i;
       }
       return asm-act;
    }
    public static void main(String[] args) {
        int [] nums = {3,0,1};
        int result=missingNumber(nums);
        System.out.println(result);

    }
}
