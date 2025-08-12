package BinarySearchTheory.bsOnAnswers;

public class paintersPartition {
    public static void main(String[] args) {
        int[] arr = new int[]{10,20,30,40};
        int k = 2;
        System.out.println(paintersPartitionSolver(arr, k));
    }
    public static int paintersPartitionSolver(int[] arr,int k) {
        int left = Integer.MIN_VALUE;
        int right = 0;
        for (int i : arr) {
            left = Math.max(i,left);
            right+=i;
        }
        while(left<=right){
            int mid = left+(right-left)/2;
            if(minimumTimeFinder(arr,mid,k))right = mid-1;
            else left = mid+1;
        }
        return left;
    }
    public static boolean minimumTimeFinder(int[] arr,int mid,int k) {
        int current = 1;
        int currentTime = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(currentTime+arr[i] <= mid){
                currentTime = currentTime+arr[i];
            }else{
                current++;
                currentTime = arr[i];
            }
        }
        return (current<=k);
    }
}
