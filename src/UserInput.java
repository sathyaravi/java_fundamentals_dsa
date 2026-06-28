import java.util.Scanner;

public class UserInput {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter name");

        String name= sc.nextLine();

        System.out.println("Enter your age");

        int age = sc.nextInt();

        System.out.println("Enter your salary");
        double salary=sc.nextDouble();

        System.out.println("Hello," + name +" !!");

        System.out.println("You are "+age+" "+"years old");

        System.out.println("Your salary:"+salary);


        double balance = 1000;
        double withdrawAmount = 500;
        boolean isAccountActive = true;

        if (withdrawAmount > 0 && withdrawAmount <= balance && isAccountActive) {
            balance -= withdrawAmount;
            System.out.println("Withdrawal successful");
        } else {
            System.out.println("Transaction failed");
        }

    }
}
