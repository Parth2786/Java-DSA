package String;

public class question17 {
    public static String Merge_stringsz(String word1, String word2){
        int i = 0;
        int j = 0;
        StringBuilder ans = new StringBuilder();
        while(i < word1.length() && j < word2.length()){
            ans.append(word1.charAt(i++));
            ans.append(word2.charAt(j++));
        }
        if (i < word1.length()) {
            ans.append(word1.substring(i));
        }
        if (i < word2.length()) {
            ans.append(word2.substring(i));
        }

        return ans.toString();
    }
    public static void main(String[] args) {
        String a = "ab";
        String b = "pqrs";
        System.out.println(Merge_stringsz(a, b));
    }
}
