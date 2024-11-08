package BinearySearch;

public class Searcingin2Dmatrix {
    public static boolean Bineary(int [][]matrix,int target,int row,int cStart,int cEnd)
    {
        while(cStart<=cEnd){
            int mid=cStart+(cEnd-cStart)/2;
            if(matrix[row][mid]==target){
                return true;
            }
            else if(matrix[row][mid]<target){
                cEnd=mid-1;
            } else if (matrix[row][mid]>target) {
                cStart=mid+1;
            }

        }
        return false;
    }
    public boolean searchMatrix(int[][] matrix, int target) {
    int row=matrix.length;
    int col= matrix.length-1;
    if(row==1){
        return Bineary(matrix,0, 0, col - 1, target);
    }
        int rStart=0;
        int rEnd=row-1;
        int cMid=col/2;
        while(rStart<rEnd-1){
        int mid=rStart+(rEnd-rStart)/2;
        if(matrix[mid][cMid]==target){
            return true;
        } else if (matrix[mid][cMid]<target) {
            rStart=mid;
        } else if (matrix[mid][cMid]>target) {
            rEnd=mid;
        }
        }
        if (matrix[rStart][cMid] == target) {
            return true;
        }
        if (matrix[rStart + 1][cMid] == target) {
            return true;
        }
            if (target <= matrix[rStart][cMid - 1]) {
                return Bineary(matrix, rStart, 0, cMid - 1, target);
            }
            //search in 2nd half
            if (target >= matrix[rStart][cMid + 1] && target <= matrix[rStart][col - 1]) {
                return Bineary(matrix, rStart, cMid + 1, col - 1, target);
            }
            //search in 3rd half
            if (target <= matrix[rStart + 1][cMid - 1]) {
                return Bineary(matrix, rStart + 1, 0, cMid - 1, target);
            }
            //search in 4th half
            else {
                return Bineary(matrix, rStart + 1, cMid + 1, col - 1, target);
            }
    }


    public static void main(String[] args) {
        
    }

    }
