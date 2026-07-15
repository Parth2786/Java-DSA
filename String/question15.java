package String;

public class question15 {
    public static String createMapping(String str){
        int n = str.length();
        char[] arr = new char[256];
        char start = 'a';
        for (int i = 0; i < n; i++) {
            char ch = str.charAt(i);
            if (arr[ch] == 0) {
                arr[ch] = start;
                start++;
            }
        }
        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < n; i++) {
            ans.append(arr[str.charAt(i)]);
        }
        return ans.toString();
    }
    public static boolean is_isomorphic(String s , String t){
        String str1 = createMapping(s);
        String str2 = createMapping(t);
        if (str1.equals(str2)) {
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        String s = "egg";
        String t = "add";
        System.out.println(is_isomorphic(s,t));

    }
}
