package day1;

import java.util.HashMap;
import java.util.Map;

public class CountOccurrenceCharacter {

    public static void main(String[] args) {

        String s = "java";

        HashMap<Character,Integer>  hash = new HashMap<>();

        for(char ch:s.toCharArray()){

            hash.put(ch,hash.getOrDefault(ch,0)+1);
        }

        for(Map.Entry<Character,Integer> entry:hash.entrySet()){

            System.out.println(entry.getKey()+":"+entry.getValue());
        }

    }
}
