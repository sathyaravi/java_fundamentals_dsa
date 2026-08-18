package day5.collections;

import java.util.HashSet;
import java.util.Set;

public class TwoNumbers {
    public static void main(String[] args) {

        int[] arr = {2, 7, 11, 15};
        int target = 9;

        Set<Integer> seen = new HashSet<>();

        for(int i:arr){

            int complement = target-i;

            if(seen.contains(complement)){

                System.out.println(complement+"+"+i);
                break;
            }
            seen.add(i);


        }
    }
}
