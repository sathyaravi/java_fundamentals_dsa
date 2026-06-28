package dsa.hashmap;

import java.util.LinkedHashMap;
import java.util.Map;

public class MostFrequentWord  {

    public static void main(String[] args) {
        String s = "is is Java Java Java object";

        int max_count=0;

        LinkedHashMap<String,Integer> map = new LinkedHashMap<>();

        for(String word:s.split("\\s+")){

            map.put(word,map.getOrDefault(word,0)+1);

        }

        for(int count:map.values()){
            if(count>max_count){

                max_count=count;
            }

        }



        for(Map.Entry<String,Integer> entry: map.entrySet()){
            if(entry.getValue()==max_count){

                System.out.println(entry.getKey());
                break;

            }

        }
    }
}
