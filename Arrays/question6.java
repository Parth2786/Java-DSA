package Arrays;

import java.util.*;

public class question6 {
    public static int[] odd_even_count(int[] arr){
        int odd = 0;
        int even = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] % 2 == 0){
                even++;
            }
            else{
                odd++;
            }
        }
        return new int[] {even,odd};

    } 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(odd_even_count(arr)));
        
    }
}
