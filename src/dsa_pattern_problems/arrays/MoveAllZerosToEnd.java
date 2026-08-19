package dsa_pattern_problems.arrays;

import java.util.Arrays;

public class MoveAllZerosToEnd {
    public static void main(String[] args) {

        int[] arr={0, 1, 0, 3, 12};

        int non_zero=0;

       for(int i=0;i<arr.length;i++){

           if(arr[i]!=0){

               int temp=arr[i];
               arr[i]=arr[non_zero];
               arr[non_zero]=temp;
               non_zero++;
           }
        }

        System.out.println(Arrays.toString(arr));
    }
}
