package dsa.hashmap;

import java.util.*;

public class GroupStringsByFirstLetter {

    public static void main(String[] args) {


        String[] words = {"apple", "banana", "avocado", "blueberry",
                "cherry", "apricot", "coconut", "mango", "melon"};

        HashMap<Character, List<String>> hashMap = new HashMap<>();



        for (String s : words) {

            char ch = s.charAt(0);

            hashMap.putIfAbsent(ch, new ArrayList<>());

            hashMap.get(ch).add(s);

        }

        for (Map.Entry<Character, List<String>> entry : hashMap.entrySet()) {

            System.out.println(entry.getKey()+":"+entry.getValue());

        }



    }

}