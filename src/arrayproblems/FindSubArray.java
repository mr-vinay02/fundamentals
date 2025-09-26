package arrayproblems;

public class FindSubArray {
    public static void main(String[] args) {

        int[] numbers = {-1,10,4,-5,-8,9,-2,-4,5,3};

        int target = 0;

        for (int i = 0; i < numbers.length; i++) {
            int sum = 0;
            for (int j = i ; j < numbers.length; j++) {
                sum += numbers[j];

                if (sum == target) {
                    System.out.print("Sub Array :");
                    for (int k = i; k <= j; k++) {
                        System.out.print(numbers[k] + " ");
                    }
                    System.out.println();
                }
            }
        }
    }
}
