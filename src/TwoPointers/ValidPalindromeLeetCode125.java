package TwoPointers;

public class ValidPalindromeLeetCode125 {
    public static void main(String[] args) {
        //first normal case
        String str = "madam";
        boolean ans1 = isPalindrome(str);
        System.out.println(ans1);

        //Leetcode input
        String str2 = "A man, a plan, a canal: Panama";
        boolean ans2 = isPalindrome(str2);
        System.out.println(ans2);
    }
    public static boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length()-1;
        while (left<right){
            while (left<right && !Character.isLetterOrDigit(s.charAt(left))){
                left++;
            }
            while (left<right && !Character.isLetterOrDigit(s.charAt(right))){
                right--;
            }
            if(Character.toLowerCase(s.charAt(left))!=Character.toLowerCase(s.charAt(right))){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
