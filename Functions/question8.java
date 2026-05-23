package Functions;

import java.util.Scanner;

public class question8 {
    public static int binomial_coefficient(int n, int r){
        int fact_numerator = 1;
        int fact_dinominator_1 = 1;
        int fact_dinominator_2 = 1;
        for (int i = 1; i <= n; i++) {
            fact_numerator = fact_numerator * i;
        }
        for (int i = 1; i <= n - r ; i++) {
            fact_dinominator_1 *= i;
        }
        for (int i = 1; i <= r; i++) {
            fact_dinominator_2 *= i;
        }
        int Binomial_coefficient = fact_numerator/(fact_dinominator_1*fact_dinominator_2);
        return Binomial_coefficient;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = sc.nextInt();
        System.out.println(binomial_coefficient(n, r));
    }
}
