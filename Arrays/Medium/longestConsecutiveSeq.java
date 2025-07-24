package Arrays.Medium;
import java.util.HashSet;
import java.util.Scanner;

public class longestConsecutiveSeq {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Range of the Array: ");
        int n = sc.nextInt();
        int[] arr = new int[(n)];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("The longest consecutive sequence is : "+longestConsecutiveSeqSolver(arr));
        sc.close();
    }
    public static int longestConsecutiveSeqSolver(int[] arr) {
        if((arr.length-1) == 0) return 0;
        int max_count = 0;
        HashSet<Integer> seq = new HashSet<>();
        for (int num : arr)seq.add(num);
        for (Integer num : seq) {
            if(!seq.contains(num-1)){
                int current = num;
                int count = 1;
                while(seq.contains(current + 1)){
                    current++;
                    count++;
                }
                max_count = Math.max(max_count, count);
            }
        }
        return max_count;
    }

    public static int Brute_longestConsecutiveSeqSolver(int[] arr){
        int max_count = 0;
        for (int i = 0; i < arr.length; i++) {
            int count = 1;
            int current_element = arr[i];
            for (int j = 0; j < arr.length; j++) {
                if(arr[j] == current_element+1){
                    current_element = arr[j];
                    count++;
                    j = -1;
                }             
            }
            max_count = Math.max(max_count, count);
        }
        return max_count;
    }
}