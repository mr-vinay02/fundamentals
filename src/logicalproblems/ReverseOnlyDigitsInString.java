package logicalproblems;

public class ReverseOnlyDigitsInString {

    static  String reversedOnlyDigits(String input)
    {
        char[] characterArray= input.toCharArray();

        int start = 0;
        int end = characterArray.length-1;

        while(start < end)
        {
            while(start < end && !Character.isDigit(characterArray[start])){
                start++;
            }
            while(start < end && !Character.isDigit(characterArray[end]) ){
                end--;
            }

            if(start < end ) {
                char temp = characterArray[start];
                characterArray[start] = characterArray[end];
                characterArray[end] = temp;
            }
            start++;
            end--;

        }
        return String.copyValueOf(characterArray);
    }



    public static void main(String[] args) {
        String input = "a1b2c3d4";
        String reversed = reversedOnlyDigits(input);
        System.out.println(reversed);
    }


}
