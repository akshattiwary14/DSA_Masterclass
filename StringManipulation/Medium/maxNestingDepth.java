package StringManipulation.Medium;

public class maxNestingDepth {
    public static void main(String[] args) {
        String s = "(1+(2*3)+((8)/4))+1";
        System.out.println(maxNestingDepthSolver(s));
    }
    public static int maxNestingDepthSolver(String s) {
        int count = 0;
        int counter = 0;
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == '(')count++;
            else if(s.charAt(i) == ')')count--;
            counter = Math.max(count,counter);
        }
        return counter;
    }
}
