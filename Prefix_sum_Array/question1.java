package Prefix_sum_Array;

// Leetcode question number 1732 in this question we have to find the maximum altitude the biker can reach.

public class question1 {
    public static int maximum_altitude(int[] gain){
        int altitude = 0;
        int max = 0;
        for(int i = 0; i < gain.length; i++){
            altitude += gain[i];
            max = Math.max(max, altitude);
        }
        return max;

    }
    public static void main(String[] args) {
        int[] gain = {-5,1,5,0,-7};
        System.out.println(maximum_altitude(gain));
    }
}
