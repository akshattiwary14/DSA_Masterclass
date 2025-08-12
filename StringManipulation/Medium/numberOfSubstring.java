package StringManipulation.Medium;

public class numberOfSubstring {
    public static void main(String[] args) {
        String a = "abcabcab";
        System.out.println(numberOfSubstringSolver(a));
    }
    public static int numberOfSubstringSolver(String s) {
        int start = 0;
        int[] freq = new int[3];
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            freq[s.charAt(i)-'a']++;
            while(freq[0] > 0 && freq[1] > 0 && freq[2] > 0){
                count += s.length() - i;
                freq[s.charAt(start)-'a']--;
                start++;
            }
        }
        return count;
    }
}
