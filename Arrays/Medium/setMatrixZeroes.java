package Arrays.Medium;

import java.util.Scanner;

public class setMatrixZeroes {
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
        Optimal_setMatrixZeroesSolver(matrix, rows, cols);
        System.out.println();
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
        sc.close();
    }
    public static void Brute_setMatrixZeroesSolver(int[][] matrix,int m,int n){
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if(matrix[i][j] == 0){
                    markRows(matrix,i,m);
                    markColumns(matrix,j,n);
                }
            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if(matrix[i][j] == -1){
                    matrix[i][j] = 0;
                }
            }
        }
    }
    public static void markRows(int[][] matrix,int i,int m){
        for (int j = 0; j < m; j++) {
            if(matrix[i][j] != 0){
                matrix[i][j] = -1;
            }
        }
    }
    public static void markColumns(int[][] matrix,int j,int n){
        for (int i = 0; i < n; i++) {
            if(matrix[i][j] != 0){
                matrix[i][j] = -1;
            }
        }
    }

    //The Better Solution 
    public static void Better_setMatrixZeroesSolver(int[][] matrix,int m,int n){
        int[] r_idx = new int[m];
        int[] c_idx = new int[n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if(matrix[i][j] == 0){
                    r_idx[i] = -1;
                    c_idx[j] = -1;
                }
            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if(r_idx[i] == -1 || c_idx[j] == -1){
                    matrix[i][j] = 0;
                }
            }
        }
    }

    //The Optimal Solution
    public static void Optimal_setMatrixZeroesSolver(int[][] matrix,int m,int n){
        int col0 = matrix[0][0];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if(matrix[i][j] == 0){
                    matrix[0][j] = 0;
                    if(j!=0)matrix[i][0] = 0;
                    else col0=0;
                }
            }
        }
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                if(matrix[i][0] == 0 || matrix[0][j] == 0){
                    matrix[i][j] = 0;
                }
            }
        }
        if(matrix[0][0] == 0){
            for (int i = 0; i < m; i++) {
                matrix[0][i] = 0;
            }
        }
        if(col0 == 0){
            for (int i = 0; i < n; i++) {
                matrix[i][0] = 0;
            }
        }
    }
}