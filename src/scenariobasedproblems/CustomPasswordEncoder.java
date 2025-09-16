package scenariobasedproblems;

public class CustomPasswordEncoder {

    static String makeMeEncoded(String password)
    {
        StringBuilder EncodedPassword = new StringBuilder();

        String vowels = "aeiou";

        for(char ch : password.toCharArray())
        {
            if(Character.isDigit(ch)){
                if(((int)(ch) % 2 == 0))
                    EncodedPassword.append('*');
                else
                    EncodedPassword.append(ch);
            }
            else if(Character.isAlphabetic(ch) ) {
                if(vowels.indexOf(ch) != -1)
                    EncodedPassword.append('@');
                else
                    EncodedPassword.append(Character.toLowerCase(ch));
            }

        }

        return EncodedPassword.toString();
    }
    public static void main(String[] args) {

        String password = "Java1234";

        String EncodedPassword = makeMeEncoded(password);
        System.out.println(EncodedPassword);
    }
}
