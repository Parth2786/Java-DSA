package Arrays;

import java.util.Scanner;

public class question4 {
    public static int element_at_index(int[] arr,int index){
        for (int i = 0; i < arr.length; i++) {
                return arr[index];
            
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i]= sc.nextInt();
        }
        int index = sc.nextInt();
        System.out.println(element_at_index(arr, index));

    }
}
