package String;
import java.math.BigInteger;
import java.util.*;
public class question30 {
    public static int divisible_By_Digits(String s){
        BigInteger num = new BigInteger(s);
        int count = 0;
        for (char ch  : s.toCharArray()) {
            int d = ch - '0';
            if (num.mod(BigInteger.valueOf(d)).equals(BigInteger.ZERO)) {
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        String s = "1122324";
        System.out.println(divisible_By_Digits(s));
    }
}
