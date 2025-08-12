package StringManipulation.Easy;

import java.util.Arrays;
import java.util.HashMap;

public class anagramOrNot {
    public static void main(String[] args) {
        String a = "cat";
        String b = "act";
        System.out.println(Optimal_anagramOrNotSolver(a, b));
    }
    public static boolean Better_anagramOrNotSolver(String s,String t) {
        if(s.length() != t.length())return false;
        HashMap<Character,Integer> freqMap = new HashMap<>();
        for(char ch : s.toCharArray()){
            freqMap.put(ch,freqMap.getOrDefault(ch,0)+1);
        }
        for(char ch : t.toCharArray()){
            if(!freqMap.containsKey(ch))return false;
            freqMap.put(ch,freqMap.get(ch) - 1);
            if(freqMap.get(ch) < 0)return false;
            }
        return true;
    }
    public static boolean Optimal_anagramOrNotSolver(String s , String t) {
        if(s.length() != t.length())return false;
        char[] c = s.toCharArray();
        Arrays.sort(c);
        s = new String(c);
        char[] c1 = t.toCharArray();
        Arrays.sort(c1);
        t = new String(c1);
        return (s.equals(t));
    }
}
