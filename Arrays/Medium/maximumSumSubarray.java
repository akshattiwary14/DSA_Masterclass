package Arrays.Medium;

import java.util.Scanner;

public class maximumSumSubarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Range of the Array: ");
        int n = sc.nextInt();
        int[] arr = new int[(n)];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("The maximum sum is :"+Optimal_maximumSumSubarraySolver(arr));
        sc.close();    
    }

    //The Brute Approach contains the use of three loops with O(n^3)

    public static int Better_maximumSumSubarraySolver(int[] arr){
        int current_sum , maximum = 0;
        for (int i = 0; i < arr.length; i++) {
            current_sum = 0;
            for (int j = i; j < arr.length; j++) {
                current_sum += arr[j];
            }
            maximum = Math.max(current_sum,maximum);
        }
        return maximum; 
    }

    //KADANE'S algo
    public static int Optimal_maximumSumSubarraySolver(int[] arr){
        int max = arr[0], current_sum = arr[0];
        for(int i = 1 ; i < arr.length ; i++){
            current_sum = Math.max(arr[i] , (current_sum+arr[i]) );
            max = Math.max(current_sum , max);
        }
        return max;
    }
}