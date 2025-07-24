public class Digits {
    //Best And most optimal way to extract digits.........
    public static void main(String[] args) {
        long n = 778900000;
        long digits = (long)Math.log10(n);
        System.out.println(digits+1);
    }
}
