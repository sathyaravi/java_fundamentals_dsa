package dsa.stringprograms;

public class PalindromeString {

    public static void main(String[] args) {


       System.out.println(isPalindrome("madam"));

        System.out.println(isPalindrome("java"));



    }

    private static boolean isPalindrome(String s1) {

        char [] ch = s1.toCharArray();

        StringBuilder rev_string = new StringBuilder();

        for(int i=ch.length-1;i>=0;i--){

            rev_string.append(ch[i]);
        }
        return s1.equalsIgnoreCase(rev_string.toString());
    }
}
