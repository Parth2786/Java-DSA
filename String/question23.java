package String;

public class question23 {
    public static int count_segments(String s){
        int n = s.length();
        int count = 0;
        boolean inword = false;
        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);
            if (Character.isWhitespace(ch)) {
                inword = false;
            }
            else{
                if (!inword) {
                    count++;
                    inword = true;
                }
            }
        }
        return count;
    }
    public static void main(String[] args) {
        String s = "Hello, My name is Parth";
        System.out.println(count_segments(s));
    }
}
