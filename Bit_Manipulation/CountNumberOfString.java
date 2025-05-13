package Bit_Manipulation;

import java.util.HashSet;
import java.util.Set;

public class CountNumberOfString {
     public static int countConsistentStrings(String allowed, String[] words) {
        int count=0;
        Set<Character> set = new HashSet<>();
        for(char ch:allowed.toCharArray()){
            set.add(ch);
        }
        for(String word: words){
            boolean isConsistent =true;
            for(char chr: word.toCharArray()){
                if(!set.contains(chr)){
                    isConsistent = false;
                    break;
                }   
            }
             if(isConsistent){
                count++;
             }
        }
        return count;
    }
    public static int countConsistentString(String allowed, String[] words){
        int count=0;
        int allowedMask =0; 
        for(char ch : allowed.toCharArray()){
            allowedMask|=(1<<(ch-'a'));
        }
        for(String word: words){
            boolean isConsistent = true;
            for(char ch : word.toCharArray()){
                if((allowedMask & (1 << (ch-'a')))==0){
                    isConsistent = false;
                }
            }
            if(isConsistent){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args){
        String allowed = "abde";
        String[] words = {"adbe", "aaaabde","adsssd","dfgh","aaaabbbbedddeee"};
        System.err.println(countConsistentStrings(allowed, words));
    }
}
