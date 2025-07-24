package HashingTheory;
import java.util.*;
public class hMapFreq {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter the size of array: ");
        n = sc.nextInt();
        int[] arr = new int[(n)];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        //pre compute
        HashMap<Integer,Integer> freqMap = new HashMap<>();
        for(int i = 0; i<arr.length;i++){
            freqMap.put(arr[i] , freqMap.getOrDefault(arr[i], 0)+1);
        }

        System.out.println("Frequencies of numbers:");
        for (Map.Entry<Integer, Integer> entry : freqMap.entrySet()) {
            System.out.println("Number " + entry.getKey() + " -> " + entry.getValue() + " times");
        }
        sc.close(); 
    }
}
