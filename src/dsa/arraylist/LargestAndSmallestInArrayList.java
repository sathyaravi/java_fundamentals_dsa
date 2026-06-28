package dsa.arraylist;

import java.util.ArrayList;


public class LargestAndSmallestInArrayList {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        int min = Integer.MAX_VALUE;

        int max  = Integer.MIN_VALUE;

        int [] array = {23,4,1,0,6,15,3,25};

        for(int num:array){

            list.add(num);
        }

        for (Integer integer : list) {

            if (integer > max) {

                max = integer;


            } else if (min > integer) {

                min = integer;
            }

        }

        System.out.println(min+","+max);

    }
}
