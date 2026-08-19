package dsa_pattern_problems.strings;

import java.util.HashMap;

public class CharacterFrequency {

    public static void main(String[] args) {

        String s = "programming";

        HashMap<Character,Integer> hashMap = new HashMap<>();

        for(char ch:s.toCharArray()){

            hashMap.put(ch,hashMap.getOrDefault(ch,0)+1);
        }

        System.out.println(hashMap);
    }
}

