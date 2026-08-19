package dsa_pattern_problems.arrays;

public class LargestAndSmallest {
    public static void main(String[] args) {
        int[] arr = {10, 5, 25, 8, 3};

        int largest = Integer.MIN_VALUE;

        int smallest = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {

            if (largest < arr[i]) {
                largest = arr[i];
            } else if (arr[i]<largest && smallest !=largest) {
                smallest = arr[i];
            }
        }

        System.out.println(largest);
        System.out.println(smallest);

    }
}