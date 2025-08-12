package BinarySearchTheory.bsOnAnswers;

public class kthElementOfTwoArrays {
    public static void main(String[] args) {
        int[] arr1 = new int[]{2,3,45};
        int[] arr2 = new int[]{4,6,7,8};
        int k = 4;
        System.out.println(kthElementOfTwoArraysSolver(arr1, arr2,k));
    }
    public static int kthElementOfTwoArraysSolver(int[] arr1,int[] arr2,int k) {
        int n = arr1.length;
        int m = arr2.length;
        int i = 0 , j = 0 ;
        int count = 0;
        int current = 0;
        while(count<k){
            if(i<n && (j>=m || arr1[i]<=arr2[j])){
                current = arr1[i++];
            }else {
                current = arr2[j++];
            }
            count++;
        }
        return current;
    }
}
