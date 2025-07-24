package Recursion;
import java.util.*;
public class arrayReverse {
    public static void revereese(int[] arr,int l,int r){
        if(l>r){
            return;
        }
        int temp = arr[l];
        arr[l] = arr[r];
        arr[r] = temp;
        revereese(arr, l+1, r-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the range of array: ");
        int n = sc.nextInt();
        int[] arr = new int[(n)];
        System.out.print("Enter the values into the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        revereese(arr, 0, n-1);
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
        sc.close();
    }
}
