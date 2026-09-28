package Striver;

// Given an integer array nums of size n, return the majority element of the array.

// The majority element of an array is an element that appears more than n/2 times in the array. The array is guaranteed to have a majority element.

// we will solve this question by using the boyer moore algorithm which is the effective algorithm for finding the majority element.


// Intuition for solving this question.

// Each number in the array is like a candidate.
// Every time you see the same candidate again, you add a vote.
// Every time you see a different candidate, you subtract a vote.
// When your vote count drops to zero, you pick a new candidate.




public class question1 {
    public static int majority_element(int[] nums){
        int count = 0;
        int candidate = 0;
        for (int num : nums) {
            if (count == 0) {
                candidate = num;
            }
            if (num == candidate) {
                count++;
            }
            else{
                count--;
            }
        }
        return candidate;
    }
    public static void main(String[] args) {
        int[] nums = {7, 0, 0, 1, 7, 7, 2, 7, 7};
        System.out.println(majority_element(nums));
    }
}
