package dsa_pattern_problems.strings;

import java.util.Arrays;

public class Anagrams {

    public static void main(String[] args) {

        String s1 = "silent";
        String s2 = "listen";

    System.out.println(checkAnagrams(s1,s2));

    System.out.println(checkAnagrams("java"," "));

    System.out.println(checkAnagrams("hello","world"));
    }

    public static boolean checkAnagrams(String s1,String s2){
        if(s1.length()!=s2.length()){
            return false;
        }
        char[] ch1=s1.toCharArray();
        char[] ch2=s2.toCharArray();

        Arrays.sort(ch1);
        Arrays.sort(ch2);

        return Arrays.equals(ch1,ch2);
    }
}
