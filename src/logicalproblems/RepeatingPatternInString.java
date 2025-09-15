package logicalproblems;

public class RepeatingPatternInString {
    static  String findSmallestPattern(String input)
    {
        String pattern = new String();
        for(char character : input.toCharArray())
        {
            if(pattern.indexOf(character) == -1)
            {
                pattern = pattern+character ;
            }
        }
        return pattern.toString();
    }
    public static void main(String[] args) {

        String input = "abcabcabc";
        String smallestRepeatingPattern = findSmallestPattern(input);
        System.out.println(smallestRepeatingPattern);
    }

}
