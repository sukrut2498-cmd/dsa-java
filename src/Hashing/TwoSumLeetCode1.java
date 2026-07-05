package Hashing;

import java.util.HashMap;

public class TwoSumLeetCode1 {
    public static void main(String[] args) {
        int [] arr = {2,7,11,15};
        int target = 9;
        int [] ans = twoSum(arr,target);
        for (int num: ans){
            System.out.print(num+" ");
        }

    }
    public static int [] twoSum(int [] arr, int target){
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i=0; i<arr.length; i++){
            int compl = target - arr[i];
            if(map.containsKey(compl)){
                return new int[]{map.get(compl),i};
            }
            map.put(arr[i],i);
        }
        return new int[]{};
    }
}
