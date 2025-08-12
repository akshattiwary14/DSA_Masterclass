package BinarySearchTheory.oneDArray;

import java.util.Scanner;

public class minimumInRotatedArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Range of the Array: ");
        int n = sc.nextInt();
        int[] arr = new int[(n)];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(minimumInRotatedArraySolver(arr));
        sc.close();
    }
    public static int minimumInRotatedArraySolver(int[] arr) {
        int left = 0;
        int right = arr.length-1;
        while(left<=right){
            int mid = left+(right-left)/2;
            if(arr[mid] > arr[right]){
                left = mid+1;
            }else if(arr[mid] < arr[right]){
                right = mid;
            }else{
                right--;
            }
        }
        return arr[left];
    }
}
