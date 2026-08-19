package dsa_pattern_problems.arrays;

import java.util.HashSet;
import java.util.Set;

public class DuplicateNumberUsingCollection {

    public static void main(String[] args) {

        int[] arr ={1, 3, 4, 2, 2};

        Set<Integer> set= new HashSet<>();

        for(int num:arr){

            if(!set.contains(num)){

                set.add(num);
            }

            else{

                System.out.println("Duplicate number found:"+num);
            }
        }
    }
}
