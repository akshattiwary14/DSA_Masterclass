package BinarySearchTheory.bsOnAnswers;

public class sqrtFinder {
    public static void main(String[] args) {
        int n = 28;
        System.out.println(Optimal_sqrtFinderAlgo(n));
    }
    public static int Brute_sqrtFinderAlgo(int n) {
        int idx = 0;
        for(int i = 0; i < n/2; i++) {
            if(i*i <= n)idx = i;
            else break;
        }
        return idx;
    }
    //Use long to avoid overflowing
    public static int Optimal_sqrtFinderAlgo(int n) {
        int idx = 0;
        int left = 1;
        int right = n/2 + 1;
        while(left<=right){
            int mid = left + (right-left)/2;
            if(mid*mid <= n){
                idx = mid;
                left=mid+1;
            }else{
                right = mid-1;
            }
        }
        return idx;
    }
}
