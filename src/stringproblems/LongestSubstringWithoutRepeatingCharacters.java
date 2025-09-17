package stringproblems;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithoutRepeatingCharacters {
    public static void main(String[] args) {

        String word = "abcabcaa";

        StringBuilder uniqic = new StringBuilder();

        for(char ch : word.toCharArray())
        {
            if(uniqic.toString().indexOf(ch) != -1 )
                continue;

            uniqic.append(ch);
        }
        System.out.println(uniqic);


    }
}
