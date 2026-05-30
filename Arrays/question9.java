package Arrays;

import java.util.*;

public class question9 {
    public static void SecondLargest(int[] arr, int n) {
        int largest = arr[0];
        int second_largest = -1;
        for(int i = 1; i < arr.length; i++){
            if(arr[i] > largest){
                second_largest = largest;
                largest = arr[i];
            }
            else if(arr[i] > second_largest && largest != arr[i]){
                second_largest = arr[i];
            }
        }
        System.out.println(second_largest);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n= sc.nextInt();
        int[] arr= new int[n];

        for(int i=0;i<n;i++)
            arr[i]=sc.nextInt();
            
        SecondLargest(arr,n);
        sc.close();
        
    }
}
