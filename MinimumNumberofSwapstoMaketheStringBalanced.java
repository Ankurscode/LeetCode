package Medium;

public class MinimumNumberofSwapstoMaketheStringBalanced {
    public static int minSwaps(String s) {
        char[] a = s.toCharArray();
        int  count=0;


        for(int  i=0; i<a.length; i++) {
            if(a[i]=='['){
                count++;
            }
            else if( count > 0){
                count--;
            }
    }
    return (count+1)/2;
    }
    
    public static void main(String[] args) {
        String s = "][][";
        System.out.println(minSwaps(s));
    }
}

