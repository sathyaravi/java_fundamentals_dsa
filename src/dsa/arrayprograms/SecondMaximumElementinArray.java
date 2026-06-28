package dsa.arrayprograms;

public class SecondMaximumElementinArray {

    public static void main(String[] args) {

        int[] array = {3,5,1};

        int first_max= Integer.MIN_VALUE;

        int second_max=Integer.MIN_VALUE;

        for(int i=0;i<array.length;i++){

            if (array[i]>first_max){

                second_max = first_max;

                first_max = array[i];

            }

            else if(array[i]> second_max && array[i] != first_max){

                second_max = array[i];

            }

        }
    System.out.println("Second maximum element in array:"+second_max);
    }
}
