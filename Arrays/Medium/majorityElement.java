package Arrays.Medium;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class majorityElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Range of the Array: ");
        int n = sc.nextInt();
        int[] arr = new int[(n)];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("The majority Elemnent(>n/2) is : "+Best_majorityElementSolver(arr));
        sc.close();
    }

    public static int Brute_majorityElementSolver(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            for (int j = i; j < arr.length; j++) {
                if(arr[j] == arr[i]){
                    count++;
                }
            }
            if(count > (arr.length/2)){
                return arr[i];
            }
        }
        return -1;
    }

    public static int Better_majorityElementSolver(int[] arr){
        HashMap<Integer,Integer> freqMap = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            freqMap.put(arr[i],freqMap.getOrDefault(arr[i],0)+1);
        } 
        for (Map.Entry<Integer,Integer> entry:freqMap.entrySet()) {
            if(entry.getValue() > arr.length/2){
                return entry.getKey();
            }
        }
        
        return -1;
    }

    //The Optimal Approach is called Moore's Voting ALGO
    public static int Best_majorityElementSolver(int[] arr){
        int count = 0;
        int ele = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(count == 0){
                ele = arr[i];
                count = 1;
            }else if(arr[i] == ele){
                count++;
            }else{
                count--;
                }
            }
        count = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == ele){
                count++;
            }
        }
        if(count > (arr.length/2)){
            return ele;
        }
        return -1;    
    }

}