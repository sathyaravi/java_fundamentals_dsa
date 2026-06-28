package Exception_Examples;

import java.util.Scanner;

public class ConsoleBank_App {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double balance = 1000.00;
        System.out.println("Welcome to SecureBank");
        System.out.println("Enter your name:");
        String name=sc.nextLine();
        System.out.println("Hi, "+name);
        int op;
        do{

            System.out.println("Choose option below to continue:");
            System.out.println("1.Check Balance");
            System.out.println("2.Deposit Money");
            System.out.println("3.Withdraw Money");
            System.out.println("4.Exit");
            op=sc.nextInt();
            switch(op){
                case 1:
                    System.out.printf("Your current balance is:%.2f%n",balance);
                    break;
                case 2:
                    double deposit=sc.nextDouble();
                    if(deposit>=0) {
                        balance += deposit;
                        System.out.printf("Money deposited to your account: %.2f%n", balance);
                        break;
                    } else {
                        System.out.println("Deposit amount should be greater than 0");
                        break;
                    }
                case 3:
                    double withdraw = sc.nextDouble();
                    if(withdraw>balance){
                        System.out.println("Withdrawal exceeds the balance amount!!");
                        break;
                    }
                    else{
                        balance -=withdraw;
                        System.out.println("Withdraw successful!!!");
                        break;
                    }
                case 4:

                    System.out.println("Thank you for using the Secure Bank!!");
                    break;

                default:
                    System.out.println("Invalid number!!! Please try again!!");
                    break;

            }


        }while(op!=4);

        sc.close();
    }
}
