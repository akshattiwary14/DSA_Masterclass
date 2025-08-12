package BinarySearchTheory.twoDArray;

import java.util.Scanner;

public class searchinTwoD {
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
        int x = sc.nextInt();
        if(searchinTwoDSolver(matrix, rows, cols, x)){
            System.out.println("True");
        }else System.out.println("False");
        sc.close();
    }
    public static  boolean searchinTwoDSolver(int[][] arr,int row,int cols,int x) {
        for (int i = 0; i < row; i++) {
            if(isPresent(arr[i] , cols , x)){
                return true;
            }
        }
        return false;
    }
    public static boolean isPresent(int[] arr,int cols,int x){
        int left = 0;
        int right = cols-1;
        while(left <= right){
            int mid = left+(right-left)/2;
            if(arr[mid] == x){
                return true;
            }else if(arr[mid] <= x){
                left = mid+1;
            }else right = mid-1;
        }
        return false;
    }
}
