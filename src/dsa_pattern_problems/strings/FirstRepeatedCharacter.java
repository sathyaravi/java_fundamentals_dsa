package dsa_pattern_problems.strings;

import java.util.HashSet;

public class FirstRepeatedCharacter {

    public static void main(String[] args) {

        String s = "programming";

        HashSet<Character> hashSet = new HashSet<>();

        for(char ch:s.toCharArray()){
            if(!hashSet.contains(ch)){

                hashSet.add(ch);
            }

            else{

                System.out.println("First Repeated Character found:"+ch);
                break;
            }
        }
    }
}
