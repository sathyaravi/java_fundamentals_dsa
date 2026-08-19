package dsa_pattern_problems.strings;

import java.util.HashMap;

public class AnagramsUsingHashmap {
    public static void main(String[] args) {
        String s1="hello";
        String s2="world";

        HashMap<Character,Integer> hashMap1 = new HashMap<>();

        HashMap<Character,Integer> hashMap2 = new HashMap<>();

        for(char ch1: s1.toCharArray()){
            hashMap1.put(ch1,hashMap1.getOrDefault(ch1,0)+1);
        }

        for(char ch2: s2.toCharArray()){
            hashMap2.put(ch2,hashMap2.getOrDefault(ch2,0)+1);
        }

        System.out.println(hashMap1.equals(hashMap2));
    }
}
