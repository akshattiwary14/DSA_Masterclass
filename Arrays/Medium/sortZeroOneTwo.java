package Arrays.Medium;
public class sortZeroOneTwo {
    public static void main(String[] args) {
        int[] arr = new int[]{1,0,2,1,2,1,0,0,2,2,0,1};
        Best_dutchNationalFlag(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
    }
    //The Brute solution is to sort the array using merge sort with TC:O(NlogN)
    public static void Better_sortZeroOneTwoSolver(int[] arr){
        int count0 = 0 , count1 = 0 , count2 = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == 0)count0++;
            else if(arr[i] == 1)count1++;
            else if(arr[i] == 2)count2++;
        }
        int idx = 0;
        for (int i = 0; i < count0; i++)arr[idx++] = 0;
        for (int i = 0; i < count1; i++)arr[idx++] = 1;
        for (int i = 0; i < count2; i++)arr[idx++] = 2;
    }

    //The Optimal solution is also called Dutch National Flag Algo:
    public static void Best_dutchNationalFlag(int[] arr){
        int low = 0;
        int mid = 0;
        int high = arr.length - 1;
        while(mid<high){
            if(arr[mid] == 0){
                swap(arr,low,mid);
                mid++;
                low++;
            }else if(arr[mid] == 1){
                mid++;
            }else if(arr[mid] == 2){
                swap(arr,high,mid);
                high--;
            }
        }
    }
    public static void swap(int[] arr,int a,int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}