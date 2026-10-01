package Two_Pointers;
import java.util.*;
public class question3 {
    public static String reverse_vowel(String str){
        String vowels = "aeiouAEIOU";
        char[] arr = str.toCharArray();
        int left = 0;
        int right = arr.length - 1;
        while (left < right) {
            while (left < right && vowels.indexOf(arr[left]) == -1) {
                left++;
            }
            while (left < right && vowels.indexOf(arr[right]) == -1) {
                right--;
            }
            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
        return new String(arr);
    }
    public static void main(String[] args) {
        String str = "IceCreAm";
        System.out.println(reverse_vowel(str));
    }
}
