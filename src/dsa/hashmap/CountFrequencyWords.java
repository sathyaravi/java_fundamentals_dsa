package dsa.hashmap;

import java.util.HashMap;
import java.util.Map;

public class CountFrequencyWords {

    public static void main(String[] args) {

        String s = "Java Java is a a object object oriented language";

        HashMap<String,Integer> map = new HashMap<>();

        for(String word:s.split(" ")){

            map.put(word,map.getOrDefault(word,0)+1);
        }

        for(Map.Entry<String,Integer> entry:map.entrySet()){

            System.out.println(entry.getKey()+":"+entry.getValue());
        }


    }
}
