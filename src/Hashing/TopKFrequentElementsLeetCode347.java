package Hashing;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;

public class TopKFrequentElementsLeetCode347 {
    public static void main(String[] args) {
        int [] nums = {1,1,1,2,2,3};
        int k = 2;
        int [] ans = topKFrequent(nums,k);
        for (int num:ans){
            System.out.println(num);
        }
    }
    public static int [] topKFrequent(int [] nums, int k){
        if(k== nums.length){
            return nums;
        }
        Map<Integer,Integer> map = new HashMap<>();
        for (int n:nums){
            map.put(n,map.getOrDefault(n,0)+1);
        }
        Queue<Integer> heap = new PriorityQueue<>(
                (a,b)->map.get(a)-map.get(b)
        );
        for (int n:map.keySet()){
            heap.add(n);
            if(heap.size()>k){
                heap.poll();
            }
        }
        int [] ans = new int[k];
        for(int i=0; i<k; i++){
            ans[i] = heap.poll();
        }
        return ans;
    }

}
