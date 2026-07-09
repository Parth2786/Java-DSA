package String;

public class question4 {
    public static boolean isPangram(String str){
        int left = 0;
        int right = str.length() - 1;
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return true;
            }
            left++;
            right--;
        }
        return false;
    }
    public static void main(String[] args) {
        String str = "thequickbrownfoxjumpsoverthelazydog";
        System.out.println(isPangram(str));
    }
}
