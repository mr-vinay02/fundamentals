package arrayproblems;

import java.util.Scanner;

public class ArrayInitializationAndDisplay {

    static int[] inputByUser()
    {
        Scanner scan = new Scanner(System.in);

        System.out.println("enter the How many values do you want to store");
        int lengthOFArray = scan.nextInt();

        int[] array = new  int[lengthOFArray];

        for (int i = 0; i < array.length; i++) {

            System.out.println("Enter the "+(i+1)+"th value of the Array :");
            array[i] = scan.nextInt();

        }
        return array;
    }
    public static void main(String[] args) {

        int[] array = inputByUser();

        System.out.println("Array values entered by the User :");

        for(int element : array){
            System.out.print(element+ "  ");
        }


    }
}
