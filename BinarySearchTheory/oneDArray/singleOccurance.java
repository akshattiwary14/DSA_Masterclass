package BinarySearchTheory.oneDArray;

import java.util.Scanner;

public class singleOccurance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Range of the Array: ");
        int n = sc.nextInt();
        int[] arr = new int[(n)];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(singleOccuranceSolver(arr));
        sc.close();
    }
    public static int singleOccuranceSolver(int[] arr){
        if(arr.length == 1)return arr[0];
        if(arr[0] != arr[1])return arr[0];
        if(arr[arr.length-1] != arr[arr.length-2])return arr[arr.length-1];
        int left = 1;
        int right = arr.length-2;
        while(left<=right){
            int mid = left+(right-left)/2;
            if(arr[mid] != arr[mid-1] && arr[mid] != arr[mid+1]){
                return arr[mid];
            }else if(arr[mid] == arr[mid-1]){
                if((mid-1)%2 == 0)left = mid+1;
                else right = mid-2;
            }else if(arr[mid] == arr[mid+1]){
                if(mid%2 == 0)left = mid+2;
                else right = mid-1;
            }
        }
        return -1;
    }
}
