package dsa.arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class SortArrayListAscendingDescending {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,12,32,4,51,6,7));

        //Sort the array in ascending

        Collections.sort(list);

        System.out.println("Ascending Order:"+list.toString());


        Collections.reverse(list);

        System.out.println("Descending Order:"+list.toString());


    }
}
