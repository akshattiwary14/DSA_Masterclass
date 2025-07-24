package Arrays.Easy;

import java.util.HashSet;
import java.util.Scanner;

public class duplicate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Range of the Array: ");
        int n = sc.nextInt();
        int[] arr = new int[(n)];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int newLength = duplicateTwoPointer(arr);
        System.out.println("After Removing Dupes: ");
        for (int i = 0; i < newLength; i++) {
            System.out.println(arr[i]);
        }
        sc.close();
    }
    //Brute Force
    public static void duplicateELE(int[] arr){
        HashSet<Integer> hash = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            hash.add(arr[i]);
        }
        int j = 0;
        for(int x : hash){
            arr[j++] = x;
        }
    }
    //Optimal Approach
    public static int duplicateTwoPointer(int[] arr){
        int i = 0;
        for (int j = 1; j < arr.length; j++) {
            if(arr[i] != arr[j]){
                i++;
                arr[i] = arr[j];
            }
        }
        return i;
    }
}
