package Arrays;

import java.util.Scanner;

public class question8 {
    public static void Consecutivepair(int [] arr,int k){
        int count = 0;
        
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] + arr[i + 1] == k) {
                count++;
            }
        }
        System.out.println(count);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        Consecutivepair(arr,k);
    }
}
