package dsa.arrayprograms;

import java.util.Scanner;

public class EvenOddChecker {
    public void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int number;
        System.out.println("Even Odd Checker");
        System.out.println("-----------------------");

        do{

            System.out.println("Enter the number to check:");
            number = sc.nextInt();
            if(number%2==0) {
                System.out.println("The given number is even");
            }
            else{
                System.out.println("The given number is odd");
            }
        }while(number<=0);



    }
}
