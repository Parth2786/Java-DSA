package Arrays;

import java.util.Scanner;

import conditional_Statement.if_else;

public class question31 {
    public static int dominant_index(int[] arr){
        int largest = Integer.MIN_VALUE;
        int second_largest = Integer.MIN_VALUE;
        int index = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                second_largest = largest;
                largest = arr[i];
                index = i;
            }
            else if (arr[i] > second_largest && arr[i] != largest) {
                second_largest = arr[i];
            }
        }
        if (largest >= (second_largest * 2)) {
            return index;
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt(); 
        }
        System.out.println(dominant_index(arr));
    }
}
