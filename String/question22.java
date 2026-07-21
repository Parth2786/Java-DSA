package String;

public class question22 {
    public static char findChar(String s, String t){
        int result = 0;
        for (char ch : (s + t).toCharArray()) {
            result ^= ch;
        }
        return (char)result;
    }
    public static void main(String[] args) {
        String s = "abcd";
        String t = "abcdy";
        System.out.println(findChar(s, t));
    }
}
