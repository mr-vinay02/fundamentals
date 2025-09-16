package scenariobasedproblems;

public class OddDigitReverser {

    static int oddDigitReverser(int number)
    {
        int reversed = 0;

        while(number != 0)
        {
            int digit = number % 10;
            if(digit % 2 != 0)
                reversed = reversed * 10 + digit;
            number/=10;
        }
        return reversed;
    }
    public static void main(String[] args) {

        int number = 123456789;
        int reversed = oddDigitReverser(number);
        System.out.println(reversed);
    }
}
