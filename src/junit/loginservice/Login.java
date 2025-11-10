package junit.loginservice;

public class Login {

    public String validUsername = "admin";
    public String validPassWord = "admin@123" ;

    public boolean login(String userName , String passWord){
        if(userName == null || passWord == null){
            throw new RuntimeException("userName and Password can't be Empty");
        }

        if(userName.equals(validUsername) && passWord.equals(validPassWord))
            return true;
        else
            return false;
    }
}
