package String;

public class question9 {
    public static boolean buddyString(String a, String b){
        StringBuilder sb = new StringBuilder();
        for (int i = a.length() - 1; i >= 0; i--) {
            char ch = a.charAt(i);
            sb.append(ch);
        }
        String ans = sb.toString();
        return ans.equals(b);
    }
    public static void main(String[] args) {
        String a = "ab";
        String b = "ba";
        System.out.println(buddyString(a, b));

    }
}
