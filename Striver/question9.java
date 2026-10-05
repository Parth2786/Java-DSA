package Striver;

public class question9 {


    // In this question we have to merge the two sorted arrays and after the merging the resultant array should also be sorted.
    
    public static void merge(int[] nums1, int[] nums2){
        int m = nums1.length;
        int n = nums2.length;
        int i = m - 1;
        int j = n - 1;
        int k = m + n - 1;
        while (i >= 0 && j >= 0) {
            if (nums1[i] > nums2[j]) {
                nums1[k--] = nums1[i--];
            }
            else{
                nums1[k--] = nums2[j--];
            }
        }
        while (j >= 0) {
            nums1[k--] = nums2[j--];
        }

    }
    public static void main(String[] args) {
        int[] nums1 = {-5, -2, 4, 5};
        int[] nums2 = {-3, 1, 8};
        merge(nums1, nums2);
        for (int i : nums1) {
            System.out.print(i + " ");
        }
    }
}
