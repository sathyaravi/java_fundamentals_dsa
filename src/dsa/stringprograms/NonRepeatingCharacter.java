package dsa.stringprograms;

import java.util.LinkedHashMap;
import java.util.Map;

public class NonRepeatingCharacter {

    public static void main(String[] args) {

        String s = "Java is a programming language";

        LinkedHashMap<Character,Integer> map = new LinkedHashMap<>();

        for(char ch:s.toCharArray()){

            map.put(ch,map.getOrDefault(ch,0)+1);

        }

        for(Map.Entry<Character,Integer> entry: map.entrySet()){

            if(entry.getValue()==1){

                System.out.println("First non frequency char found:"+entry.getKey());
                break;
            }
        }


    }
}
