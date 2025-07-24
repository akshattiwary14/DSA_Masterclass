package Arrays.arrayPatterns;

public class sumTillK_SW {
    public static void main(String[] args) {
        int[] arr = new int[]{10,2,7,8,11,13};
        int k = 3;
        sumTillKSolver(arr, k);
    }
    public static void sumTillKSolver(int[] arr , int k) {
        int current_sum = 0;
        for (int j = 0; j < k; j++) {
            current_sum += arr[j];
        }
        System.out.println(current_sum+" ");
        for (int j = k; j < arr.length; j++) {
            current_sum = current_sum - arr[j-k] + arr[j];
            System.out.println(current_sum+" ");
        }
    }
}
