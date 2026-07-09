package String;

public class question5 {
    public static String reversed(String str){
        String reverse = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reverse += str.charAt(i);
        }
        return reverse;
    }
    public static void main(String[] args) {
        String str = "hello";
        System.out.println(reversed(str));
    }
}
