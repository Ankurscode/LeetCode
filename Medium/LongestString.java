package Medium;

public class LongestString {
    public static String longestDiverseString(int a, int b, int c) {
        int A=0 , B=0 , C=0;
        int max=a+b+c;
        int i=0;
        StringBuilder sb=new StringBuilder();
        while(i<max)
        {
            if(A!=2 && a>=b && a>=c || a>0 && (B==2 || C==2)){
                sb.append('a');
                A++;
                B=0;
                C=0;
                a--;
            }
            else if(B!=2 && b>=a && b>=c || b>0 && (A==2 || C==2)){

                sb.append('b');
                B++;
                A=0;
                C=0;
                b--;
            }
            else if(B!=2 && c>=a && c>=b &&  c>0 &&(A==2 || C==2)){
                sb.append('c');
                C++;
                A=0;
                B=0;
                c--;
            }

            
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        int  a = 1, b = 1, c = 7;
        System.out.println(longestDiverseString(a, b, c));
    }
}
