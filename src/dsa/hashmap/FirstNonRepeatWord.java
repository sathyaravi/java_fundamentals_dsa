package dsa.hashmap;

import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepeatWord {
    public static void main(String[] args) {

        String s = "Java Java is a a object object oriented language";

        LinkedHashMap<String,Integer> hash = new LinkedHashMap<>();

        for(String word:s.split(" ")){

            hash.put(word,hash.getOrDefault(word,0)+1);
        }

        for(Map.Entry<String,Integer> entry:hash.entrySet()){

            if(entry.getValue()==1){

                System.out.println("first non repeating word found:"+entry.getKey()+":"+entry.getValue());
                break;
            }
        }

    }
}
