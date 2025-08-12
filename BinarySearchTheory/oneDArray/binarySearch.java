package BinarySearchTheory.oneDArray;

import java.util.Scanner;

public class binarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Range of the Array: ");
        int n = sc.nextInt();
        int[] arr = new int[(n)];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int target = 9;
        int left = 0;
        int right = arr.length-1;
        if(recursive_binarySearchSolver(arr, target,left,right)){
            System.out.println("Element is present");
        }else{
            System.out.println("Element is not present");
        }
        sc.close();
    }
    public static boolean binarySearchSolver(int[] arr,int target){
        int left = 0;
        int right = arr.length - 1;
        while(left<=right){
            int mid = (left+right)/2;
            if(arr[mid] == target)return true;
            else if(arr[mid] > target)right = mid-1;
            else if(arr[mid] < target)left = mid+1;
        }
        return false;
    }  

    public static boolean recursive_binarySearchSolver(int[] arr,int target,int left,int right){
        if(left>right)return false;
        int mid = left + (right-left)/2;
        if(target == arr[mid])return true;
        else if(target > arr[mid])return recursive_binarySearchSolver(arr, target, mid+1, right);
        else return recursive_binarySearchSolver(arr, target, left, mid-1);
    }
}
