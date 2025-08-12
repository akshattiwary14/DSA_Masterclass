package StringManipulation.Easy;

public class largestOddNumber {
    public static void main(String[] args) {
        String num = "1253673274";
        System.out.println(largestOddNumberSolver(num));
    }
    public static String largestOddNumberSolver(String s) {
        for (int i = s.length()-1; i >= 0; i--) {
            char ch = s.charAt(i);
            if((ch-'0')%2 != 0 ){
                return s.substring(0, i+1);
            }
        }
        return "";
    }
}
