package day3;

public class SecondLargestElement {

    public static void main(String[] args) {

        int[] arr = {10, 5, 20, 8, 11};

        int max = Integer.MIN_VALUE;

        int second_max = 0;

        for(int i=0;i<arr.length;i++){

            if(arr[i]>max){

                second_max = max;

                max = arr[i];
            }

            if(arr[i]>second_max && arr[i]!=max){

                second_max =arr[i];
            }

        }

        System.out.println(max);
        System.out.println(second_max);
    }
}
