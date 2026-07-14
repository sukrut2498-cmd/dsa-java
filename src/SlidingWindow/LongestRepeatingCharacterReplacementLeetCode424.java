package SlidingWindow;

public class LongestRepeatingCharacterReplacementLeetCode424 {
    public static void main(String[] args) {
       String s = "ABAB";
      int k = 2;
      int ans = characterReplacement(s,k);
        System.out.println(ans);

    }
    public static int characterReplacement(String s, int k) {
        int [] occurance = new int[26];
        int left =0;
        int right =0;
        int ans =0;
        int maxOccurance =0;
        for (right =0; right<s.length(); right++){
            maxOccurance = Math.max(maxOccurance,++occurance[s.charAt(right)-'A']);
            if(right - left +1 - maxOccurance >k){
                occurance[s.charAt(left)-'A']--;
                left++;
            }
            ans = Math.max(ans,right-left+1);
        }
        return ans;
    }
}
