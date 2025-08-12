package BinarySearchTheory.bsOnAnswers;

public class kthMissingNo {
    public static void main(String[] args) {
        int[] arr = new int[]{2,3,4,7,11};
        int k = 5;
        System.out.println(Optimal_kthMissingNoSolver(arr, k));
    }
    public static int Brute_kthMissingNoSolver(int[] arr,int k){             
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] <= k)k++;
            else break;
        }
        return k;
    }

    //Optimal Solution Binary Search
    public static int Optimal_kthMissingNoSolver(int[] arr, int k) {
        int left = 0;
        int right = arr.length-1;
        while(left<=right){
            int mid = left+(right-left)/2;
            int missing = arr[mid] - (mid+1);
            if(missing < k){
                left = mid+1;
            }else right = mid-1;
        }
        return left+k;
    }

}
