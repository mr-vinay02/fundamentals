package exceptionhandling.basicExceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputMismatchByUser {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the two Number to get a quotient: ");

        try{
            int number1 = scan.nextInt();
            int number2 = scan.nextInt();

            double result = number1 / number2;
            System.out.println("The result is : "+result );
        } catch (InputMismatchException e) {
            System.out.println("Invalid input! Please enter integers only.");
        }
        catch (ArithmeticException e){
            e.printStackTrace();
        }
    }
}
