package Functions;

import java.util.Scanner;

public class question8 {
    public static int binomial_coefficient(int n, int r) {
        int result = 1;
        for (int i = 1; i <= r; i++) {
            result = result * (n - i + 1) / i;
        }
        return result;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = sc.nextInt();
        System.out.println(binomial_coefficient(n, r));
    }
}
