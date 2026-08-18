package day5.collections;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class FirstNumberOccurence {

    public static void main(String[] args) {

        List<Integer> numbers =
                Arrays.asList(4, 7, 2, 7, 4, 9, 2, 5);

        LinkedHashMap<Integer,Integer> hashMap = new LinkedHashMap<>();

        for(int i:numbers){
            hashMap.put(i,hashMap.getOrDefault(i,0)+1);

        }
        for(Map.Entry<Integer,Integer> entry:hashMap.entrySet()){

            if(entry.getValue()==1){

                System.out.println(entry.getKey());
                break;
            }

        }
    }
}
