package day3;

import java.util.HashMap;
import java.util.Map;

public class FrequencyOfWord {

    public static void main(String[] args) {

        String s = "Java is a language Java is popular";

        HashMap<String,Integer> hashMap = new HashMap<>();

        for(String word:s.split("\\s+")){

            hashMap.put(word,hashMap.getOrDefault(word,0)+1);

        }

        for(Map.Entry<String,Integer> entry:hashMap.entrySet()){

            System.out.println(entry.getKey()+":"+entry.getValue());
        }
    }
}
