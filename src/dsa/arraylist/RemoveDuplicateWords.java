package dsa.arraylist;

import java.util.Arrays;
import java.util.LinkedHashSet;

public class RemoveDuplicateWords {

    public static void main(String[] args) {

        String s = "Java Java is a a object object oriented language";


        LinkedHashSet<String> set = new LinkedHashSet<>(Arrays.asList(s.split(" ")));

        String newString = String.join(" ",set);

        System.out.println(newString);

    }
}
