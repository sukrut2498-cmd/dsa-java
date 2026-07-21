package POTD;

public class MaximizeActiveSectionWithTradeILeetCode3499 {
    public static void main(String[] args) {
        String s = "01";
        int ans = maxActiveSectionsAfterTrade(s);
        System.out.println(ans);

    }

        public static int maxActiveSectionsAfterTrade(String s) {
            int totalOnes = 0;
            int maxMergedZeros = 0;
            int prevZeroLen = -1;

            int n = s.length();
            int i = 0;

            while (i < n) {
                int j = i;
                while (j < n && s.charAt(j) == s.charAt(i)) {
                    j++;
                }

                int len = j - i;
                if (s.charAt(i) == '1') {
                    totalOnes += len;
                } else {
                    if (prevZeroLen != -1) {
                        maxMergedZeros = Math.max(maxMergedZeros, prevZeroLen + len);
                    }
                    prevZeroLen = len;
                }

                i = j;
            }

            return totalOnes + maxMergedZeros;
        }
    }

