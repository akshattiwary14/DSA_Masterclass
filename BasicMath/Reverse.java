public class Reverse {
    public static void main(String[] args) {
        int n = 7789;
        int n1=0;
        while(n>0){
            int rem = n%10;
            n1 = (n1*10) + rem;
            n = n/10;
        }
        System.out.println(n1);
    }
}
