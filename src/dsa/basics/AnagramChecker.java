package dsa.basics;

import java.util.Arrays;

public class AnagramChecker {

    public static void main(String[] args) {
        String s1="Java";
        String s2="aavj";

        System.out.println(anagramChecker(s1,s2));
        System.out.println(anagramChecker("Selenium","sele"));
        System.out.println(anagramChecker("Java"," "));
    }

    private static boolean anagramChecker(String s1, String s2) {

        if(s1.length()!=s2.length()){

            return false;
        }

        char[] ch1=s1.toLowerCase().toCharArray();
        char[] ch2=s2.toLowerCase().toCharArray();


        Arrays.sort(ch1);
        Arrays.sort(ch2);
        return (Arrays.equals(ch1, ch2));
    }
}
