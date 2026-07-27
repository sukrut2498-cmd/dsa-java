package POTD;

import java.util.Arrays;

public class MaximumProductOfTwoElementsInAnArrayLeetCode1464 {
    public static void main(String[] args) {
        int [] nums = {3,7};
        int ans = maxProduct(nums);
        System.out.println(ans);
    }
    public static int maxProduct(int[] nums) {
        int ans = 1;
        int n = nums.length-1;
        Arrays.sort(nums);
        for (int i= nums.length-1; i>=0; i--) {
            ans = (nums[n-1]-1) * (nums[n]-1);
        }
        return ans;
        //Below is the Optimal solution
//        int max1 = 0;
//        int max2 = 0;
//
//        for (int num : nums) {
//            if (num > max1) {
//                max2 = max1;
//                max1 = num;
//            } else if (num > max2) {
//                max2 = num;
//            }
//        }
//
//        return (max1 - 1) * (max2 - 1);
    }
}
