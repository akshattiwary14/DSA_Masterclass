package BinarySearchTheory.oneDArray;

import java.util.Scanner;

public class lastOccurance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Range of the Array: ");
        int n = sc.nextInt();
        int[] arr = new int[(n)];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int x = 60;
        System.out.println(lastOccuranceSolver(arr, x));
        sc.close();
    }
    public static int lastOccuranceSolver(int[] arr,int target) {
        int left = 0;
        int right = arr.length-1;
        while(left<=right){
            int mid = left+(right-left)/2;
            if(arr[mid] > target){
                right = mid-1;
            }else left = mid+1;
        }
        return right-1;
    }
}
