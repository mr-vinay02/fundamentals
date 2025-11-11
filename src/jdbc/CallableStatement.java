package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

//DELIMITER $$
//
//CREATE PROCEDURE addBook(IN bid INT, IN btitle VARCHAR(100), IN bprice DOUBLE)
//BEGIN
//INSERT INTO books (id, title, price) VALUES (bid, btitle, bprice);
//END
//
//$$DELIMITER ;


public class CallableStatement {


    public static void main(String[] args) {
        Connection con = null;

        try {
            // 1️.Load Driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // 2️. Connect to Database
            con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/mytrainee", "root", "VINAY@2002");

            // 3️. Prepare Callable Statement
            java.sql.CallableStatement cs = con.prepareCall("{call addBook(?, ?, ?)}");

            // 4️. Set Parameters
            cs.setInt(1, 4);
            cs.setString(2, "JDBC Complete Guide");
            cs.setDouble(3, 599.99);

            // 5️. Execute
            cs.execute();

            System.out.println("Book inserted successfully using stored procedure!");

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (con != null) con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

}
