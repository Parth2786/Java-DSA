package String_Two_Pointers;
import java.util.*;
public class question2 {
    public static void reverse_string(String[] str){
        int i = 0;
        int j = str.length - 1;
        while (i < j) {
            String temp = str[i];
            str[i] = str[j];
            str[j] = temp;
            i++;
            j--;
        }

    }
    public static void main(String[] args) {
        String[] str = {"H","a","n","n","a","h"};
        reverse_string(str);
        System.out.println(Arrays.toString(str));
    }
}
