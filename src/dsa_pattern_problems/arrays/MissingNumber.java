package dsa_pattern_problems.arrays;

public class MissingNumber {

    public static void main(String[] args) {

        int[] arr={1,2,4,5,6};

        int arrlen=arr.length;

        int n=arr[arrlen-1];

        int missingNumber=0;

        //mathematical concept to find the missing number in sequence can be found using formula :n(n+1)/2 - expected sum

        //adding all numbers in the sequence gives actual sum. Expectedsum-actualsum=missingnumber

        int actualSum=0;

        int expectedSum=n*(n+1)/2;

        for(int i=0;i<arr.length;i++){
             actualSum+= arr[i];
        }

        missingNumber=expectedSum-actualSum;

        System.out.println(missingNumber);
    }
}
