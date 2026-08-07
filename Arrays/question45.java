package Arrays;
public class question45 {
    public static int trap(int [] height){

        // leetcode question number 42 Prefixx array approach

        int n = height.length;
        int[] lmax = new int[n];
        int[] rmax = new int[n];
        lmax[0] = height[0];
        for (int i = 1; i < n; i++) {
            lmax[i] = Math.max(height[i], lmax[i - 1]);
        }
        rmax[n - 1] = height[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            rmax[i] = Math.max(height[i], rmax[i + 1]);
        }
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += Math.min(lmax[i], rmax[i]) - height[i];
        }
        return sum;

    }
    public static void main(String[] args) {
        int[] height = {0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println(trap(height));
    }
}
