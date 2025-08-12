package BinarySearchTheory.bsOnAnswers;

public class nthRoot {
    public static void main(String[] args) {
        int m = 1000;
        int n = 3;
        System.out.println(Optimal_nthRootSolver(n, m));
    }
    // public static int nthRootSolver(int n,int m) {
    //     for (int i = 0; i < m; i++) {
    //         if(rooter(i,n) == m){
    //             return i;
    //         }else if(rooter(i,n) > m)break;
    //     }
    //     return -1;
    // }
    public static int rooter(int base, int power, int m) {
    long product = 1;
    for (int i = 0; i < power; i++) {
        product *= base;
        if (product > m) return 2; 
    }
    if (product == m) return 1;    
    return 0;                      
}

    public static int Optimal_nthRootSolver(int n, int m) {
    int left = 1;
    int right = m;
    while (left <= right) {
        int mid = left + (right - left) / 2;
        int result = rooter(mid, n, m);
        if (result == 1) return mid;
        else if (result == 2) right = mid - 1;
        else left = mid + 1;
    }
    return -1;
    }
}
