package day4.arrays;

public class EvenOddNumbers {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 6, 8};

        int evenCount = 0;

        int oddCount = 0;

        for (int j : arr) {

            if (j % 2 == 0) {

                evenCount++;
            } else {
                oddCount++;
            }
        }

        System.out.println("Even Count:"+evenCount);

        System.out.println("Odd Count:"+oddCount);
    }

}
