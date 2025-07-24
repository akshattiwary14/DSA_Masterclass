package HashingTheory;

import java.util.*;

public class characterFreq {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of charaters: ");
        int n = sc.nextInt();
        char[] arr = new char[n];
        System.out.print("Enter the elements of array: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.next().charAt(0);
        }
        //precompute
        int[] feqArr = new int[26];
        for (int i = 0; i < arr.length; i++) {
            int index = arr[i] - 'a';
            feqArr[index] += 1;
        }

        //fetching
        char n1;
        System.out.print("Enter the character for frequency Calculations: ");
        n1 = sc.next().charAt(0);
        System.out.println("Frequency == "+feqArr[n1 - 'a']);
        sc.close();
    }
}
