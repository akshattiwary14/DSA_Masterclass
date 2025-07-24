package Arrays.Medium;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class spiralTraversal {
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
        spiralTraversalSolver(matrix, rows, cols);
        sc.close();
    }
    public static void spiralTraversalSolver(int[][]matrix, int m, int n){
        int top = 0;
        int left = 0;
        int right = n-1;
        int bottom = m-1;
        List<Integer> ans = new ArrayList<>();
        while(top<=bottom && left<=right){
            for (int i = left; i <= right; i++)ans.add(matrix[top][i]);
            top++;
            for (int i = top; i <= bottom; i++)ans.add(matrix[i][right]);
            right--;
            if(top<=bottom){
                for (int i = right; i >= left; i--)ans.add(matrix[bottom][i]);
                bottom--;
            }
            if(left<=right){
                for (int i = bottom; i >= top; i--)ans.add(matrix[i][left]);
                left++;
            }
        }
        for (int i = 0; i < ans.size(); i++) {
            System.out.print(ans.get(i)+" ");
        }

    }
}
