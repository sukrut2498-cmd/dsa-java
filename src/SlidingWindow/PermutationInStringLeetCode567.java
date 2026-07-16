package SlidingWindow;

public class PermutationInStringLeetCode567 {
    public static void main(String[] args) {
        String s1 = "ab", s2 = "eidbaooo";
        boolean isAns = checkInclusion(s1, s2);
        System.out.println(isAns); // Should output: true
    }

    public static boolean checkInclusion(String s1, String s2) {
        if (s1.length() > s2.length()) {
            return false;
        }

        int[] s1Map = new int[26];
        int[] s2Map = new int[26];

       // initialize both maps using their respective strings
        for (int i = 0; i < s1.length(); i++) {
            s1Map[s1.charAt(i) - 'a']++;
            s2Map[s2.charAt(i) - 'a']++;
        }

        // : Only slide the window up to (s2.length() - s1.length())
        for (int i = 0; i < s2.length() - s1.length(); i++) {
            if (matches(s1Map, s2Map)) {
                return true;
            }

            // Slide the window safely:
            s2Map[s2.charAt(i + s1.length()) - 'a']++; // Add new character coming into the window
            s2Map[s2.charAt(i) - 'a']--;               // Remove old character falling out of the window
        }

        // Check the very last window position
        return matches(s1Map, s2Map);
    }

    private static boolean matches(int[] s1Map, int[] s2Map) {
        for (int i = 0; i < 26; i++) {
            if (s1Map[i] != s2Map[i]) {
                return false;
            }
        }
        return true; // Fix 3: Return true if all frequencies match perfectly
    }
}