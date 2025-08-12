package StringManipulation.Medium;

public class sumOfBeautyOfSubstring {
    public static void main(String[] args) {
        String a = "aabcb";
        System.out.println(sumOfBeautyOfSubstringSolver(a));
    }
    public static int sumOfBeautyOfSubstringSolver(String s) {
        int totalBeauty = 0;
        for (int end = 0; end < s.length(); end++) {
            int[] freq = new int[26];
            for (int i = end; i < s.length(); i++) {
                freq[s.charAt(i) - 'a']++;
                int minFreq = Integer.MAX_VALUE;
                int maxFreq = Integer.MIN_VALUE;
                for(int f : freq){
                    if(f > 0){
                        minFreq = Math.min(f,minFreq);
                        maxFreq = Math.max(f,maxFreq);
                    }
                }
                totalBeauty += (maxFreq-minFreq);
            }
        }
        return totalBeauty;
    }
}
