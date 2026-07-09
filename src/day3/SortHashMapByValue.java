package day3;

import java.util.*;

public class SortHashMapByValue {
    public static void main(String[] args) {

        HashMap<String,Integer> hashMap = new HashMap<>();

        hashMap.put("Banana",2);
        hashMap.put("Apple",5);
        hashMap.put("Cherry",3);
        hashMap.put("Orange",1);

        List<Map.Entry<String,Integer>> list = new ArrayList<>(hashMap.entrySet());
        Collections.sort(list,(e1,e2)->e1.getValue().compareTo(e2.getValue()));

        for(Map.Entry<String,Integer> entry: list){

            System.out.println(entry.getKey()+":"+entry.getValue());
        }

        Collections.sort(list,(e1,e2)->e2.getValue().compareTo(e1.getValue()));
        for(Map.Entry<String,Integer> entry: list){

            System.out.println(entry.getKey()+":"+entry.getValue());
        }
    }
}
