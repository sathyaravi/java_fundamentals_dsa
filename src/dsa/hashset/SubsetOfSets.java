package dsa.hashset;

import java.util.Arrays;
import java.util.HashSet;

public class SubsetOfSets {

    public static void main(String[] args) {

        HashSet<Integer> set1 = new HashSet<>(Arrays.asList(3,4));
        HashSet<Integer> set2 = new HashSet<>(Arrays.asList(3,4,5,6));


        System.out.println(set2.containsAll(set1));

        System.out.println("Is set1 subset of set2? " + set2.containsAll(set1)); // true
        System.out.println("Is set2 subset of set1? " + set1.containsAll(set2)); // false
    }
}
