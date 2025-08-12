package BinarySearchTheory.oneDArray;

import java.util.Scanner;

public class peakElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Range of the Array: ");
        int n = sc.nextInt();
        int[] arr = new int[(n)];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(peakElementSolver(arr));
        sc.close();
    }
    public static int peakElementSolver(int[] arr) {
        if(arr.length == 1)return 0;
        if(arr[0] > arr[1] && arr[0] > Integer.MIN_VALUE)return 0;
        if(arr[arr.length-1] > arr[arr.length-2] && arr[arr.length-1] > Integer.MIN_VALUE)return arr.length-1;
        int left = 0;
        int right = arr.length-1;
        while (left<=right) {
            int mid = left+(right-left)/2;
            if(arr[mid] > arr[mid-1] && arr[mid] > arr[mid+1])return mid;
            else if(arr[mid] > arr[mid-1])left = mid+1;
            else if(arr[mid] > arr[mid+1])right = mid-1;
            else left = mid+1;
        }
        return -1;
    }
}
