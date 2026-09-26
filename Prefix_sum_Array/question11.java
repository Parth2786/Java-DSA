package Prefix_sum_Array;

public class question11 {

    // Not submitted on the leetcode.


    public static int pivot_integer(int n){
        int right_sum = 0;
        for (int i = 1; i <= n; i++) {
            right_sum += i;
        }
        int leftsum = 0;
        for (int i = 1; i <= n; i++) {
            right_sum -= i;
            if (leftsum == right_sum) {
                return i;
            }
            leftsum += i;
        }
        return -1;
    }
    public static void main(String[] args) {
        int n = 1;
        System.out.println(pivot_integer(n));
    }
}
