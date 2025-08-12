package StringManipulation.Medium;

public class palindromicSubstr {
    public static void main(String[] args) {
        String a = "abasba";
        System.out.println(palindromicSubstrSolver(a));
    }
    public static String palindromicSubstrSolver(String s) {
        if(s.length() <= 1)return s;
        String result = "";
        for (int i = 0; i < s.length(); i++) {
            //ODD Length
            int low = i , high = i;
            while(low>=0 && high<s.length() && s.charAt(low) == s.charAt(high)){
                low--;
                high++;
            }
            String palindrome = s.substring(low+1, high);
            if(palindrome.length() > result.length()){
                result = palindrome;
            }
            //EVEN Length
            low = i-1;
            high = i;
            while(low>=0 && high<s.length() && s.charAt(low) == s.charAt(high)){
                low--;
                high++;
            }
            palindrome = s.substring(low+1, high);
            if(palindrome.length() > result.length()){
                result = palindrome;
            }
        } 
        return result;
    }
}
