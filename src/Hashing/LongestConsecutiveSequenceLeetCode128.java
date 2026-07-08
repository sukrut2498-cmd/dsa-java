package Hashing;

import java.util.Arrays;
import java.util.HashSet;

public class LongestConsecutiveSequenceLeetCode128 {
    public static void main(String[] args) {
        int [] nums = {100,4,200,1,3,2};
        int ans = longestConsecutive(nums);
        System.out.println(ans);
    }
    public static int longestConsecutive(int[] nums) {
        HashSet<Integer> numSet = new HashSet<>();
        if(nums.length==0){
            return 0;
        }
        for (int i=0;i<nums.length; i++){
            numSet.add(nums[i]);
        }
        int longestSub = 1;
        for (int num:numSet){
            if(numSet.contains(num-1)){
                continue;
            }else {
                int currentNum = num;
                int currentSub = 1;
                while (numSet.contains(currentNum+1)){
                    currentNum++;
                    currentSub++;
                }
                longestSub = Math.max(longestSub,currentSub);
            }
        }
        return longestSub;
    }
}
