package day4.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class RemoveDuplicates {

    public static void main(String[] args) {


        ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(1, 2, 2, 3, 4, 4, 5));

        HashSet<Integer> hashSet = new HashSet<>(list);

        System.out.println(hashSet);

    }
}
