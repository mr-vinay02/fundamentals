package exceptionhandling.customexception.negativenumber;

import exceptionhandling.customexception.ageexception.InvalidAgeException;

import java.util.Scanner;

public class CheckNegativeNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your Number to check +ve OR -ve :");

        try{
            int number = scan.nextInt();

            if(number > 0){
                System.out.println("Nuber is a Positive Number");
            }
            else{
                throw new NegativeNumberException("Number is negative,Please enter the positive number....");
            }
        }catch (NegativeNumberException e){
            System.out.println(e.getMessage());
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
