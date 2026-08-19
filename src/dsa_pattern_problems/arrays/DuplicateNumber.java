package dsa_pattern_problems.arrays;

public class DuplicateNumber {

    public static void main(String[] args) {

        int[] arr={1, 3, 4, 2, 2};



        for(int i=0;i<arr.length;i++){

            for(int j=1;j<i;j++){

                if(arr[i]==arr[j]){

                    System.out.println("Duplicate found:"+arr[j]);

                    break;
                }
            }
        }

    }
}
