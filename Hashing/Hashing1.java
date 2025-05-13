package Hashing;

// import java.util.*;
// import java.util.Map;
// import java.util.HashMap;
// import java.util.Set;
// import java.util.Map.Entry;

// public class Hashing1 {
//     public static void main(String[] args){
//         String st = "aaaaaccccccffffffggggggssssssaaafsfdds";
//         HashMap<Character, Integer> map = new HashMap<>();
//         for(int i=0; i<st.length(); i++){
//             char ch = st.charAt(i);
//             map.put(ch, map.getOrDefault(ch, 0)+1);
//         }
//         for (Entry.Map<Character, Integer> ele : map.entrySet()){
//             System.out.print(ele.getKey()+" "+ele.getValue());
//         }
//     }
// }

import java.util.HashMap;
import java.util.Map;

public class Hashing1 {
    public static void main(String[] args){
        String st = "aaaaaccccccffffffggggggssssssaaafsfdds";
        HashMap<Character, Integer> map = new HashMap<>();
        
        for(int i = 0; i < st.length(); i++){
            char ch = st.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        
        for (Map.Entry<Character, Integer> ele : map.entrySet()){
            System.out.print(ele.getKey() + " " + ele.getValue()+"  ");
        }
    }
}
