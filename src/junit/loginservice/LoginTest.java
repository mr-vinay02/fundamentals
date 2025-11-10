package junit.loginservice;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LoginTest {

    @Test
    void test(){
        Login login = new Login();
        boolean result = login.login("admin" , "admin@123");
        Assertions.assertTrue(result , "login Successfully....");
    }
}
