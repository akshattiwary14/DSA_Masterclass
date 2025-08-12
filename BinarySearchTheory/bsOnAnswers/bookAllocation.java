package BinarySearchTheory.bsOnAnswers;

public class bookAllocation {
    public static void main(String[] args) {
        int[] arr = new int[]{25,46,28,49,24};
        int m = 4;
        System.out.println(bookAllocationSolver(arr, m));
    }
    public static int bookAllocationSolver(int[] arr,int m) {
        if(m>arr.length) return -1;
        int left = Integer.MIN_VALUE;
        int right = 0;
        for (int i : arr) {
            left = Math.max(i,left);
            right += i;
        }
        while(left<=right){
            int mid = left+(right-left)/2;
            if(allocationPossible(arr, mid, m)){
                right = mid-1;
            }else left = mid+1;
        }
        return left;
    }
    public static boolean allocationPossible(int[] arr,int mid,int m) {
        int lastSum = arr[0];
        int student = 1;
        for (int i = 1; i < arr.length; i++) {
            if(lastSum+arr[i] <= mid){
                lastSum = lastSum+arr[i];
            }else{
                student++;
                lastSum = arr[i];
            }
        }
        return (student <= m);
    }
}
