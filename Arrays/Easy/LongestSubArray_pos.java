package Arrays.Easy;

import java.util.HashMap;
import java.util.Scanner;

public class LongestSubArray_pos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter the size of array: ");
        n = sc.nextInt();
        int[] arr = new int[(n)];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int k;
        System.out.print("Enter the sum: ");
        k = sc.nextInt();
        System.out.println("The Length of the Longest SUbarray is : "+Best_finding_longestSubArray(arr,k));
        sc.close();
    }
    public static int Brute_finding_longestSubArray(int[] arr,int k){
        int current_sum = 0;
        int len = 0;
        for (int i = 0; i < arr.length; i++) {
            for(int j = i; j < arr.length; j++) {
                for (int j2 = i; j2 <= j; j2++) {
                    current_sum+=arr[j2];
                    if(current_sum == k){
                        len = Math.max(len,j-i+1);
                    }
                }
            }
        }
        return len;
    }

    public static int Brute2_finding_longestSubArray(int[] arr,int k){
        int len = 0;
        for (int i = 0; i < arr.length; i++) {
            int current_sum = 0;
            for (int j = i; j < arr.length; j++) {
                current_sum+=arr[j];
                if(current_sum == k){
                    len = Math.max(len , j-i+1);
                }
            }
        }
        return len;
    }


    /*Reverse Engineering also best when array has pos+neg+zeroes
 * While using unordered map TC:O(N*1)-best and O(N*N)-worst
 * While using ordered map TC:O(N*logN)
*/
    public static int Better_finding_longestSubArray(int[] arr,int k){
        HashMap<Integer,Integer> prefixSum = new HashMap<>();
        int len = 0;
        int current_sum = 0;
        for (int i = 0; i < arr.length; i++) {
            current_sum+=arr[i];
            if(current_sum == k){
                len = i+1 ;
            }
            int rem = current_sum - k;
            if(prefixSum.containsKey(rem)){
                len = Math.max(len, i - prefixSum.get(rem));
            }
            if(!prefixSum.containsKey(current_sum)){
                prefixSum.put(current_sum,i);
            }

        }
        
        return len;
    }



    public static int Best_finding_longestSubArray(int[] arr,int k){
        int current_sum = 0;
        int left = 0;
        int right;
        int len = 0;
        for (right = 0; right < arr.length; right++){
            current_sum+=arr[right];
            while(current_sum > k && left<=right){
                current_sum -= arr[left];
                left++;
            }
            if(current_sum == k){
                len = Math.max(len , right-left+1);
            }

            right++;
        }
        return len;
    }
}
