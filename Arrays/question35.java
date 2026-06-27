package Arrays;

public class question35 {
    public static boolean issubset(int[] arr, int[] brr){
        for (int j = 0; j < brr.length; j++) {
            boolean found = false;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == brr[j]) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int[] arr = {11, 7, 1, 13, 21, 3, 7, 3};
        int[] brr = {11, 3, 7, 1, 7};
        System.out.println(issubset(arr,brr));
    }
}
