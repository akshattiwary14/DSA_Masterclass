package BinarySearchTheory.oneDArray;

import java.util.Scanner;

public class upperBound {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Range of the Array: ");
        int n = sc.nextInt();
        int[] arr = new int[(n)];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int x = 2;
        int j = lowBoundSolver(arr, x);
        System.out.println(j);
        sc.close();
    }
    public static int lowBoundSolver(int[] arr , int x){
        int left = 0;
        int ans = 0; 
        int right = arr.length-1;
        while(left<=right){
            int mid = left + (right-left)/2;
            if(arr[mid] > x){
                ans = mid;
                right = mid-1;
            }
            else left = mid+1;
        }
        return ans;
    }
}
