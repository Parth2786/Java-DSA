package String;

public class question4 {
    public static boolean isPangram(String str) {
        boolean[] seen = new boolean[26];
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                seen[ch - 'a'] = true;
            }
        }
        for (boolean b : seen) {
            if (!b) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String str = "thequickbrownfoxjumpsoverthelazydog";
        System.out.println(isPangram(str));
    }
}
