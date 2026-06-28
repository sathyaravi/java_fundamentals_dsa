package dsa.stringprograms;

public class ReverseString {

    public static void main(String[] args) {

        String s = "Selenium";

        StringBuilder rev_string = new StringBuilder();

        char[] ch = s.toCharArray();

        for(int i=ch.length-1;i>=0;i--){


                rev_string.append(ch[i]);

        }
        System.out.println(rev_string);
    }
}
