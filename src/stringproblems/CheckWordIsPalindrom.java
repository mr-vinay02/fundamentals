package stringproblems;

public class CheckWordIsPalindrom {

    static boolean isPalindrome(String word)
    {
        String reversed = new StringBuilder(word).reverse().toString();
        return reversed.equals(word);
    }

    public static void main(String[] args) {

        String word = "madam";
        boolean result = isPalindrome(word);

        System.out.println(result ? "Word is Palindrome " : "Word is not Palindrome");
    }
}
