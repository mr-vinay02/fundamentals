package logicalproblems;

public class ReverableNumberGivesOdd {

    static boolean isReversalNumber(int number)
    {
        int tempNumber = number;
        int reverse = 0;

        while(number != 0)
        {
            reverse = reverse * 10 + number % 10;
            number /= 10;
        }


        int reservableNumber = tempNumber + reverse ;

        while(reservableNumber != 0)
        {
            int digit = reservableNumber % 10;
            if(digit % 2 == 0)
                return false;
            reservableNumber = reservableNumber / 10;
        }

        return true;

    }


    public static void main(String[] args) {

        int number = 36;

        boolean isReversable = isReversalNumber(number);

        System.out.println(isReversable);
    }
}
