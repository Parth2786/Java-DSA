package Arrays;

import java.util.Scanner;

public class question7 {
    public static void Arrayoperation(int[] arr,int n){
        int sum = 0;
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if (max < arr[i]) {
                max = arr[i];
            }

        }
        int average = sum / arr.length;
        System.out.print(sum+" ");
        System.out.print(max+" ");
        System.out.print(average);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of the array : ");
        int n = sc.nextInt();
        int [] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i]= sc.nextInt();
        }
        Arrayoperation(arr,n);
    }
}
