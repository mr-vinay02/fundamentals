package scenariobasedproblems;

import java.util.Scanner;

public class PatternLockAttemptTracker {

    static void inputer(String pattern)
    {
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter your pattern...");
            String inputPattern = scan.nextLine();
            if(inputPattern.equals(pattern)) {
                System.out.println("your have entered the correct pattern...");
                break;
            } else if (i == 4) {
                System.out.println("System has been locked!!!");

            } else{
                System.out.println("You have entered incorrect pattern...");
            }
        }
    }

    public static void main(String[] args) {
        String pattern = "1234";
        inputer(pattern);
    }
}
