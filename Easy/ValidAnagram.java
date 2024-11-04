import java.util.HashMap;

public class ValidAnagram {
    public static boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> n=new HashMap<>();
        if(s.length()<t.length() || s.length()>t.length()){
            return false;
        }
       for (int i = 0; i <s.length(); i++) {
          
            if(n.containsKey(s.charAt(i))){
                n.put(s.charAt(i), (n.get(s.charAt(i)))+1);
                continue;
            }
            n.put(s.charAt(i), 1);    
       }

       for (int i = 0; i < t.length(); i++) {
            if(n.containsKey(t.charAt(i))){
                if(n.get(t.charAt(i)) == 1){
                    n.remove(t.charAt(i));
                }
                else{
                    n.put(t.charAt(i), n.get(t.charAt(i)) - 1);
                }
            }
            else{
                return false;
            }
       }
       return true;
    }
    public static void main(String[] args) {
        String s = "anagram";
        String t="nagarama";
        System.out.println(isAnagram(s, t));
    }
}
