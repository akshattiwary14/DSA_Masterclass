package BinarySearchTheory.bsOnAnswers;

public class Mbouquets {
    public static void main(String[] args) {
        int[] bloomDay = new int[]{7,7,7,7,13,11,12,7};
        int m = 2;
        int k = 3;
        System.out.println(MbouquetsSolver(bloomDay, m, k));
    }
    //Returning left because of opposite polarity
    public static int MbouquetsSolver(int[] bloomDay,int m,int k) {
        if(m*k > bloomDay.length)return -1;
        int left = getMin(bloomDay);
        int right = getMax(bloomDay);
        while(left<=right){
            int mid = left+(right-left)/2;
            if(canBloom(bloomDay, mid, m, k)){
                right = mid-1;
            }else{
                left = mid+1;
            }
        }
        return left;
    }
    public static int getMax(int[] bloomDay){
        int max = Integer.MIN_VALUE;
        for (int i : bloomDay) {
            max = Math.max(i,max);
        }
        return max;
    }
    public static int getMin(int[] bloomDay){
        int min = Integer.MAX_VALUE;
        for (int i : bloomDay) {
            min = Math.min(i,min);
        }
        return min;
    }  
    public static boolean canBloom(int[] bloomDay,int day,int m,int k){
        int count = 0;
        int bouquets = 0;
        for (int i = 0; i < bloomDay.length; i++) {
            if(bloomDay[i] <= day){
                count++;
                if(count == k){
                    bouquets++;
                    count = 0;
                }
            }else{
                count = 0;
            }
        }
        return (bouquets>=m);
    }
}
