package Medium;

public class DifferenceBetweenOnesandZerosinRowandColumn {
    class Solution {
        public int[][] onesMinusZeros(int[][] grid) {
            int nRow=grid.length;
            int nCol=grid[0].length;
            int[] rows=new int[nRow];
            int[] cols=new int[nCol];

            for(int i=0;i<nRow;i++){
                for(int j=0;j<nCol;j++){
                    if(grid[i][j]==1){
                        rows[i]++;
                        cols[j]++;
                    }
                    else{
                        rows[i]--;
                        cols[j]--;
                    }

                }
            }
            for(int i=0;i<nRow;i++){
                for(int j=0;j<nCol;j++){
                    grid[i][j]=rows[i]+cols[j];
        }
    }
    return grid;
        
    }
}
}