package Functions;

import java.util.Scanner;

public class question2 {
    public static int add(int a, int b, int c){
        int sum = a+ b + c;
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.println(add(a, b, c));
    }
}
