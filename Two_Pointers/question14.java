package Two_Pointers;

public class question14 {
    
    // This is the leetcode question number 11 in which we have to return the container with the most water and return the maximum water it can store.


    public static int max_water(int[] height){
        int maxwater = 0;
        int left = 0;
        int right = height.length - 1;
        while (left < right) {
            int width = right - left;
            int h = Math.min(height[left], height[right]);
            int water = width * h;
            maxwater = Math.max(maxwater, water);
            if (height[left] < height[right]) {
                left++;
            }
            else{
                right--;
            }
        }
        return maxwater;
    }
    public static void main(String[] args) {
        int[] height = {1,8,6,2,5,4,8,3,7};
        System.out.println(max_water(height));
    }


}
