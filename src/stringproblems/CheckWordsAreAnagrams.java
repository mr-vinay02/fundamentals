package stringproblems;

import java.util.Arrays;

public class CheckWordsAreAnagrams {
    static boolean wordsAreAnagrams(String word1,String word2)
    {

        //    Replace if any space is availabale
        word1.replace(" ","");
        word2.replace(" ","");

        // Chechk if the length of the two String are same or not
        if(word1.length() != word2.length())
            return false;

        // convert it into character array
        char[]  array1 = word1.toCharArray();
        char[]  array2 = word2.toCharArray();

        Arrays.sort(array1);
        Arrays.sort(array2);

        return Arrays.equals(array1,array2);

    }

    public static void main(String[] args) {
        String word1 = "listen";
        String word2 = "silten";

        boolean result  = wordsAreAnagrams(word1,word2);

        System.out.println(result ? "Words are Anagrams" : "Words are not Anagrams");

    }
}
