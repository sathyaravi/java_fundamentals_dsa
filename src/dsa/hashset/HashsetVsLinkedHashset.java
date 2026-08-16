package dsa.hashset;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class HashsetVsLinkedHashset {
    public static void main(String[] args) {

        ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(1,4,5,3,6,7,8,9));

        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(5,2,9,11,15));

        HashSet<Integer> hashSet = new HashSet<>(list1);

        hashSet.addAll(list2);



        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>(list1);

        linkedHashSet.addAll(list2);

        System.out.println(new ArrayList<>(hashSet));//insertion order not maintained

        System.out.println(new ArrayList<>(linkedHashSet));//insertion order maintained
    }
}
