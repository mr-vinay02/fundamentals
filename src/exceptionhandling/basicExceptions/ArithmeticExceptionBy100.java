package exceptionhandling.basicExceptions;

import java.util.Scanner;

public class ArithmeticExceptionBy100 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the Number to divides 100 : ");
        int number = scan.nextInt();

        try{
            double result = 100 / number;
            System.out.println("The result is : "+result );
        }
        catch (ArithmeticException e){
            e.printStackTrace();
        }
    }
}
