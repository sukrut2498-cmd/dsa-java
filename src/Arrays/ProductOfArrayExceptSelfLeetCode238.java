package Arrays;

import java.util.Arrays;

public class ProductOfArrayExceptSelfLeetCode238 {
    public static void main(String[] args) {
        int [] nums = {1,2,3,4};
        int [] ans = productExceptSelf(nums);
        for (int num:ans){
            System.out.print(num+" ");
        }
    }
    public static int[] productExceptSelf(int[] nums) {
        int [] result = new int[nums.length];
        Arrays.fill(result,1);
        int prefix = 1;
        int postfix = 1;

        for (int i=0; i< nums.length; i++){
            result[i] = prefix;
            prefix = prefix * nums[i];
        }
        for (int i= nums.length-1; i>=0; i--){
            result[i] = result[i] * postfix;
            postfix = postfix * nums[i];
        }
        return  result;
    }
}
