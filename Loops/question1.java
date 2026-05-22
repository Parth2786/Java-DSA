package Loops;

import java.util.Scanner;

public class question1 {
    public static void main(String[] args) {
        // find the factorial of the given number.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        System.out.println(fact);
    }
}
