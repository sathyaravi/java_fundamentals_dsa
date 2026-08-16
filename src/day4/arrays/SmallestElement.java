package day4.arrays;

public class SmallestElement {
    public static void main(String[] args) {

        int[] arr = {10,5,25,8,3,15};

        int smallestNumber = arr[0];

        for(int i=0;i<arr.length;i++){

            if(arr[i]<smallestNumber){

                smallestNumber=arr[i];
            }
        }

        System.out.println("Smallest Element:"+smallestNumber);
    }
}
