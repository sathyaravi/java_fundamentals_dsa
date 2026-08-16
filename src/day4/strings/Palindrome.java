package day4.strings;

public class Palindrome {

    public static void main(String[] args) {

        String s = "madam";

        System.out.println(palindromeStr(s));

        System.out.println(palindromeStr("hello"));

        System.out.println(palindromeStr("computer"));


    }

    public static boolean palindromeStr(String s){

        if(s.isEmpty()){
            return false;
        }

        char[] ch = s.toCharArray();

        int left=0;

        int right = ch.length-1;

        while(left<right){

            if(ch[left]==ch[right]){

                left++;

                right--;
            }

            else{

                return false;
            }
        }

        return true;

    }
}
