package day4.arrays;

public class SecondLargestElement {
    public static void main(String[] args) {

        int[] arr = {10, 5, 20, 8, 15,22};

        int firstLargest= Integer.MIN_VALUE;

        int secondLargest=Integer.MIN_VALUE;

        for(int i=0;i<arr.length;i++){

            if(firstLargest<arr[i]){

                secondLargest=firstLargest;

                firstLargest=arr[i];
            }

            else if(secondLargest<arr[i]&&arr[i]!=firstLargest){

                secondLargest=arr[i];
            }
        }
        System.out.println(secondLargest);
    }
}
