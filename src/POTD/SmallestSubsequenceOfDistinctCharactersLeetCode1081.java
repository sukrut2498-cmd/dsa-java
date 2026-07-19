package POTD;

public class SmallestSubsequenceOfDistinctCharactersLeetCode1081 {
    public static void main(String[] args) {

        String s = "bcabc";
        String ans = smallestSubsequence(s);
        System.out.println(ans);
    }
    public static String smallestSubsequence(String s) {
        int [] lastIndex = new int[26];

        for (int i = 0; i < s.length(); i++) {
            lastIndex[s.charAt(i) - 'a'] = i;
        }

        boolean[] seen = new boolean[26];
        StringBuilder stack = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char curr = s.charAt(i);
            int currIdx = curr - 'a';

            if (seen[currIdx]) {
                continue;
            }

            while (stack.length() > 0 && stack.charAt(stack.length() - 1) > curr) {
                char top = stack.charAt(stack.length() - 1);
                int topIdx = top - 'a';

                if (lastIndex[topIdx] < i) {
                    break;
                }

                stack.deleteCharAt(stack.length() - 1);
                seen[topIdx] = false;
            }

            stack.append(curr);
            seen[currIdx] = true;
        }

        return stack.toString();

    }
}
