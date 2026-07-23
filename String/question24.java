package String;
import java.util.*;
public class question24 {

    // Not submitted on the leetcode.
    public static boolean detect_capital(String str){
        if (str.equals(str.toUpperCase())) {
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        String str = "USA";
        System.out.println(detect_capital(str));
        
    }
}
