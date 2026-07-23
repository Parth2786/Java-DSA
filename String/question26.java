package String;

public class question26 {

    // Leetcode 796 .
    public static boolean rotate_string(String s, String t){
        if (s.length() != t.length()) {
            return false;
        }
        String doubled = s + s;
        return doubled.contains(t);
    }
    public static void main(String[] args) {
        String s = "abcde";
        String t = "cdeab";
        System.out.println(rotate_string(s, t));
    }
}
