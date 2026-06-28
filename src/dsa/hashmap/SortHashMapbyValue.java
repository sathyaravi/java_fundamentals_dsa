package dsa.hashmap;

import java.util.*;

public class SortHashMapbyValue {

    public static void main(String[] args) {

        HashMap<String, Integer> map = new HashMap<>();
        map.put("Apple", 5);
        map.put("Banana", 2);
        map.put("Cherry", 8);
        map.put("Date", 3);

        List<Map.Entry<String,Integer>> list = new ArrayList<>(map.entrySet());

        Collections.sort(list,(e1,e2)->e1.getValue().compareTo(e2.getValue()));

        System.out.println("Ascending Order");

        for(Map.Entry<String ,Integer> entry:list){

            System.out.println(entry.getKey()+":"+entry.getValue());
        }

        Collections.sort(list,(e1,e2)->e2.getValue().compareTo(e1.getValue()));

        System.out.println("Descending Order");

        for(Map.Entry<String ,Integer> entry:list){

            System.out.println(entry.getKey()+":"+entry.getValue());
        }

    }
}
