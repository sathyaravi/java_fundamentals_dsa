import java.util.Scanner;

public class Multiplication_Table_Generator {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Multiplication Table Generator");

        System.out.println("Enter the number you want to print the multiplication table");

        int num ;

        do{
            System.out.println("Please enter positive number to generate the multiplication table");
            num=sc.nextInt();
            if (num <= 0) {
                System.out.println("Invalid input! Please enter a positive number.");
            }

        }while (num<=0);
        for (int i = 1; i <= 10; i++) {

            System.out.println(i + "*" + num + "=" + i * num);
        }

            System.out.println();
        }
    }

