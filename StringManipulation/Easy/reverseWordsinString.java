package StringManipulation.Easy;

public class reverseWordsinString {
    public static void main(String[] args) {
        String s = "Hi My Name IS Akshat";
        System.out.println(reverseWordsinStringSolver(s));
    }
    public static String reverseWordsinStringSolver(String s) {
        StringBuilder result = new StringBuilder();
        String[] res = s.trim().split("\\s+");
        int left = 0;
        int right = res.length-1;
        while(left<=right){
            swapString(res,left,right);
            left++;
            right--;
        }
        for (int i = 0; i < res.length; i++) {
            result.append(res[i]);
            if (i != res.length - 1) {
                result.append(" ");
            }
        }
        return result.toString();
    }
    public static void swapString(String[] arr , int left , int right) {
        String temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
    }
}
