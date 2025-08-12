package BinarySearchTheory.oneDArray;

import java.util.Scanner;

public class floorAndCeil {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Range of the Array: ");
        int n = sc.nextInt();
        int[] arr = new int[(n)];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int x = 8;
        floorAndCeilSolver(arr, x);
        sc.close();
    }
    public static void floorAndCeilSolver(int[] arr,int target) {
        int floor = 0;
        int ceil = 0;
        int left = 0;
        int right = arr.length - 1;
        while(left<=right){
            int mid = left + (right-left)/2;
            if(arr[mid] == target){
                floor = ceil = mid;
                break;
            }else if(arr[mid] > target){
                ceil = mid;
                right = mid-1;
            }else{
                floor = mid;
                left = mid+1;
            }
        }
        System.out.println("Floor: "+arr[floor]+" ,Ceil: "+arr[ceil]);
    }
}
