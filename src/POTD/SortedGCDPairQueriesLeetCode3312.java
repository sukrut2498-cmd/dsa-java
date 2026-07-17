package POTD;

public class SortedGCDPairQueriesLeetCode3312 {
    public static void main(String[] args) {
        int [] nums = {2,3,4};
       long [] queries = {0,2,2};

       int [] ans = gcdValues(nums,queries);
       for (int num:ans){
           System.out.println(num);
       }
    }
    public static int[] gcdValues(int[] nums, long[] queries) {
        int maxVal = 0;
        for(int num:nums){
            maxVal = Math.max(maxVal,num);
        }

        //count of frequecy of each alement in i/p array
        int [] freq = new int[maxVal + 1];
        for(int num:nums){
            freq[num]++;
        }

        long [] countGcd = new long[maxVal+1];

        for(int i=maxVal; i>=1; i--){
            long totalMultiples = 0;

            for (int j = i; j <= maxVal; j += i) {
                totalMultiples += freq[j];
            }

            long totalPairs = (totalMultiples * (totalMultiples - 1)) / 2;

            // Subtract the pairs that have a strictly larger common divisor (multiples of i)
            for (int j = 2 * i; j <= maxVal; j += i) {
                totalPairs -= countGcd[j];
            }

            countGcd[i] = totalPairs;
        }
        // Build a prefix sum array of the GCD pair counts
        long[] prefixSums = new long[maxVal + 1];
        for (int i = 1; i <= maxVal; i++) {
            prefixSums[i] = prefixSums[i - 1] + countGcd[i];
        }

        int[] answer = new int[queries.length];
        for (int q = 0; q < queries.length; q++) {
            long targetIndex = queries[q];

            // Binary search to find the smallest GCD value where prefixSums[gcd] > targetIndex
            int low = 1, high = maxVal;
            int resultGcd = maxVal;

            while (low <= high) {
                int mid = low + (high - low) / 2;
                if (prefixSums[mid] > targetIndex) {
                    resultGcd = mid; // Potential answer, look left for a smaller GCD
                    high = mid - 1;
                } else {
                    low = mid + 1; // Look right
                }
            }
            answer[q] = resultGcd;
        }

        return answer;
    }
}
