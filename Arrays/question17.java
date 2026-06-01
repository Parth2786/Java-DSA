package Arrays;

public class question17 {
    public static boolean palindrome(int num){
        int original = num;
        int result = 0;
        while (num > 0) {
            int rem = num % 10;
            result = result * 10 + rem;
            num /= 10;
        }
        if (original == result) {
            return true;
        }
        else{

            return false;
        }
    }
    public static void main(String[] args) {
        int num = 128;
        System.out.println(palindrome(num));
    }
}
