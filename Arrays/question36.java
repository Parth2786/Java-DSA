package Arrays;
import java.util.*;
public class question36 {
    public static int numofString(String[] patterns,String word){
        int count = 0;
        for (int i = 0; i < patterns.length; i++) {
            String currentWord = patterns[i];
            if (word.contains(currentWord)) {
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        String[] patterns = {"a","abc","bc","d"};
        String word = "abc";
        System.out.println(numofString(patterns, word));
    }
}
