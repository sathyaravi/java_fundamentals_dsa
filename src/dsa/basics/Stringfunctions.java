package dsa.basics;

public class Stringfunctions {

    public static void main(String[] args) {

        String s = "aba";

        int str_len = s.length();

        String subString = s.substring(0,str_len/2);

        System.out.println(subString);
    }
}
