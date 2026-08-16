package day4.strings;

public class ReverseString {

    public static void main(String[] args) {

        String s = "selenium";

        System.out.println(reverseStr(s));

        System.out.println(reverseStr("kiwi"));

        System.out.println(reverseStr(""));

    }

    public static String reverseStr(String s){

        StringBuilder revStr = new StringBuilder();

        if(s==null||s.isEmpty()){

            return null;
        }

        char[] ch = s.toCharArray();

        for(int i=ch.length-1;i>=0;i--){

            revStr.append(ch[i]);

        }

        return revStr.toString();
    }
}
