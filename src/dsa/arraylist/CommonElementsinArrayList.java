package dsa.arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

public class CommonElementsinArrayList {

    public static void main(String[] args) {

        ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(1,4,45,5,2,3,8,71));

        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(1,8,16,5,3,10,12,6));

        ArrayList<Integer>  commonList = new ArrayList<>();

        for(int i=0;i<list1.size();i++){

            for(int j=0;j<list2.size();j++){

                if(Objects.equals(list1.get(i), list2.get(j))){

                    commonList.add(list1.get(i));

                }

            }
        }

        System.out.println(commonList.toString());


    }
}
