package StringManipulation.Easy;

import java.util.Stack;

public class reverseOutParaenthesis {
    public static void main(String[] args) {
        String s = "(())(()())";
        System.out.println(reverseOutParaenthesisSolver(s));
    }
    public static String Stack_reverseOutParaenthesisSolver(String s) {
        Stack<Character> ansStack = new Stack<>();
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == '('){
                if(!ansStack.isEmpty()){
                    result.append(s.charAt(i));
                }
                ansStack.push(s.charAt(i));
            }else if(s.charAt(i) == ')'){
                ansStack.pop();
                if(!ansStack.isEmpty()){
                    result.append(s.charAt(i));
                }
            }
        }
        return result.toString();
    }

    public static String reverseOutParaenthesisSolver(String s) {
        StringBuilder ans = new StringBuilder();
        int counter  = 0;
        for(char ch : s.toCharArray()){
            if(ch == '('){
                if(counter != 0)ans.append(ch);
                counter++;
            }else if(ch == ')'){
                counter--;
                if(counter != 0)ans.append(ch);
            }
        }
        return ans.toString();
    }
}
