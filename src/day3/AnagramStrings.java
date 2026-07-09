package day3;

import java.util.HashMap;

public class AnagramStrings {

    public static void main(String[] args) {
        String s1 = "hello";
        String s2 = "ehll";

        HashMap<Character,Integer> map1 = new HashMap<>();

        HashMap<Character,Integer> map2 = new HashMap<>();

        for(char ch:s1.toLowerCase().toCharArray()){

            map1.put(ch,map1.getOrDefault(ch,0)+1);
        }


        for(char ch:s2.toLowerCase().toCharArray()){

            map2.put(ch,map2.getOrDefault(ch,0)+1);
        }


        System.out.println(map1.equals(map2));
    }
}
