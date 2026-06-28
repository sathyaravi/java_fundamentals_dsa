import java.util.Scanner;

public class Number_Pattern {
    public static void main(){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number:");

        int number;
        do{

            number=sc.nextInt();
            if(number<=0){
                System.out.println("Invalid!,Enter a positive number to proceed");
            }
        }while(number<=0);

        for(int i=1;i<=number;i++){
            for(int j=1;j<i;j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }

}
