package arrayproblems;

public class CountingEvenAndOdd {
    public static void main(String[] args) {

        int[] array = {10,15,20,25,30,35,40,45,50,55};

        int evenCount = 0,evenSum = 0;
        int oddCount = 0,oddSum =0;

        for(int element : array)
        {
            if(element % 2 == 0)
            {
                evenCount++;
                evenSum += element;
            }
            else {
                oddCount++;
                oddSum += element;
            }
        }
        System.out.println("Number of the Even count is :"+evenCount);
        System.out.println("Number of the odd count is :"+oddCount);
        System.out.println("Number of the Even sum is :"+evenSum);
        System.out.println("Number of the odd sum is :"+oddSum);
    }
}
