public class LengthofLastWord {
    public static int lengthOfLastWord(String s) {
       
            s=s.trim();
            String[] word=s.split(" ");
            int lasrword=0;
            for(int i=0;i<word.length;i++)
                {
                     if(i==word.length-1)
                     {
                  lasrword=word[i].length();
                    }
                  }
                  return lasrword;
         }
         public static void main(String[] args) {
            String s =  "   fly me   to   the moon  ";
            int ans=lengthOfLastWord(s);
            System.out.println(ans);
         }
        
     }
