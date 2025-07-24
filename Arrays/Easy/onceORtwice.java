package Arrays.Easy;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class onceORtwice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int range = sc.nextInt();
        int[] arr = new int[(range)];
        System.out.println("Enter elements into the array in binary fashion(0 || 1): ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        OptimalnumberOccurence(arr);
        sc.close();
    }
    public static void BetternumberOccurence(int[] arr){
        HashMap<Integer,Integer> freqmap = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            freqmap.put(arr[i],freqmap.getOrDefault(arr[i],0)+1);
        }
        System.out.print("Elements With frequency 1: ");
        for (Map.Entry<Integer,Integer> entry : freqmap.entrySet()) {
            if(entry.getValue() == 1){
                System.out.print(entry.getKey()+" , "); 
            }
        }
    }

    public static void OptimalnumberOccurence(int[] arr){
        int xor = 0;
        for (int i = 0; i < arr.length; i++) {
            xor = xor^arr[i];
        }
        System.out.println("Element with frequency 1 : "+xor);
    } 
}