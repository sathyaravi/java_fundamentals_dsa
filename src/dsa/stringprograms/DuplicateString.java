package dsa.stringprograms;

import java.util.*;



public class DuplicateString {

    public static void main(String[] args) {

        String s = "Java Java is is a a language";

        String[] words = s.split(" ");

        LinkedHashSet<String> uniqueWords = new LinkedHashSet<>(Arrays.asList(words));


        String result=String.join(" ",uniqueWords);


        System.out.println(result);
    }
}
