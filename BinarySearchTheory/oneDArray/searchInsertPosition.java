package BinarySearchTheory.oneDArray;

import java.util.Scanner;

public class searchInsertPosition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Range of the Array: ");
        int n = sc.nextInt();
        int[] arr = new int[(n)];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int target = 9;
        System.out.println(searchInsertPositionSolver(arr, target));
        sc.close();
    }
    public static int searchInsertPositionSolver(int[] arr,int target) {
        int right = arr.length-1;
        int left = 0;
        int idx = 0;
        while(left <= right){
            int mid = left + (right-left)/2;
            if(arr[mid] >= target){
                if(arr[mid] == target)return mid;
                else idx = mid+1;
                right = mid-1;
            }else{
                left = mid+1;
            }
        }
        return idx;
    }
}
