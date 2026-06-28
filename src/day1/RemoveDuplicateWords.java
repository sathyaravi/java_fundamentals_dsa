package day1;

import java.util.LinkedHashSet;

public class RemoveDuplicateWords {
    public static void main(String[] args) {

        String s = "Java Java is is a a language";

        LinkedHashSet<String> set = new LinkedHashSet<>();

        for(String word:s.split(" ")){

            set.add(word);
        }

        String result=String.join(" ",set);
        System.out.println(result);
    }
}
