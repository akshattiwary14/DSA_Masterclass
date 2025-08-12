package StringManipulation.Easy;

import java.util.HashMap;

public class isoMorphic {
    public static void main(String[] args) {
        String a = "egg";
        String b = "add";
        System.out.println(Optimal_isoMorphicSolver(a, b));
    }
    //Brute includes replacing each chararter one by one

    public static Boolean Brute_isoMorphicSolver(String s,String s1) {
        if(s.length() != s1.length())return false;
        HashMap<Character,Character> smap = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char org = s.charAt(i);
            char rep = s1.charAt(i);
            if(!smap.containsKey(org)){
                if(!smap.containsValue(rep)){
                    smap.put(org, rep);
                }else return false;
            }else{
                char mapped = smap.get(org);
                if(mapped!=rep){
                    return false;
                }
            }
        }
        return true;
    }
    public static Boolean Optimal_isoMorphicSolver(String s,String t) {
        if(s.length() != t.length())return false;
        int[] org = new int[256];
        int[] rep = new int[256];
        for (int i = 0; i < s.length(); i++) {
            char orgCh = s.charAt(i);
            char repCh = t.charAt(i);
            if(org[orgCh] != rep[repCh] && rep[repCh] != org[orgCh]){
                return false;
            }
            org[orgCh] = i + 1; 
            rep[repCh] = i + 1;
        }
        return true;
    }
}
