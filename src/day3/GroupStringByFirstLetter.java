package day3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupStringByFirstLetter {

    public static void main(String[] args) {

        String[] s = {"apple","banana","avocado","blueberry","cherry"};

        HashMap<Character,List<String>> hashMap = new HashMap<>();

        for(String word:s){

            char ch = word.charAt(0);

           hashMap.putIfAbsent(ch,new ArrayList<>());

           hashMap.get(ch).add(word);

        }

        for(Map.Entry<Character,List<String>> entry:hashMap.entrySet()){

            System.out.println(entry.getKey()+":"+entry.getValue());
        }
    }
}
