package logicalproblems;

public class EmailValidator {

    static boolean isEmailValidate(String email)
    {
        //      Check exactly one character '@'
        if(email.indexOf('@') == -1 && email.indexOf('@') != email.lastIndexOf('@'))
            return false;


        String localPart = email.substring(0,email.indexOf('@'));
        String domainPart = email.substring(email.indexOf('@'),email.length()-1);

        //        Check local name and domain name
        if(localPart.isEmpty() && domainPart.isEmpty())
            return false;

        //       Domain name must contain Atleast one '.'
        if(!domainPart.contains("."))
            return false;

        //   domain name should strats and ends with '.'
        if(domainPart.startsWith(".") && domainPart.endsWith("."))
            return false;



        return true;

    }
    public static void main(String[] args) {

        String inputEmail = "vinayvini4630@gmail.com";

        boolean valid = isEmailValidate(inputEmail);

        System.out.println(valid ? "It is a valid Email Id " : "It is not a Valid Email ID");

    }
}
