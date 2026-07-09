package day3;

import java.util.HashMap;
import java.util.Map;

public class MostFrequentWord {

    public static void main(String[] args) {

        String s = "is is is is is Java Java Java object";

        int maxCount = 0;

        HashMap<String,Integer> hashMap = new HashMap<>();

        for(String word:s.split("\\s+")){

            hashMap.put(word,hashMap.getOrDefault(word,0)+1);

        }

        for(int count:hashMap.values()){

            if(count>maxCount){
                maxCount = count;
            }
        }

        for(Map.Entry<String,Integer> entry:hashMap.entrySet()){

            if(entry.getValue()==maxCount){

                System.out.println(entry.getKey());
            }

        }
    }
}
