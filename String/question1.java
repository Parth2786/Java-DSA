package String;
import java.util.*;
public class question1 {
    public static int count_word(String str){

        // Count word in string.
        int count = 0;
        boolean inword = false;
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c == '\t' || c == '\n' || c == ' ') {
                inword = false;
            }
            else if (!inword) {
                count++;
                inword = true;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        String str = "cat dog meow";
        System.out.println(count_word(str));
    }
}
