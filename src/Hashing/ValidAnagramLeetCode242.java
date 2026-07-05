package Hashing;

import java.util.HashMap;

public class ValidAnagramLeetCode242 {
    public static void main(String[] args) {
        String str1 = "bat";
        String str2 = "tab";
        boolean ans = isValidAnagram(str1,str2);
        System.out.println(ans);
    }
    public static boolean isValidAnagram(String str1, String str2){
        if(str1.length()!=str2.length()) return false;
        int[] charCount = new int [26];

        for (int i=0; i<str1.length(); i++){
            charCount[str1.charAt(i)-'a']++;
            charCount[str2.charAt(i)-'a']--;
        }
        for (int count:charCount){
            if(count!=0){
                return false;
            }
        }
        return true;
    }
}
