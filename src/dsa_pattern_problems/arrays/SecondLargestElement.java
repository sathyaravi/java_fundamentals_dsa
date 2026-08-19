package dsa_pattern_problems.arrays;

public class SecondLargestElement {
    public static void main(String[] args) {
        int[] arr = {10, 5, 20, 8, 15, 20};
        int first_largest=Integer.MIN_VALUE;
        int second_largest=Integer.MIN_VALUE;

        for(int i=0;i<arr.length;i++){

            if(first_largest<arr[i]){

                second_largest=first_largest;
                first_largest=arr[i];
            } else if (arr[i]>second_largest && arr[i]!=first_largest ) {

                second_largest=arr[i];

            }
        }

        System.out.println(second_largest);

    }
}
