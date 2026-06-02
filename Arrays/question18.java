package Arrays;

public class question18 {
    public static void swap_array(int[] arr){
        int i = 0;
        int j = arr.length - 1;
        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        for (int k : arr) {
            System.out.print(k+" ");
        }
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        swap_array(arr);
        
    }
}
