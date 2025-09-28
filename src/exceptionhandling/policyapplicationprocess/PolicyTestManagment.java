package exceptionhandling.policyapplicationprocess;

import java.util.Scanner;

public class PolicyTestManagment {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        PolicyApplication manager = new PolicyApplication();

        System.out.println("Enter your age to chech validate :");
        try{
            int age = scan.nextInt();
            manager.validateAge(age);
        }catch(InvalidAgeException e){
            System.out.println(e.getMessage());
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

        System.out.println("Enter your Driving Records to check : (true / false)");
        try{
            boolean drivingRecords = scan.nextBoolean();
            manager.validateDriving(drivingRecords);
        }catch(PoorDrivingRecordException e){
            System.out.println(e.getMessage());
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

        System.out.println("Enter your Health Records to check : (true / false)");
        try{
            boolean healthRecords = scan.nextBoolean();
            manager.validateHealth(healthRecords);
        }catch(HealthIssueException e){
            System.out.println(e.getMessage());
        }catch (Exception e){
            System.out.println(e.getMessage());
        }


        System.out.println("Your policy will be issued By Today.....");
    }
}
