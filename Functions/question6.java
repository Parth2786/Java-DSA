package Functions;

public class question6 {
    public static boolean isvowel(char ch){
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args) {
        char ch = 'a';
        System.out.println(isvowel(ch));
    }
}
