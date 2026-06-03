package Arrays;

public class question19 {
    public static int subarray(int[] arr,int n){
        int sum = 0;
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                sum += arr[j];
                for (int k = i; k <= j; k++) {
                    // System.out.print(arr[k]+" ");
                }
                
                if (sum % n == 0) {
                    count++;
                }
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        System.out.println(subarray(arr,5));
    }
}
