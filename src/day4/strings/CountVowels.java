package day4.strings;

import java.util.HashMap;

public class CountVowels {

    public static void main(String[] args) {

        String s = "automation";

        int vowelCount=0;

        for(char ch:s.toLowerCase().toCharArray()){

            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){

                    vowelCount++;
                }
            }


        System.out.println(vowelCount);

    }
}
