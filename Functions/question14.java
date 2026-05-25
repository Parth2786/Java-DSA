package Functions;

import java.util.Scanner;

public class question14 {
    public static boolean strong_number(int num) {
        int sum = 0;
        int original = num;
        while (num > 0) {
            int digit = num % 10;
            int fact = 1;
            for (int i = 1; i <= digit; i++) {
                fact = fact * i;
            }
            sum = sum + fact;
            num /= 10;
        }
        if (sum == original) {
            return true;
        } 
        return false;
    

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(strong_number(num));
    }
}
