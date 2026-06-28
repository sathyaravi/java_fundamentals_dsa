package dsa.basics;

public class SumOfArrayElement {

    public static void main(String[] args) {

        int [] array = {1,2,30,20,50};

        int array_sum=0;

        for (int j : array) {

            array_sum += j;
        }

        System.out.println("Sum of the array element:"+array_sum);
    }
}
