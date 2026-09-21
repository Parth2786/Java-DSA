package String;

public class question31 {
    public static boolean check_record(String s){
        int count_a = 0;
        int consecutiveL = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == 'A') {
                count_a++;
                if (count_a >= 2) {
                    return false;
                }
            }
            if (ch == 'L') {
                consecutiveL++;
                if (consecutiveL >= 3) {
                    return false;
                }
            }
            else{
                consecutiveL = 0;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String s = "PPALLP";
        System.out.println(check_record(s));
    }
}
