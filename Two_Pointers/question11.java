package Two_Pointers;

public class question11 {

    // This is the question number 392 on leetcode in which we have to check whether the string s is the subsequence of the string t or not.
    public static boolean isSubsequence(String s, String t){
        int i = 0;
        int j = 0;
        while (i < s.length() && j < t.length()) {
            if (s.charAt(i) == t.charAt(j)) {
                i++;
            }
            j++;
        }
        return i == s.length();
    }


    public static void main(String[] args) {
        String s = "abc";
        String t = "ahbgdc";
        System.out.println(isSubsequence(s, t));
    }
}
