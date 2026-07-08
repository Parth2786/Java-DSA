package String;

import java.util.*;

public class question2 {
    public static int count_max_words(String[] str) {
        int max = 0;
        for (int i = 0; i < str.length; i++) {
            int count = 0;
            boolean inword = false;
            for (int j = 0; j < str[i].length(); j++) {
                char c = str[i].charAt(j);
                if (c == ' ' || c == '\t' || c == '\n') {
                    inword = false;
                } else if (!inword) {
                    count++;
                    inword = true;
                }
            }
            if (count > max) {
                max = count;

            }
        }
        return max;
    }

    public static void main(String[] args) {
        String[] str = { "alice and bob love leetcode", "i think so too", "this is great thanks very much" };
        System.out.println(count_max_words(str));
    }
}
