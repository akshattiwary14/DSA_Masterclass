package HashingTheory;
import java.util.*;
public class FrequencyCounter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elemnets");
        int n = sc.nextInt();
        int[] arr = new int[(n)];
        System.out.print("Enter the elements of array: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        //precompute
        int[] hash = new int[13];
        for (int i = 0; i < arr.length; i++) {
            hash[arr[i]] += 1;
        }
        //fetching
        System.out.println("Enter the number for frequency calculations: ");
        int freq = sc.nextInt();
        System.out.println("Frequency == "+hash[freq]);

        sc.close();
    }
}
