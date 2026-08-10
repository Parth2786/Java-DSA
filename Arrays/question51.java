package Arrays;

public class question51 {

    // Leetcode question number 11.
    // Optimal approach.
    public static int containerWithMostWater(int[] height){
        int left = 0;
        int right = height.length - 1;
        int max_water = 0;
        while (left < right) {
            int width = right - left;
            int h = Math.min(height[left], height[right]);
            int area = width * h;
            max_water = Math.max(max_water, area);
            if (height[left] <  height[right]) {
                left++;
            }
            else{
                right--;
            }
        }
        return max_water;
    }
    public static void main(String[] args) {
        int [] height = {1,8,6,2,5,4,8,3,7};
        System.out.println(containerWithMostWater(height));
    }
}
