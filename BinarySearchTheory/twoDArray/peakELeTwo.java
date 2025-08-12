package BinarySearchTheory.twoDArray;

public class peakELeTwo {
    public static void main(String[] args) {
        
    }
    public static int[] peakELeTwoSolver(int[][] mat) {
        int left = 0;
        int right = mat[0].length-1;
        while(left<=right){
            int mid = left+(right-left)/2;
            int peak = peakFinder(mat,mat.length,mat[0].length,mid);
            int left1 = (mid-1 >= 0)?mat[peak][mid-1]:-1;
            int right1 = (mid+1 < mat[0].length)?mat[peak][mid+1]:-1;
            if(mat[peak][mid] > left1 && mat[peak][mid] > right1)return new int[]{peak,mid};
            else if(mat[peak][mid] < left1)right = mid-1;
            else left = mid+1;
        }    
        return new int[]{-1,-1};
    }
    public static int peakFinder(int[][] mat,int row,int col,int mid) {
        int maxVAlue = -1;
        int idx = -1;
        for (int j = 0; j < mat.length; j++) {
            if(mat[j][mid] > maxVAlue){
                maxVAlue = mat[j][mid];
                idx = j;
            }
        }
        return idx;
    }
}
