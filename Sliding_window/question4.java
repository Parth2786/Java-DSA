package Sliding_window;

public class question4 {

    // This is the leetcode question number 1052 in which we have to find the maximum number of customers that aree satisfied.

    public static int max_satisfied(int[] customers, int[] grumpy, int minutes){
        int n = customers.length;
        int baseline = 0; //For calculating the sum where the owner is not grumpy.
        int extra = 0; //for calculating the customers that can be satisfied by the owners technique.
        int maxextra = 0; 
        for (int i = 0; i < n; i++) {
            if (grumpy[i] == 0) {
                baseline += customers[i];
            }
        }
        for (int i = 0; i < n; i++) {
            if (grumpy[i] == 1) {
                extra += customers[i];
            }
            if (i >= minutes && grumpy[i - minutes] == 1) {
                extra -= customers[i - minutes];
            }
            maxextra = Math.max(maxextra, extra);
        }
        return baseline + maxextra;
    }


    public static void main(String[] args) {
        int[] customers = {1,0,1,2,1,1,7,5};
        int[] grumpy = {0,1,0,1,0,1,0,1};
        int minutes = 3;
        System.out.println(max_satisfied(customers, grumpy, minutes));
    }
}
