package arrayproblems.slidingwindow;

public class SumByK {
    public static void main(String[] args) {

        int[] numbers = {10,20,30,40,50,60,70,80};

        int k =3;

        int windowSum = 0;
        for (int i = 0; i < k; i++) {
            windowSum += numbers[i];
        }
        System.out.print(windowSum +"  ");

        for (int i = k; i < numbers.length; i++) {
            windowSum += numbers[i];
            windowSum -= numbers[i - k];
            System.out.print(windowSum +"  ");
        }

    }
}
