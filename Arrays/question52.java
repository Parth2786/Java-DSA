package Arrays;

public class question52 {
    public static int findFloor(int[] arr, int x) {
        int n = arr.length;
        int max = Integer.MIN_VALUE;
        int index = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] <= x && arr[i] >= max) {
                max = arr[i];
                index = i;
            }
        }
        return index;

    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 8, 10, 10, 12, 19};
        System.out.println(findFloor(arr, 11));
    }
}
