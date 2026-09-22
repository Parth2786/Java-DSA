package Maths;

public class question4 {
    public static int sum_nth(int n, int a, int d){
        int sum = (n * (2 * a + (n - 1) * d)) / 2;
        return sum;
    }
    public static void main(String[] args) {
        int n = 5;
        int a = 1;
        int d = 3;
        System.out.println(sum_nth(n, a, d));
    }
}
