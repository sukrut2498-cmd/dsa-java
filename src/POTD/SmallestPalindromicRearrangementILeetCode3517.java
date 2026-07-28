package POTD;

public class SmallestPalindromicRearrangementILeetCode3517 {
    public static void main(String[] args) {

        String s = "babab";
        String ans = smallestPalindrome(s);
        System.out.println(ans);

    }
    public static String smallestPalindrome(String s){
        int[] freq = new int[26];
        for (char c : s.toCharArray()) {
            freq[c - 'a']++;
        }
        StringBuilder firstHalf = new StringBuilder();
        char middleChar = 0;
        // Construct the first half and find middle character if odd count exists
        for (int i = 0; i < 26; i++) {
            if (freq[i] % 2 != 0) {
                middleChar = (char) ('a' + i);
            }
            // Add half of the occurrences to the first half
            for (int count = 0; count < freq[i] / 2; count++) {
                firstHalf.append((char) ('a' + i));
            }
        }

        // Build the complete palindrome
        StringBuilder result = new StringBuilder(firstHalf);
        if (middleChar != 0) {
            result.append(middleChar);
        }

        // Append the reversed first half
        result.append(new StringBuilder(firstHalf).reverse());

        return result.toString();
    }
}
