package dsa.hashmap;

import java.util.HashMap;

public class AnagramCheckerUsingHashmap {

    public static void main(String[] args) {

        System.out.println(isAnagram("good","god"));
        System.out.println(isAnagram("Java","java"));
        System.out.println(isAnagram("programming"," "));

    }
    public static boolean isAnagram(String s1, String s2){
        if(s1.length()!=s2.length()){
            return false;
        }
        HashMap<Character,Integer> hashMap1 = new HashMap<>();

        for(char ch:s1.toLowerCase().toCharArray()){

            hashMap1.put(ch,hashMap1.getOrDefault(ch,0)+1);

        }

        for(char ch1:s2.toLowerCase().toCharArray()){

            if(hashMap1.containsKey(ch1)){

                hashMap1.put(ch1,hashMap1.getOrDefault(ch1,0)-1);

            }

        }

        for (int i:hashMap1.values()){


            if(i!=0){

               return false;

            }

        }
        return  true;
    }
}
