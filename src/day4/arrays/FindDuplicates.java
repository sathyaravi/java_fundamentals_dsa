package day4.arrays;

import java.util.*;

public class FindDuplicates {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(1, 2, 2, 3, 3, 4, 4, 5));

        HashSet<Integer> hash = new HashSet<Integer>();

        List<Integer> duplicateList = new ArrayList<>();

        for(int i:list){

            if(!(hash.contains(i))) {

                hash.add(i);
            }

            else{

                duplicateList.add(i);
            }


        }

        System.out.println(duplicateList);



    }
}
