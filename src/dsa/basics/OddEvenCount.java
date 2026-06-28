package dsa.basics;

public class OddEvenCount {

    public static void main(String[] args) {

        int[] array = {1,3,4,24,35,6,8,12,3,5,9,0,-2};

        int odd_count = 0;

        int even_count = 0;

        for (int j : array) {

            if (Math.abs(j) % 2 == 0) {

                even_count++;
            } else {

                odd_count++;

            }
        }

        System.out.println("Even number count:"+even_count);

        System.out.println("Odd number count:"+odd_count);

    }
}
