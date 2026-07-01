package dsa.hashset;

import java.util.Arrays;
import java.util.HashSet;

public class UnionOfTwoSets {

    public static void main(String[] args) {

        HashSet<Integer> set1 = new HashSet<>(Arrays.asList(1,2,3,4));
        HashSet<Integer> set2 = new HashSet<>(Arrays.asList(3,4,5,6));

        HashSet<Integer> result = new HashSet<>(set1);

        result.addAll(set2);

        System.out.println(result);

    }
}
