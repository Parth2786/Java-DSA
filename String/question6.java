package String;

public class question6 {
    public static boolean isValidPalindrome(String str) {
        int start = 0;
        int end = str.length() - 1;
        while (start < end) {
            if (str.charAt(start) == str.charAt(end)) {
                start++;
                end--;
            } else {
                return ispalindrome(str, start + 1, end) || ispalindrome(str, start, end - 1);
            }

        }
        return true;
    }

    public static boolean ispalindrome(String str, int start, int end) {
        while (start < end) {
            if (str.charAt(start) != str.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;

    }

    public static void main(String[] args) {
        String str = "aba";
        System.out.println(isValidPalindrome(str));
    }
}
