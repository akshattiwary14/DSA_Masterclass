package BinarySearchTheory.bsOnAnswers;

public class medianOfTwoArrays {
    public static void main(String[] args) {
        int[] arr1 = new int[]{1,3,4,7,10,12};
        int[] arr2 = new int[]{2,3,6,15};
        System.out.println(Better_medianOfTwoArraysSolver(arr1, arr2));
    }
    public static double memedianOfTwoArraysSolver(int[] arr1,int[] arr2) {
        int left1 = 0;
        int left2 = 0;
        int idx = 0;
        int[] arr3 = new int[arr1.length+arr2.length];
        while(left1<arr1.length && left2<arr2.length){
            if(arr1[left1] < arr2[left2]){
                arr3[idx] = arr1[left1];
                left1++;
                idx++; 
            }else if(arr1[left1] > arr2[left2]){
                arr3[idx] = arr2[left2];
                left2++;
                idx++;
            }else{
                arr3[idx] = arr2[left2];
                left2++;
                left1++;
                idx++;
            }
        }
        while(left1 < arr1.length){
            arr3[idx] = arr1[left1];
            idx++;
            left1++;
        }
        while(left2 < arr2.length){
            arr3[idx] = arr2[left2];
            idx++;
            left2++;
        }
        if(arr3.length % 2 == 1)return arr3[arr3.length/2];
        else return ((arr3[arr3.length/2] + arr3[arr3.length/2 - 1])/2.0);
    }

    public static double Better_medianOfTwoArraysSolver(int[] arr1, int[] arr2) {
        int n = arr1.length;
        int m = arr2.length;
        int total = n + m;
        int medianIndex2 = total / 2;
        int count = 0;
        int prev = 0,current = 0;
        int i = 0,j = 0;
        while(count<=medianIndex2){
            prev = current;
            if(i<n && (j>=m || arr1[i] <= arr2[j])){
                current = arr1[i++];
            }else{
                current = arr2[j++];
            }
            count++;
        }
        if(total%2 == 0){
            return (current+prev)/2;
        }else{
            return current;
        }
    }

}
