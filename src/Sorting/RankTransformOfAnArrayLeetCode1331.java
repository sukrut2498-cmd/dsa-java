package Sorting;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;

public class RankTransformOfAnArrayLeetCode1331 {
    public static void main(String[] args) {
        int [] arr = {40,10,30,20};
        int [] asn = arrayRankTransform(arr);
        for (int num:asn){
            System.out.println(num);
        }
    }

    public static int[] arrayRankTransform(int[] arr) {
        if (arr.length == 0) {
            return arr;
        }
        int[] sorted = arr.clone();

        Arrays.sort(sorted);

        HashMap<Integer, Integer> map = new HashMap<>();
        int rank = 1;

        for (int num : sorted) {
            if (!map.containsKey(num)) {
                map.put(num, rank);
                rank++;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            arr[i] = map.get(arr[i]);
        }
        return arr;
    }
}