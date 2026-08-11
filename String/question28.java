package String;
import java.util.*;
public class question28 {
    // Leetcode question number 1047
    public static String remove_adjacent_duplicate(String str){
        List<Character> result = new ArrayList<>();
        result.add(str.charAt(0));
        char prev = str.charAt(0);
        for (int i = 1; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (!result.isEmpty() && result.get(result.size() - 1) == ch) {
                result.remove(result.size() - 1);
            }
            else{
                result.add(ch);
            }
        }
        StringBuilder string = new StringBuilder();
        for (char ch : result) {
            string.append(ch);
        }
        return string.toString();
    }
    public static void main(String[] args) {
        String str = "abbaca";
        System.out.println(remove_adjacent_duplicate(str));
    }
}
