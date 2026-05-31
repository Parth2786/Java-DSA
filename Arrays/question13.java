package Arrays;

import java.util.*;

public class question13 {
    public static int[] rotate_array(int[] nums, int k){
        int n = nums.length;
        int d = (k % n);
        int[] rotated = new int[n];
        for(int i = 0; i < nums.length; i++){
            rotated[i] = nums[(i - d + n) % n]; 
        }
        for(int i = 0; i < n; i++){
            nums[i] = rotated[i];
        }
        return nums;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int [] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        int [] ans = rotate_array(arr, k);
        System.out.println(Arrays.toString(ans));
        
    }
}
