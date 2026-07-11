package SlidingWindow;

import java.util.HashSet;

public class LongestSubstringWithoutRepeatingCharactersLeetCode3 {
    public static void main(String[] args) {
        String  s = "abcabcbb";
        int ans = lengthOfLongestSubstring(s);
        System.out.println(ans);

    }
    public static int lengthOfLongestSubstring(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }
        if (s.length() == 1) {
            return 1;
        }
        int right = 0;
        int left = 0;
        int ans = 0;
        HashSet<Character> set = new HashSet<>();
        while (right<s.length()){
            char c = s.charAt(right);
            while (set.contains(c)){
                set.remove(s.charAt(left));
                left++;
            }
            set.add(c);
            ans = Math.max(ans,right-left+1);
            right++;
        }
        return ans;
    }

}
