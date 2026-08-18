package day5.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepeatedNumber {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(4, 5, 1, 2, 1, 4, 5));

        LinkedHashMap<Integer,Integer> hashMap = new LinkedHashMap<>();

        for(int i:list){

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
