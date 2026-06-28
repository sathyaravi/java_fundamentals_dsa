import java.util.Scanner;

public class Temperature_Converter {

    /*Fahrenheit to Celsius formula :
    C = (F-32)*5/9;
    Celsius to Fahrenheit formula:
    F = (C*9/5)+32;
     */

    static double fahrenheitToCelsius(double fah){

        return (fah-32)*5/9;

    }

    static double CelsiusTofahrenheit(double cel){

        return (cel*9/5)+32;

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the temperature in celsius or fahrenheit:");

        String tempType = sc.nextLine();

        if (tempType.equalsIgnoreCase("celsius")){

            System.out.println("Enter Celsius to get fahrenheit");
            double cel = sc.nextDouble();
            System.out.printf("Fahrenheit will be: %.2f%n",CelsiusTofahrenheit(cel));
        }
        else if(tempType.equalsIgnoreCase("fahrenheit")){

            System.out.println("Enter fahrenheit to get celsius");
            double fah = sc.nextDouble();
            System.out.printf("celsius will be: %.2f%n",fahrenheitToCelsius(fah));
        }



    }
}
