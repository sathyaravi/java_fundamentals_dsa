import java.util.Scanner;

public class Number_Analyzer {


    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);

        System.out.println("Enter the number to analyze");

        int analyzeNum=sc.nextInt();

        if(analyzeNum<0 && analyzeNum%2!=0){

            System.out.println("Negative and Odd");

        }
        else if(analyzeNum < 0 && analyzeNum % 2 == 0){
            System.out.println("Negative and Even");
        }

        else if(analyzeNum>0 && analyzeNum%2==0){
            System.out.println("Positive and Even number");
        }

        else if(analyzeNum>0 && analyzeNum%2!=0){

            System.out.println("Positive and Odd number");
        }
        else{
            System.out.println("Given number is zero");
        }
    }
}
