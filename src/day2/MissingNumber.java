package day2;

import java.util.Arrays;

public class MissingNumber {

    public static void main(String[] args) {

        int[] num = {1,2,3,5,6};

        int n = num.length+1;

        int expected_sum = n*(n+1)/2;

        int actual_sum = Arrays.stream(num).sum();

        int missing_num = expected_sum-actual_sum;

        System.out.println("Missing number:"+missing_num);

    }
}
