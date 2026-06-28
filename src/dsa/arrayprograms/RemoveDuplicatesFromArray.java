package dsa.arrayprograms;

import java.util.ArrayList;
import java.util.LinkedHashSet;

public class RemoveDuplicatesFromArray {

    public static void main(String[] args) {

        int[] array = {1,2,4,4,5,6,6,7,8,9,9,9};

        LinkedHashSet<Integer> set = new LinkedHashSet<Integer>();

          for(int num:array){

               set.add(num);
            }


        System.out.println(new ArrayList<>(set));

    }
}
