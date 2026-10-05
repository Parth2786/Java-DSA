package Striver;

public class question10 {

    // This is the leetcode problem number 42 in which we have to calculate the total unit of water storing in the elevation of the ground.
    public static int trapping_rainwater(int[] height){
        int n = height.length;
        int sum = 0;
        int left = 0;
        int right = n - 1;
        int lmax = 0;
        int rmax = 0;
        while (left < right) {
            lmax = Math.max(lmax, height[left]);
            rmax = Math.max(rmax, height[right]);
            if (lmax < rmax) {
                sum += lmax - height[left];
                left++;
            }
            else{
                sum += rmax - height[right];
                right--;
            }
        }
        return sum;
    }


    public static void main(String[] args) {
        int[] height = {7, 4, 0, 9};
        System.out.println(trapping_rainwater(height));
    }
}
