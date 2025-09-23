package collection.arraylist;
import java.util.*;

public class CheckForPalindrome {
    public static void main(String[] args) {
        List<Character> list = new ArrayList<>(Arrays.asList('r','a','d','a','r'));

        boolean isPalindrome = true;
        int low = 0, high = list.size() - 1;

        while (low < high) {
            if (!list.get(low).equals(list.get(high))) {
                isPalindrome = false;
                break;
            }
            low++;
            high--;
        }

        if (isPalindrome) {
            System.out.println("The list forms a Palindrome");
        } else {
            System.out.println("The list does not form a Palindrome");
        }
    }
}
