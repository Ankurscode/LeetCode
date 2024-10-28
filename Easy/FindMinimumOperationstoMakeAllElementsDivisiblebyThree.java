/**
 * FindMinimumOperationstoMakeAllElementsDivisiblebyThree
 */
public class FindMinimumOperationstoMakeAllElementsDivisiblebyThree {
    public static int minimumOperations(int[] nums) {
       int count=0;
       for (int i:nums) {
            if(i%3==0){
                continue;
            }
            else if(i%3==1){
                i=i-1;
                count++;
            }
            else{
                i=i+1;
                count++;
            }
       }
        return count;
        }

        public static void main(String[] args) {
            int [] nums = {1,2,3,4};
            int result= minimumOperations(nums);
            System.out.println(result);
        }
    }
    
