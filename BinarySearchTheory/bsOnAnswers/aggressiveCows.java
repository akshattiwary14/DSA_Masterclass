package BinarySearchTheory.bsOnAnswers;

import java.util.Arrays;

public class aggressiveCows {
    public static void main(String[] args) {
        int[] arr = new int[]{0,3,4,7,10,9};
        int cows = 4;
        System.out.println(aggressiveCowsSolver(arr, cows));
    }
    public static int aggressiveCowsSolver(int[] arr,int cows) {
        Arrays.sort(arr);
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i : arr) {
            max = Math.max(i,max);
            min = Math.min(i,min);
        }
        int left = 1;
        int right = max-min;
        while(left<=right){
            int mid = left+(right-left)/2;
            if(isPossible(arr,mid,cows)){
                left = mid+1;
            }else right = mid-1;
        }
        return right;
    }
    public static boolean isPossible(int[] arr,int mid,int cows){
        int cow = 1;
        int lastCow = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] - lastCow >= mid){
                cow++;
                lastCow = arr[i];
            }
        }
        return (cow>=cows);
    }
}