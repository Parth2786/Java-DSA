package Arrays;
import java.util.*;
public class question34 {
    public static int ValueAfterOperation(String[] str){
        int x = 0;
        for (int i= 0; i < str.length; i++) {
            if (str[i].contains("++")) {
                x++;
            }
            else if (str[i].contains("--")) {
                x--;
            }
        }
        return x;
    }
    public static void main(String[] args) {
        String[] str = {"++X","++X","X++"};
        System.out.println(ValueAfterOperation(str));
    }
}
