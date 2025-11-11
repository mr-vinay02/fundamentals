package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {

    public static Connection getConnection()  {

        try {

            Class.forName("com.mysql.cj.jdbc.Driver");

            String url = "jdbc:mysql://localhost:3306/mytrainee";
            String username = "root";
            String password = "VINAY@2002";

            Connection con = DriverManager.getConnection(url, username, password);

            return con;

        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
}
