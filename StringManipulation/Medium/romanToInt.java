package StringManipulation.Medium;

public class romanToInt {
    public static void main(String[] args) {
        String i = "IV";
        System.out.println(Optimal_romanToIntSolver(i));
    }
    public static int Brute_romanToIntSolver(String s) {
        int ans = 0;
        for(int i = 0 ; i  < s.length(); i++){
            char c = s.charAt(i);
            if(c == 'I')ans+=1;
            else if(c == 'V'){
                ans+=5;
                if(i>0 && s.charAt(i-1) == 'I')ans-=2;
            }
            else if(c == 'X'){
                ans+=10;
                if(i>0 && s.charAt(i-1) == 'I')ans-=2;
            }
            else if(c == 'L'){
                ans+=50;
                if(i>0 && s.charAt(i-1) == 'X')ans-=20;
            }
            else if(c == 'C'){
                ans+=100;
                if(i>0 && s.charAt(i-1) == 'X')ans-=20;
            }
            else if(c == 'D'){
                ans+=500;
                if(i>0 && s.charAt(i-1) == 'C')ans-=200;
            }
            else if(c == 'M'){
                ans+=1000;
                if(i>0 && s.charAt(i-1) == 'C')ans-=200;
            }
        }
        return ans;
    }

    public static int Optimal_romanToIntSolver(String s){
        int ans = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            switch(c){
                case 'I':
                    ans+=1;
                    break;
                case 'V':
                    ans+=5;
                    if(i>0 && s.charAt(i-1) == 'I')ans-=2;
                    break;
                case 'X':
                    ans+=10;
                    if(i>0 && s.charAt(i-1) == 'I')ans-=2;
                    break;
                case 'L':
                    ans+=50;
                    if(i>0 && s.charAt(i-1) == 'X')ans-=20;
                    break;
                case 'C':
                    ans+=100;
                    if(i>0 && s.charAt(i-1) == 'X')ans-=20;
                    break;
                case 'D':
                    ans+=500;
                    if(i>0 && s.charAt(i-1) == 'C')ans-=200;
                    break;
                case 'M':
                    ans+=1000;
                    if(i>0 && s.charAt(i-1) == 'C')ans-=200;
                    break;
            }
        }
        return ans;
    }
}
