package Arrays;

public class question50 {

    // Leetcode question number 11 container with the most water.
    // Brute force approach
    public static int containerWithMostWater(int[] height){
        int max_water = 0;
        for (int i = 0; i < height.length; i++) {
            for (int j = i + 1; j < height.length; j++) {
                int width = j - i;
                int h = Math.min(height[i], height[j]);
                int area = width * h;
                max_water = Math.max(max_water, area);
            }
        }
        return max_water;
    }
    public static void main(String[] args) {
        int[] height = {1,8,6,2,5,4,8,3,7};
        System.out.println(containerWithMostWater(height));
    }
}
