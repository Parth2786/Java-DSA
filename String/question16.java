package String;

import java.util.*;

public class question16 {
    public static String createMapping(String str){
        int n = str.length();
        char[] arr = new char[256];
        char start = 'a';
        for(int i = 0; i < n; i++){
            char ch = str.charAt(i);
            if(arr[ch] == 0){
                arr[ch] = start;
                start++;
            }
        }
        StringBuilder ans = new StringBuilder();
        for(int i = 0; i < n; i++){
            ans.append(arr[str.charAt(i)]);
        }
        return ans.toString();
    }


    public static List<String> findAndReplace_Pattern(String[] words, String pattern) {
        int n = words.length;
        List<String> result = new ArrayList<>();
        for(int i = 0; i < n; i++){
            String str1 = createMapping(words[i]);
            String str2 = createMapping(pattern);
            if(str1.equals(str2)){
                result.add(words[i]);
            }
        }
        return result;
    } 
    public static void main(String[] args) {
        String[] words = {"abc","deq","mee","aqq","dkd","ccc"};
        String pattern = "abb";
        List<String> answer = findAndReplace_Pattern(words,pattern);
        System.out.println(answer.toString());
    }
}
