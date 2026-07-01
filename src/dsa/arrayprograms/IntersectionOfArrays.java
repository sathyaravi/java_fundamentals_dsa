package dsa.arrayprograms;

import java.util.HashSet;

public class IntersectionOfArrays {

    public static void main(String[] args) {

        int[] array1 = {1,2,3,4,5,6};

        int[] array2 = {6,5,3,4,4};


        HashSet<Integer> hashSet = new HashSet<>();

        HashSet<Integer> result = new HashSet<>();

        for(int num:array1){
            hashSet.add(num);

        }


        for(int n:array2){

            if(hashSet.contains(n)){

               result.add(n);
            }
        }

        System.out.println(result);
    }
}
