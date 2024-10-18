import java.util.HashMap;

public class RomantoInteger {
    public static void main(String[] args) {
       String s = "III";
       int num = new RomantoInteger().romanToInt(s);
       System.out.println(num);
      
       
    }
    public int romanToInt(String s) {
        int res=0;
        HashMap<Character , Integer> maps = new HashMap<Character, Integer>();
        maps.put('I',1);
        maps.put('V', 5);
        maps.put('X', 10);
        maps.put('L',50);
        maps.put('C',100);
        maps.put('D',500);
        maps.put('M',1000);

        for(int i=0;i<s.length()-1;i++){
            if(maps.get(s.charAt(i))<maps.get(s.charAt(i+1))){
               res-=maps.get(s.charAt(i));

            }
           else{

            res+=maps.get(s.charAt(i));
           }
        }
        return res+maps.get(s.charAt(s.length()-1));
    }
    

}
  
    

