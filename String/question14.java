package String;
public class question14 {
    public static boolean isAlike(String str){
        int mid = str.length()/2;
        String a = str.substring(0,mid);
        String b = str.substring(mid);
        int a_vowel = count_vowel(a);
        int b_vowel = count_vowel(b);
        if (a_vowel == b_vowel) {
            return true;
        }
        return false;
        
    }
    public static int count_vowel(String s){
        int count = 0;
        for (char c : s.toLowerCase().toCharArray()) {
            if ("aeiou".indexOf(c) != -1) {
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        String str = "textbook";
        System.out.println(isAlike(str));
    }
}
