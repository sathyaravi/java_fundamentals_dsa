package dsa.stringprograms;

import java.util.LinkedHashMap;
import java.util.Map;

public class CountFrequencyChars {

    public static void main(String[] args) {
        String s = "Java Is a programming language";

        LinkedHashMap<Character,Integer> map = new LinkedHashMap<>();

        for(char c:s.toLowerCase().toCharArray()){

            if(c!=' ') {
                map.put(c,map.getOrDefault(c,0)+1);
            }
        }

        for(Map.Entry<Character,Integer> entry:map.entrySet()){

            System.out.println(entry.getKey()+":"+entry.getValue());

        }
    }
}
