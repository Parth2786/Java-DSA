package String;
import java.util.*;
public class question27 {
    public static String GoatLatin(String sentence){
        String[] words = sentence.split(" ");
        StringBuilder result = new StringBuilder();
        String vowel = "aeiouAEIOU";
        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            if (vowel.indexOf(word.charAt(0)) != -1) {
                word = word + "ma";
            }
            else{
                word = word.substring(1) + word.charAt(0) + "ma";
            }
            for (int j = 0; j <= i; j++) {
                word += "a";
            }
            result.append(word);
            if (i < words.length - 1) {
                result.append(" ");
            }
        }
        return result.toString();
    }
    public static void main(String[] args) {
        String sentence = "I speak Goat Latin";
        String ans = GoatLatin(sentence);
        System.out.println(ans);
    }
}
