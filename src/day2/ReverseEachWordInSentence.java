package day2;

import java.util.LinkedHashSet;

public class ReverseEachWordInSentence {

    public static void main(String[] args) {

        String s = "Java is awesome";

        StringBuilder result = new StringBuilder();

        for(String word:s.split(" ")){

            StringBuilder rev = new StringBuilder();
            for(int i=word.length()-1;i>=0;i--){

                rev.append(word.charAt(i));
            }

            result.append(rev).append(" ");

        }

        System.out.println(result);
    }
}
