package dsa.arrayprograms;

import java.util.HashMap;
import java.util.Map;

public class FrequencyOfEachElement {

    public static void main(String[] args) {

        int[] array = {1, 2, 3, 2, 1, 4, 3, 3, 5,1,1,5};

        HashMap<Integer,Integer> hash = new HashMap<>();

        for(int num : array) {
            hash.put(num, hash.getOrDefault(num, 0) + 1);
        }

        for(Map.Entry<Integer,Integer> entry:hash.entrySet()){

            System.out.println(entry.getKey()+":"+ entry.getValue());
        }

    }
}
