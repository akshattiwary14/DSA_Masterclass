package Arrays.Medium;

import java.util.Scanner;

public class rotateImage {
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
        Optimal_rotateImageSolver(matrix, rows, cols);
        System.out.println();
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
        sc.close();
    }
    public static void Brute_rotateImageSolver(int[][] matrix,int rows,int cols) {
        int[][] ans = new int[rows][cols]; 
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                ans[j][(cols-1) - i] = matrix[i][j]; 
            }
        }
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(ans[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static void Optimal_rotateImageSolver(int[][] matrix,int rows,int cols){
        for (int i = 0; i < rows-1; i++) {
            for (int j = i+1; j < cols; j++) {
                int temp = 0;
                temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length / 2; j++) {
                int temp = 0;
                temp = matrix[i][j];
                matrix[i][j] = matrix[i][matrix.length - 1 - j];
                matrix[i][matrix.length - 1 - j] = temp;
            }
        }
    }
}