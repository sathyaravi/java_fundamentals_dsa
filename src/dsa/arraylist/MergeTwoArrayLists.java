package dsa.arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class MergeTwoArrayLists {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(1,4,5,6,7,8,9));

        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(5,9,11,15));

        LinkedHashSet<Integer> hashSet = new LinkedHashSet<>(list1);

        hashSet.addAll(list2);

        System.out.println(new ArrayList<>(hashSet));


    }
}
