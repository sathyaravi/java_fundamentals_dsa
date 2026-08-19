package dsa_pattern_problems.strings;

import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepeatingCharacter {
    public static void main(String[] args) {
        String s = "swiss";

        LinkedHashMap<Character,Integer> hashMap = new LinkedHashMap<>();

        for (char ch:s.toCharArray()){
            hashMap.put(ch,hashMap.getOrDefault(ch,0)+1);
        }

        for(Map.Entry<Character,Integer> entry:hashMap.entrySet()){

            if(entry.getValue()==1){
                System.out.println(entry.getKey());
                break;
            }
        }
    }
}
