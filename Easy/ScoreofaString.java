public class ScoreofaString {
    public static int scoreOfString(String s) {
        int totalDifference=0;
        for(int i=0;i<s.length()-1;i++){
            int ascii1=(int)s.charAt(i);
            int ascii2=(int)s.charAt(i+1);
            totalDifference +=Math.abs(ascii1-ascii2);

        }
        return totalDifference;
    }

    public static void main(String[] args) {
        String s = "hello";
        int result=scoreOfString(s);
        System.out.println(result);  
    }
}