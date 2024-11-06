public class DetermineWhetherMatrixCanBeObtainedByRotation {
    public static boolean findRotation(int[][] mat, int[][] target) {
        int n=mat.length;
     
        boolean r90=true,r180=true,r270=true,r360=true;
        for(int row=0;row<n;row++){
            for(int col=0;col<n;col++){
                int curr=mat[row][col];
                r90 &=curr==target[n-1-col][row];
                r180 &=curr==target[n-1-row][n-1-col];
                r270 &=curr==target[col][n-1-row];
                r360 &=curr==target[row][col];
            }
        }
        return r90||r180||r270||r360;
    }
    public static void main(String[] args) {
            int [][]  mat = {{0,1},{1,1}}, target = {{1,0},{0,1}};
            System.out.println(findRotation(mat, target));
    }
}
