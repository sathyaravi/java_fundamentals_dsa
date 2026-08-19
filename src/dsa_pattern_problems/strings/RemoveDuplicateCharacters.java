package dsa_pattern_problems.strings;

import java.util.LinkedHashSet;

public class RemoveDuplicateCharacters {

    public static void main(String[] args) {

        String s = "programming";

        LinkedHashSet<Character> hashSet = new LinkedHashSet<>();

        for(char ch:s.toCharArray()){
            hashSet.add(ch);
        }
        StringBuilder outString = new StringBuilder();

        for(char ch:hashSet){

            outString.append(ch);
        }
        System.out.println(outString.toString());
    }
}
