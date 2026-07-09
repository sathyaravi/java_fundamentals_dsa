package day3;

import java.util.ArrayList;


public class MoveZeros {
    public static void main(String[] args) {

        int[] arr = {0, 1, 0, 3, 12, 0, 5};

        ArrayList<Integer> list = new ArrayList<>();

        int zeroCount = 0;

        for(int num:arr){

            if(num!=0){

                list.add(num);
            }
            else{

                zeroCount++;

            }
        }

        for(int i=0;i<zeroCount;i++){

            list.add(0);
        }


        System.out.println(list);
    }



}
