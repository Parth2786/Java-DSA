package Functions;

import java.util.Scanner;

public class question10 {
    public static long nPr(int n, int r) {
        long fact = 1;
        long denominator = n - r;
        long fact_denominator = 1;
        if (n < r) {
            return 0;
        } else {
            for (int i = 1; i <= n; i++) {
                fact = fact * i;
            }
            for (int i = 1; i <= denominator; i++) {
                fact_denominator *= i;
            }
        }
        long result = fact / fact_denominator;
        return result;
        
    }

    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = sc.nextInt();
        System.out.println(nPr(n, r));
    }
}
