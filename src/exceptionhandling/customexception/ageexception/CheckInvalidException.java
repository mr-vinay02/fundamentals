package exceptionhandling.customexception.ageexception;

import java.util.Scanner;

public class CheckInvalidException {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your age to check :");

        try{
            int age = scan.nextInt();

            if(age >= 18){
                System.out.println("you are eligible to VOTE");
            }
            else{
                throw new InvalidAgeException("Age must be 18 or above to proceed.");
            }
        }catch (InvalidAgeException e){
            System.out.println(e.getMessage());
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
