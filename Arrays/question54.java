package Arrays;
import java.util.*;
public class question54 {
    public static int[] find_elements(int[] arr){
        int largest = Integer.MIN_VALUE;
        int second_largest = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > largest){
                second_largest = largest;
                largest = arr[i];
            }
            else if(arr[i] > second_largest && arr[i] != largest){
                second_largest = arr[i];
            }
        }
        List<Integer> element = new ArrayList<>();
        for (int i : arr) {
            if (i != largest && i != second_largest) {
                element.add(i);
            }
        }
        int[] ans = new int[element.size()];
        for (int i = 0; i < element.size(); i++) {
            ans[i] = element.get(i);
        }
        Arrays.sort(ans);
        return ans;
    }
    public static void main(String[] args) {
        int[] arr = {2, 8, 7, 1, 5};
        int[] ans = find_elements(arr);
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] + " ");
        }
    }
}
