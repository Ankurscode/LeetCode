package BinearySearch;

public class Celling {
    public static void main(String[] args) {
        int []arr={2,3,4,8,10,15,18};
        int target=12;
        int ans=celnum(arr,target);
        System.out.println(ans);

    }
    public static int celnum(int[] num,int target){
        int start=0;
        int end=num.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
             if(num[mid]<target){
                start=mid+1;
            } else if (num[mid]>target) {
                end=mid-1;
            }else{
                 return mid;
             }
        }
        return start;
    }


}
