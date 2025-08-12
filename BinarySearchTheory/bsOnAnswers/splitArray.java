package BinarySearchTheory.bsOnAnswers;

public class splitArray {
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4,5};
        int k = 3;
        System.out.println(splitArraySolver(arr, k));
    }
    public static int splitArraySolver(int[] arr,int k) {
        if(k>arr.length)return -1;
        int left = Integer.MIN_VALUE;
        int right = 0;
        for (int i : arr) {
            left = Math.max(i,left);
            right += i;
        }
        while(left<=right){
            int mid = left+(right-left)/2;
            if(islargestSum(arr,mid,k)){
                right = mid-1;
            }else left = mid+1;
        }
        return left;
    }
    public static boolean islargestSum(int[] arr,int mid,int k) {
        int lastSum = arr[0];
        int current = 1;
        for (int j = 1; j < arr.length; j++) {
            if(lastSum+arr[j] <= mid){
                lastSum += arr[j];
            }else{
                current++;
                lastSum = arr[j];
            }
        }
        return (current <= k);
    }
}
