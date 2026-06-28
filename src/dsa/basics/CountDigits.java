package dsa.basics;

import java.util.Scanner;

public class CountDigits {

     public static void main(String[] args) {

         Scanner sc = new Scanner(System.in);

         System.out.println("Enter the number to count the digit:");

         int number = sc.nextInt();

         int count = 0;

         do{


             number /= 10;
             count ++;

         }while (number!=0);


         System.out.println("Number of digit in the given number:"+count);
     }
}
