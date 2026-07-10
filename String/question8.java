package String;
import java.util.*;
public class question8 {

    //Leetcode 1108.
    public static String defangIP(String sb){
        StringBuilder ip = new StringBuilder(sb);
        for (int i = 0; i < ip.length(); i++) {
            if (sb.charAt(i) == '.') {
                ip.replace(i, i+1, "[.]");
                i += 2;
            }
        }
        return ip.toString();
    }
    public static void main(String[] args) {
        String ip = "255.100.50.0";
        String str = defangIP(ip);
        System.out.println(str);
    }
}
