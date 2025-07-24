package Arrays.Medium;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class leadersArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Range of the Array: ");
        int n = sc.nextInt();
        int[] arr = new int[(n)];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        leadersArraySolver(arr);
        sc.close();
    }
    public static void leadersArraySolver(int[] arr) {
        ArrayList<Integer> ans = new ArrayList<>();
        int maxFromRight = arr[arr.length - 1];
        ans.add(maxFromRight);
        for (int i = arr.length - 2; i >= 0; i--) {
            if(arr[i] > maxFromRight){
                maxFromRight = arr[i];
                ans.add(maxFromRight);
            }
        }
        Collections.reverse(ans);
        for (int i = 0; i < ans.size(); i++) {
            System.out.print(ans.get(i) + " ");
        }
    }
}