package day4.arrays;

public class SumofAllElements {

    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40};

        int totalSum = 0;

        for(int i=0;i<arr.length;i++){

            totalSum+=arr[i];
        }

        System.out.println(totalSum);
    }
}
