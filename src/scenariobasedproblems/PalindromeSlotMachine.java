package scenariobasedproblems;

public class PalindromeSlotMachine {

    public static boolean isPalindrome(int num) {
        int original = num;
        int reversed = 0;

        while (num > 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }

        return original == reversed;
    }

    public static boolean isSumDivisibleBy3(int num) {
        int sum = 0;
        int temp = num;

        while (temp > 0) {
            sum += temp % 10;
            temp /= 10;
        }

        return sum % 3 == 0;
    }

    public static void main(String[] args) {

        int number = 363;

        if(isPalindrome(number) && isSumDivisibleBy3(number))
            System.out.println("Jackpot!");
        else
            System.out.println("no jackpot...");
    }
}
