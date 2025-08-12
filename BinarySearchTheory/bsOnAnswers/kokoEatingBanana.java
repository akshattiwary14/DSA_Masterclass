package BinarySearchTheory.bsOnAnswers;

public class kokoEatingBanana {
    public static void main(String[] args) {
        int[] arr = new int[]{3,6,7,11};
        int h = 8;
        System.out.println(kokoEatingBananaSolver(arr, h));
    }
    // public static int Brute_kokoEatingBananaSolver(int[] piles , int h) {
    //     int k = 1;
    //     int reqTime = 0;
    //     for (int i = 0; i < piles[piles.length-1]; i++){
    //         reqTime = eatingTime(piles,k,h);
    //         if(reqTime > h){
    //             k++;
    //         }else if(reqTime <= h)return reqTime;
    //     }
    //     return -1;
    // }
    public static int kokoEatingBananaSolver(int[] piles,int h){
        int left = 1;
        int right = getMax(piles);
        int ans = right;
        while(left<=right){
            int mid = left+(right-left)/2;
            if(eatingTime(piles, mid, h)){
                ans = mid;
                right = mid-1;
            }else{
                left = mid+1;
            }
        }
        return ans;
    }
    public static int getMax(int[] piles){
        int max = 0;
        for (int i : piles) {
            max = Math.max(i,max);
        }
        return max;
    } 
    public static boolean eatingTime(int[] piles , int k,int h) {
        int total_hours = 0;
        for (int i = 0; i < piles.length; i++) {
            total_hours += (piles[i] + k -1)/k;
        }
        return (total_hours<=h);
    }
}
