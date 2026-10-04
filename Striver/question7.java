package Striver;

import HackerRank.reverse_array;

public class question7 {

    // This is the question number 31 on leetcode in which we have to return the lexicographically next permutation of the given array.

    // First we have to find the pivot element on arr[i] < arr[i + 1].
    // Find the rightmost element greater than the pivot element.
    // Then swap the rightmost element with the pivot element.
    // The third step will be to reverse the array element from the pivot + 1 to n - 1.


    public static void next_permutation(int[] nums){
        int pivot = -1; //the value of pivot will always be -1 in case if the array order is decreasing array.
        int n = nums.length;
        for (int i = n - 2; i >= 0; i--) {
            if (nums[i] < nums[i + 1]) {
                pivot = i;
                break;
            }
        }
        if (pivot == -1) {
            reverse_array(nums,0, n - 1);
            return;
        }
        for (int i = n - 1; i > pivot; i--) {
            if (nums[i] > nums[pivot]) {
                swap(nums,i,pivot);
                break;
            }
        }

        reverse_array(nums, pivot + 1, n - 1);
    }
    public static void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    public static void reverse_array(int[] nums, int start, int end){
        int n = nums.length;
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }


    public static void main(String[] args) {
        int[] nums = {1,2,3};
        next_permutation(nums);
        for (int i : nums) {
            System.out.print(i + " ");
        }
    }
}
