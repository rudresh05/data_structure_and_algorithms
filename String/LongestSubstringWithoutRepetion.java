package String;

import java.util.*;

public class LongestSubstringWithoutRepetion {
    public static int longestSubstring(String str){
        int max =0;
        int end=0; 
        int start =0; 
        List<Character> list = new ArrayList<>();
        while(end<str.length()){
            if(!list.contains(str.charAt(end))){
                list.add(str.charAt(end));
                end++;
                max = Math.max(max, list.size());
            }
            else{
                list.remove(Character.valueOf(str.charAt(start)));
                start++;
            }
        }
        return max;
    }
    public static void main(String[] args){
        String str = "pwwkwwew";
        System.out.print(longestSubstring(str));
       
    }
}
