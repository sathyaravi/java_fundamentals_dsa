package dsa_pattern_problems.strings;

public class ReverseString {
    public static void main(String[] args) {

        String s = "selenium";

        StringBuilder reverseString = new StringBuilder();

        for(int i=s.length()-1;i>=0;i--){

            reverseString.append(s.charAt(i));

        }

        System.out.println(reverseString.toString());

    }
}
