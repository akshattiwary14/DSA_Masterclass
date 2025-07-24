package Arrays.Easy;

import java.util.Scanner;

public class consective_ones {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int range = sc.nextInt();
        int[] arr = new int[(range)];
        System.out.println("Enter elements into the array in binary fashion(0 || 1): ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("The maximum consecutive in an array is : "+maxConsecutiveOnes(arr));
        sc.close();
    }
    public static int maxConsecutiveOnes(int[] arr){
        int current_freq = 0;
        int last_freq = current_freq;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == 1){
                current_freq++;
            }else{
                if(current_freq >= last_freq){
                    last_freq = current_freq;
                }
                current_freq = 0;
            }
        }
        return Math.max(current_freq,last_freq);
    }
}
