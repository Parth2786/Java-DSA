package Arrays;

import java.util.Scanner;

public class question3 {
    public static boolean is_present(int[] arr,int target){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return true;
            }
        }
        return false;
    }
    public static int linear_search(int[] arr,int target){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return 0;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the target element you want to search : ");
        int target = sc.nextInt();
        System.out.println(linear_search(arr, target));
        System.out.println(is_present(arr, target));

    }
}
