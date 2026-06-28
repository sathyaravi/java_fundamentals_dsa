package dsa.stringprograms;

public class LengthOfString {

    public static void main(String[] args) {

        String s1 = "Java Programming";

        int strLength=0;


        for(char ch:s1.toCharArray()){

                strLength++;

        }

        System.out.println("Length of the string without length function:"+strLength);


    }
}
