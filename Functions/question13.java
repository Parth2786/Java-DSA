package Functions;

public class question13 {
    public static boolean second_last_even(int num) {
        num /= 10;
        int second_last = num % 10;
        if (second_last % 2 == 0) {
            return true;
        }
        return false;

    }

    public static void main(String[] args) {
        int num = 132;
        System.out.println(second_last_even(num));
    }
}
