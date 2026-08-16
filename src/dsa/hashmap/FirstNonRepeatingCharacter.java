package dsa.hashmap;

import dsa.stringprograms.NonRepeatingCharacter;

import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepeatingCharacter {

    public static void main(String[] args) {

        String s1 = "swiss";

        System.out.println(firstNonRepeatingCharacter(s1));

        System.out.println(firstNonRepeatingCharacter("automation"));

        System.out.println(firstNonRepeatingCharacter("aabbcc"));

        System.out.println(firstNonRepeatingCharacter(""));


    }

    public static String firstNonRepeatingCharacter(String s){

        if (s == null || s.isEmpty()) {
            return null;
        }
        char[] ch = s.toCharArray();

        LinkedHashMap<Character,Integer> map = new LinkedHashMap<>();

        for(char c:ch){

            map.put(c,map.getOrDefault(c,0)+1);
        }

        for(Map.Entry<Character,Integer> entry: map.entrySet()){

            if(entry.getValue()==1){

                return String.valueOf(entry.getKey());

            }


        }

        return null;
    }
}
