package jdbc;
import java.sql.*;

public class MySQLConnection {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {

//        1. load and Register the Driver
        Class.forName("com.mysql.cj.jdbc.Driver");

//        requires
        String url = "jdbc:mysql://localhost:3306/mytrainee";
        String userName = "root";
        String password = "VINAY@2002";

//        2.Establish the connection
        Connection con = DriverManager.getConnection(url,userName, password);

//        3.create statement
        Statement smt = con.createStatement();
        String query = "select * from books";

//        4. execute statement

        ResultSet rs = smt.executeQuery(query);

        while (rs.next()) {
            int id = rs.getInt("book_id");
            String name = rs.getString("title");
            int price = rs.getInt("publication_year");
            System.out.println(id + " | " + name + " | " + price);
        }

//        5. close connection

        con.close();
    }
}
