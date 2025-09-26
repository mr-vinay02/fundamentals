package arrayproblems.slidingwindow;

public class MaxByK {
    public static void main(String[] args) {

        int[] numbers = {50,6,9,45,18,10,45,78,12,45,4,4,97};

        int k =3;

        for (int i = 0; i < numbers.length - k +1; i++) {
            int max = 0;
            for (int j = i; j < k + i ; j++) {
                if(numbers[j] > max)
                    max = numbers[j];
            }
            System.out.println(max+" ");
        }
    }
}
