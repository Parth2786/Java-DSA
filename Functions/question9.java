package Functions;

import java.util.Scanner;

public class question9 {
    public static int count_digits(int n){
        int count = 0;
        int i = 0;
        while (n > 0) {
            n /= 10;
            count++;
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(count_digits(n));
    }
}
