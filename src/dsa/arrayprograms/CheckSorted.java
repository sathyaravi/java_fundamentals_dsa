package dsa.arrayprograms;

public class CheckSorted {

    public static void main(String[] args) {

        int[] array = {1,43,52,8,7,4,6};

        int[] array2 = {1,3,4,5,7,9};

        int[] array3 = {-1,-2,0,1,2,3};

        System.out.println(is_sorted(array));

        System.out.println(is_sorted(array2));

        System.out.println(is_sorted(array3));

    }


    public static boolean is_sorted(int [] array){

        for(int i=0;i<array.length-1;i++){

            if(array[i]>array[i+1]){

                return false;
            }
        }
    return true;

    }


}
