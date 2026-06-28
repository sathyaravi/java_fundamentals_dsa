package dsa.basics;

import java.util.Scanner;

public class Fibonacciseries {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number for which you want to generate fibonacci series:");

        int number = sc.nextInt();

        int fib1 = 0;

        int fib2 = 1;

        for(int i=0;i<number;i++){

            System.out.print(fib1+" ");

            int fib3 = fib1+fib2;
            fib1=fib2;
            fib2=fib3;

            }

        }

    }

