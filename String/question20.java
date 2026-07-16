package String;

import java.lang.reflect.Array;
import java.util.*;

public class question20 {
    public static String[] find_words(String[] words) {
        List<String> ans = new ArrayList<>();
        String row1 = "qwertyuiop";
        String row2 = "asdfghjkl";
        String row3 = "zxcvbnm";
        for (String word : words) {
            String lower = word.toLowerCase();
            char first = lower.charAt(0);
            String row = null;
            if (row1.indexOf(first) != -1) {
                row = row1;
            }
            if (row2.indexOf(first) != -1) {
                row = row2;
            }
            if (row3.indexOf(first) != -1) {
                row = row3;
            }
            boolean valid = true;
            for (char c : lower.toCharArray()) {
                if (row.indexOf(c) == -1) {
                    valid = false;
                    break;
                }
            }
            if (valid) {
                ans.add(word);
            }
        }
        return ans.toArray(new String[0]);
    }

    public static void main(String[] args) {
        String[] arr = { "Hello", "Alaska", "Dad", "Peace" };
        String[] answer = find_words(arr);
        System.out.println(Arrays.toString(answer));
    }
}
