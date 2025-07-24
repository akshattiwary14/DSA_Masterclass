/* The Permutation means rearranging array in all possible order  */

package Arrays.Medium;

import java.util.Scanner;

public class nextPermutation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Range of the Array: ");
        int n = sc.nextInt();
        int[] arr = new int[(n)];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        nextPermutationSolver(arr);
        System.out.println("The resultant array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        sc.close();
    }
    // The Brute force approach includes generating all the permutations and then doinmg a linear
    //search so it would take O(N! * N)
    public static void nextPermutationSolver(int[] arr) {
        int  idx = -1;
        for (int i = arr.length-2; i > 0; i--) {
            if(arr[i] < arr[i+1]){
                idx = i;
                break;
            }
        }
        if(idx == -1){
            reverse(arr);
        }else{
            for (int i = arr.length-1; i > 0; i--) {
                if(arr[i] > arr[idx]){
                    swap(arr , i , idx);
                    reverse(arr, idx+1 , arr.length);
                    break;
                }
            }
        }
    }
    public static void reverse(int[] arr){
        int right = arr.length -1;
        int left = 0;
        while(left <= right){
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }

    public static void swap(int[] arr , int a ,int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    public static void reverse(int[] arr,int a,int b){
        int right = b-1;
        int left = a;
        while(left <= right){
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }
}