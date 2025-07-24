/* This question has two varities one return true or false other return the indexes:
 * 1.bool Function
 * 2.int[] Function
 */
package Arrays.Medium;
import java.util.*;
public class twoSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[]{1,2,3,4,5,6};
        int n = 6;
        int target = 9;
        Arrays.sort(arr);//This is used only for the best solution
        System.out.println("Sum found : "+Best_twoSumSolver(n,arr, target));
        sc.close();
    }
    public static boolean Brute_twoSumSolver(int[] arr , int target){
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int k = i+1; k < arr.length; k++) {
// if(i==k)continue; We changed the inner loop to start with i+1 instead of checking the entire array again
                sum = arr[i] + arr[k];
                if(sum == target){
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean Better_twoSumSolver(int[] arr,int target){
        HashMap<Integer,Integer> hashMap = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int rem = target - arr[i];
            if(hashMap.containsKey(rem)){
                return true;
            }else{
                hashMap.put(arr[i], i);
            }
        }
        return false;
    }

    //This is a slightly better approach than the hashMap one and is optimal for boolean type 
    public static boolean Best_twoSumSolver(int n,int[] arr,int target){
        int left = 0;
        int right = n-1;
        while(left < right){
            if(arr[left] + arr[right] == target){
                return true;
            }else if(arr[left] + arr[right] > target){
                right--;
            }else if(arr[left] + arr[right] < target){
                left++;
            }
        }       
        return false;
    }
}