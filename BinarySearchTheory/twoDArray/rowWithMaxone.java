package BinarySearchTheory.twoDArray;
import java.util.Scanner;
public class rowWithMaxone {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the rows and columns: ");
        int rows = sc.nextInt();
        int cols = sc.nextInt();
        int matrix[][] = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        System.out.println(rowWithMaxoneSolver(matrix, rows, cols));
        sc.close();
    }
    public static int rowWithMaxoneSolver(int[][] arr,int row,int cols) {
        int countMax = 0;
        int index = -1;
        for (int i = 0; i < row; i++) {
            int count = lowBoundSolver(arr[i],1,cols);
             int numOnes = (count == -1) ? 0 : (cols - count);
            if(numOnes > countMax){
                countMax = Math.max(numOnes,countMax);
                index = i;
            }
        }
        return index;   
    }
    public static int lowBoundSolver(int[] arr , int x,int n){
        int left = 0;
        int ans = -1; 
        int right = n-1;
        while(left<=right){
            int mid = left + (right-left)/2;
            if(arr[mid] >= x){
                ans = mid;
                right = mid-1;
            }
            else left = mid+1;
        }
        return ans;
    }
}
