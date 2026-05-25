package Functions;

public class question12 {
    public static int func(int start, int end){
        int sum = 0;
        for (int i = start; i <= end; i++) {
            if (i % 2 == 0) {
                sum += i;
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        int start = 1;
        int end = 10;
        System.out.println(func(start, end));
    }
}
