package day5.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class FirstRepeatedNumber {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(10, 5, 3, 4, 3, 5));

        HashSet<Integer> hashSet = new HashSet<>();

        for(int i:list){

            if(!(hashSet.contains(i))){

                hashSet.add(i);
            }

            else{

                System.out.println("First Repeated Number found:"+i);
                break;
            }
        }
    }
}
