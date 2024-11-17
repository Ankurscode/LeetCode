package Hard;
import java.lang.*;
public class TrappingRainWater {
    public int trap(int[] height) {
        int left=0;
       int right=height.length-1;
       int max_left=height[left];  
       int max_right=height[right];
       int water=0;
    
       while(left<right){
           if(max_left<max_right){
               left+=1;
               max_left=Math.max(max_left,height[left]);
               water+=max_left-height[left];
           }
           else {
               right-=1;
               max_right=Math.max(max_right,height[right]);
               water+=max_right-height[right];
    
           }
       }
          return water;
          
    }
    
    
}
