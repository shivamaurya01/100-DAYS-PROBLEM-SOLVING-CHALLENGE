// leetcode 2529 no problem where we have to find the maximum count of number 
class Solution {
    public int maximumCount(int[] nums) {
        int n = nums.length;

        // Count negative numbers
        int lo = 0, hi = n - 1;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (nums[mid] < 0) {
                lo = mid + 1;
            } else {
                hi = mid - 1;
            }
        }
        int neg = lo; // count of negatives

        // Count positive numbers
        lo = 0;
        hi = n - 1;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (nums[mid] <= 0) {
                lo = mid + 1;
            } else {
                hi = mid - 1;
            }
        }
        int pos = n - lo; // count of positives

        return Math.max(neg, pos);
    }
}