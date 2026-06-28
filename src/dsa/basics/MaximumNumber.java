package dsa.basics;

public class MaximumNumber {

    public static void main(String[] args) {

        int [] array = {10,75,15,30,43,89};

        int max_number = array[0];

        for(int i=0;i<array.length;i++){

            if(array[i]>max_number){

                max_number=array[i];
            }

        }
        System.out.println(max_number);

    }

}
