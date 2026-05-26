package Functions;

import java.util.Scanner;

public class question16 {
    public static String Decimal_Binary(int n){
        String result = "";
        while (n > 0) {
            int remainder = n % 2;
            result = remainder + result;
            n /= 2;
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(Decimal_Binary(n));
    }
}
