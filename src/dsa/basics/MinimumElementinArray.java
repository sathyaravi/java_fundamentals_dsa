package dsa.basics;

public class MinimumElementinArray {

    public static void main(String[] args) {
        int[] array = {5,10,3,15,20,1};

        int min_element = array[0];

        for(int i=1;i<array.length;i++){

            if(min_element>array[i]){

                min_element=array[i];
            }

        }

        System.out.println("Minimum element in the array:"+min_element);
    }
}
