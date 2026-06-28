package dsa.hashset;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class DuplicateElements {
    public static void main(String[] args) {

        int[] array = {1,1,1,2,3,3,4,5,6,7,7,8,8};

        HashSet<Integer> hash = new HashSet<Integer>();

        List<Integer> list = new ArrayList<>();

        for(int i:array){

            if(hash.contains(i) && !list.contains(i) ) {

                    list.add(i);
            }
            else{
                hash.add(i);
            }

        }

        System.out.println(Arrays.toString(list.toArray()));







    }
}
