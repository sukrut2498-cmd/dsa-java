package POTD;

public class FindGreatestCommonDivisorOfArrayLeetCode1979 {
    public static void main(String[] args) {
       int [] nums = {7,5,6,8,3};
        int ans = findGCD(nums);
        System.out.println(ans);
    }
    public static int findGCD(int[] nums) {
        int max = nums[0];
        int min = nums[0];
        for (int i=0; i<nums.length; i++){
            max = Math.max(max,nums[i]);
            min = Math.min(min,nums[i]);

        }
        return gcdNum(min,max);
    }
    public static int gcdNum(int a, int b){
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
