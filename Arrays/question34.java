package Arrays;

public class question34 {
    public static boolean valid_palindrome(String str){
        int left = 0;
        int right = str.length() - 1;
        while (left < right) {
            while (left < right && !Character.isLetterOrDigit(str.charAt(left))) {
                left++;
            }
            while (left < right && !Character.isLetterOrDigit(str.charAt(right))) {
                right--;
            }
            if (Character.toLowerCase(str.charAt(right)) != Character.toLowerCase(str.charAt(left))) {
                return false;
            }
            right--;
            left++;
        }
        return true;
    }
    public static void main(String[] args) {
        String str = "A man, a plan, a canal: Panama";
        System.out.println(valid_palindrome(str));
    }
}
