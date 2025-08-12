package BinarySearchTheory.bsOnAnswers;

public class shipPackagesDdays {
    public static void main(String[] args) {
        int[] arr = new int[]{5,4,5,2,3,4,5,6};
        int d = 5;
        System.out.println(shipPackagesDdaysSolver(arr, d));
    }
    public static int shipPackagesDdaysSolver(int[] arr,int d) {
        int left = Integer.MIN_VALUE;
        int right = 0;
        for (int i : arr) {
            right+=i;
            left = Math.max(left,i);
        }
        while (left<=right) {
            int mid = left+(right-left)/2;
            if(canShip(arr, mid, d)){
                right = mid-1;
            }else left = mid+1;
        }
        return left;
    }
    public static boolean canShip(int[] arr,int mid,int d) {
        int days = 1;
        int sum = 0;
        for (int i : arr) {
            if( sum+i > mid){
                days++;
                sum = i;
            }else sum+=i;
        }
        return (days<=d);
    }
}
