package scenariobasedproblems;

public class VowelPuzzleChecker {
    public static boolean checkPuzzleWord(String word) {

        String vowel = "aeiou";
        if(vowel.indexOf(word.charAt(0)) == -1 || vowel.indexOf(word.charAt(word.length()-1)) == -1)
            return false;

        int count =0;
        for (int i = 1; i < word.length()-1; i++) {

            if(vowel.indexOf(word.charAt(i)) != -1)
                count++;

        }

        return count == 2 ? true : false;


    }

    public static void main(String[] args) {
        String input = "abide";
        boolean result = checkPuzzleWord(input);
        System.out.println(result ? " Valid " : " Not Valid ");  // Output: Valid
    }
}

