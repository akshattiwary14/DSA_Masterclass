package StringManipulation.Easy;

public class checkRotatedString {
    public static void main(String[] args) {
        String a = "BITNBYTE";
        String b = "BYTEBITN";
        System.out.println(checkRotatedStringSolver(a, b));
    }
    public static boolean checkRotatedStringSolver(String s,String goal) {
        if(s.length() != goal.length())return false;
        String ans = s+s;
        return (ans.contains(goal));
    }
}