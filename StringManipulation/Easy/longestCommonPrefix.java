package StringManipulation.Easy;

import java.util.Arrays;

public class longestCommonPrefix {
    public static void main(String[] args) {
        String[] arr =new String[]{"cluster","clue","clutch","club"};
        System.out.println(longestCommonPrefixSolver(arr));
    }
    //Brute includes iterating all the strings and checking each character by character
    public static String longestCommonPrefixSolver(String[] s) {
        Arrays.sort(s);
        String first = s[0];
        String last = s[s.length-1];
        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < first.length(); i++) {
            char ch = first.charAt(i);
            char ch1 = last.charAt(i);
            if(ch == ch1){
                ans.append(ch);
            }else{
                break;
            }
        }
        return ans.toString();
    }
}
