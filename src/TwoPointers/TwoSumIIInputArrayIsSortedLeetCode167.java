package TwoPointers;

import java.util.HashMap;
import java.util.HashSet;

public class TwoSumIIInputArrayIsSortedLeetCode167 {
    public static void main(String[] args) {
       int [] numbers = {2,3,4};
        int target = 6;
        int [] ans = twoSum(numbers,target);
        for (int num:ans){
            System.out.println(num);
        }
    }

//Optimal Approach
    public static int[] twoSum(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length-1;
        while (left<right){
            if(numbers[left]+numbers[right]>target){
                right = right - 1;
            }
            else if(numbers[left]+numbers[right]<target){
                left = left +1;
            }
            else {
                return new int[]{left+1,right+1};
            }
        }
        return null;
    }




    //this is semioptimal approach dont use this
//    public static int[] twoSum(int[] numbers, int target) {
//        HashMap<Integer,Integer> map = new HashMap<>();
//        for(int i=0; i<numbers.length; i++){
//            int compl = target - numbers[i];
//            if(map.containsKey(compl)){
//                return new int[]{map.get(compl),i+1};
//            }
//            map.put(numbers[i], i+1);
//        }
//        return new int[]{-1,-1};
//    }

}
