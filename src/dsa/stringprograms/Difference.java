package dsa.stringprograms;

import java.util.HashMap;
import java.util.Map;


public class Difference {
    public static void main(String[] args) {

        String s ="a";

        String t = "aab";

      HashMap<Character,Integer> map1 = new HashMap<>();

      HashMap<Character,Integer> map2 = new HashMap<>();
        for(char c:s.toCharArray()){

            map1.put(c, map1.getOrDefault(c,0)+1);
        }

        for(char ch:t.toCharArray()){

           map2.put(ch,map2.getOrDefault(ch,0)+1);
        }

        for(Map.Entry<Character,Integer> m2 : map2.entrySet() ){

            if ((int)map2.get(m2.getKey()) != (int)map1.getOrDefault(m2.getKey(), 0)){

                    System.out.println(m2.getKey());
            }


        }


            }
        }


