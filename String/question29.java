package String;

public class question29 {


    // Leetcode 1047 optimal approach
    public static String remove_adjacent_duplicate(String str){
        StringBuilder sb = new StringBuilder();
        for (char ch : str.toCharArray()) {
            if (sb.length() > 0 && sb.charAt(sb.length() - 1) == ch) {
                sb.deleteCharAt(sb.length() - 1);
            }
            else{
                sb.append(ch);
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        String str = "abbaca";
        System.out.println(remove_adjacent_duplicate(str));
    }
}
