/**
 * MinimumStringLengthAfterRemovingSubstrings
 */
public class MinimumStringLengthAfterRemovingSubstrings {
    public int minLength(String s) {
        StringBuilder sin= new StringBuilder(s);
        boolean found=true;

        while(found){
            found= false;
            int index=sin.indexOf("AB");
            if(index!=-1){
                sin.delete(index,index+2);
                found=true;
            }
            index=sin.indexOf("BC");
            if(index!=-1){
                sin.delete(index, index+2);
            }
        }
        return sin.length();
           
    }
    
}