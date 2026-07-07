package Strings;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EncodeAndDecodeStringsLeetCode271 {
    public static void main(String[] args) {

        List<String> strList = Arrays.asList("neet","code","love","you");
        String en = encode(strList);
        System.out.println(en);
        System.out.println(decode(en));
    }
    public static String encode(List<String> strs){
        if(strs.size()==0){
            return Character.toString((char) 258);
        }
        String separate = Character.toString((char) 257);
        StringBuilder sb = new StringBuilder();
        for (String s:strs){
            sb.append(s);
            sb.append(separate);
        }
        sb.deleteCharAt(sb.length()-1);
        return sb.toString();
    }
    public static List<String> decode(String s){
       if(s.equals(Character.toString((char) 258))){
           return new ArrayList<>();
       }
       String separate = Character.toString((char) 257);
       return Arrays.asList(s.split(separate,-1));
    }
}
