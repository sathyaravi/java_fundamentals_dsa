package day3;

import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepeatingCharacter {
    public static void main(String[] args) {

        String s = "Java Programming";

        LinkedHashMap<Character,Integer> hashMap = new LinkedHashMap<>();

        for(char ch:s.toLowerCase().toCharArray()){

            hashMap.put(ch,hashMap.getOrDefault(ch,0)+1);
        }


        for(Map.Entry<Character,Integer> entry:hashMap.entrySet()){

            if(entry.getValue()==1){

                System.out.println(entry.getKey());
                break;
            }
        }
    }
}
