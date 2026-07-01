package dsa.hashmap;

import java.util.HashMap;
import java.util.Map;

public class MergeHashmap {

    public static void main(String[] args) {

        HashMap<String, Integer> map1 = new HashMap<>();
        map1.put("Apple", 5);
        map1.put("Banana", 2);
        map1.put("Cherry", 8);


        HashMap<String, Integer> map2 = new HashMap<>();
        map2.put("Apple", 2);
        map2.put("Orange", 3);
        map2.put("Kiwi", 4);


        HashMap<String, Integer> result = new HashMap<>(map1);

        for (Map.Entry<String,Integer> entry : map2.entrySet()){

            if(result.containsKey(entry.getKey())){

                result.put(entry.getKey(), result.getOrDefault(entry.getKey(),0) + entry.getValue() );

            }
            else{

                result.putIfAbsent(entry.getKey(), entry.getValue());
            }
        }

        for (Map.Entry<String,Integer> entry1 : result.entrySet()){

            System.out.println(entry1.getKey()+":"+entry1.getValue());

        }

    }
}
