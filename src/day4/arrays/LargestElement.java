package day4.arrays;

public class LargestElement {
    public static void main(String[] args) {

        int[] arr = {10,5,25,8,15};

        int largestNumber = arr[0];

        for(int i=1;i<arr.length;i++){

            if(largestNumber<arr[i]){

                largestNumber=arr[i];
            }
        }

        System.out.println("Largest element:"+largestNumber);
    }
}
