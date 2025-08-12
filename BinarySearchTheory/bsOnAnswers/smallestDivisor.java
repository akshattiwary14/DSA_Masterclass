package BinarySearchTheory.bsOnAnswers;

public class smallestDivisor {
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4,5};
        int threshold = 8;
        System.out.println(smallestDivisorSolver(arr, threshold));
    }   
    public static int smallestDivisorSolver(int[] arr,int k) {
        int max = Integer.MIN_VALUE;
        int min = 1;
        for (int j : arr) {
            max = Math.max(max,j);
        }
        int left = min;
        int right = max;
        while(left<=right){
            int mid = left+(right-left)/2;
            if(withinThreshold(arr, k, mid)){
                right = mid-1;
            }else left = mid+1;
        }
        return left;
    }
    public static boolean withinThreshold(int[] arr,int k,int mid){
        long ans = 0;
        for(int i : arr) {
            ans += (i+mid-1)/mid;
        }
        return (ans<=k);
    } 
}

