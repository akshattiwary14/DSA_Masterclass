package BinarySearchTheory.oneDArray;

import java.util.Arrays;
import java.util.Scanner;

public class occurance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Range of the Array: ");
        int n = sc.nextInt();
        int[] arr = new int[(n)];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int target = 3;
        int[] result = occuranceSolverDifferent(arr,target);
        System.out.println(Arrays.toString(result));
        sc.close();
    }
    public static int[] occuranceSolver(int[] arr,int target) {
        int lb = lowBoundSolver(arr, target);
        if(lb == arr.length || arr[lb]!=target){
            return new int[]{-1,-1};    
        }
        int ub = upperBoundSolver(arr, target);
        return new int[]{lb,ub-1};
    }
    public static int lowBoundSolver(int[] arr , int x){
        int left = 0;
        int ans = -1; 
        int right = arr.length-1;
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
    public static int upperBoundSolver(int[] arr , int x){
        int left = 0;
        int ans = -1; 
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

    public static int[] occuranceSolverDifferent(int[] arr,int target){
        int left = 0;
        int right = arr.length -1;
        int first = -1;
        int last = -1;
        while(left<=right){
            int mid = left + (right-left)/2;
            if(arr[mid] == target){
                first = mid;
                right = mid-1;
            }else if(arr[mid] > target){
                right = mid-1;
            }else left = mid+1;
        }
        left = 0;
        right = arr.length -1;
        while(left<=right){
            int mid = left + (right-left)/2;
            if(arr[mid] == target){
                last = mid;
                left = mid+1;
            }else if(arr[mid] > target){
                right = mid-1;
            }else left = mid+1;
        }
        return new int[]{first,last};
    }
}
