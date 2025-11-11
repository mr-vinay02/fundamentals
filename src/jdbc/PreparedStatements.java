package jdbc;

import java.sql.*;
import java.util.Scanner;

public class PreparedStatements {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Connection con = null;

        try {
            // 1️⃣ Load the Driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // 2️⃣ Establish Connection
            con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/mytrainee", "root", "VINAY@2002");

            // Menu
            System.out.println("------ BOOK DATABASE OPERATIONS ------");
            System.out.println("1. Insert\n2. Update\n3. Delete\n4. Display\nEnter your choice:");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    // INSERT
                    String insertSQL = "INSERT INTO books (id, title, price) VALUES (?, ?, ?)";
                    PreparedStatement psInsert = con.prepareStatement(insertSQL);
                    System.out.print("Enter Book ID: ");
                    int id = sc.nextInt();
                    System.out.print("Enter Title: ");
                    sc.nextLine(); // consume leftover newline
                    String title = sc.nextLine();
                    System.out.print("Enter Price: ");
                    double price = sc.nextDouble();

                    psInsert.setInt(1, id);
                    psInsert.setString(2, title);
                    psInsert.setDouble(3, price);

                    int rowsInserted = psInsert.executeUpdate();
                    System.out.println(rowsInserted + " record(s) inserted successfully!");
                    break;

                case 2:
                    // UPDATE
                    String updateSQL = "UPDATE books SET price = ? WHERE id = ?";
                    PreparedStatement psUpdate = con.prepareStatement(updateSQL);
                    System.out.print("Enter Book ID to Update: ");
                    int uid = sc.nextInt();
                    System.out.print("Enter New Price: ");
                    double newPrice = sc.nextDouble();

                    psUpdate.setDouble(1, newPrice);
                    psUpdate.setInt(2, uid);

                    int rowsUpdated = psUpdate.executeUpdate();
                    System.out.println(rowsUpdated + " record(s) updated successfully!");
                    break;

                case 3:
                    // DELETE
                    String deleteSQL = "DELETE FROM books WHERE id = ?";
                    PreparedStatement psDelete = con.prepareStatement(deleteSQL);
                    System.out.print("Enter Book ID to Delete: ");
                    int did = sc.nextInt();

                    psDelete.setInt(1, did);
                    int rowsDeleted = psDelete.executeUpdate();
                    System.out.println(rowsDeleted + " record(s) deleted successfully!");
                    break;

                case 4:
                    // DISPLAY
                    String selectSQL = "SELECT * FROM books";
                    PreparedStatement psSelect = con.prepareStatement(selectSQL);
                    ResultSet rs = psSelect.executeQuery();
                    System.out.println("\n--- BOOK LIST ---");
                    while (rs.next()) {
                        System.out.println(rs.getInt("id") + " | " +
                                rs.getString("title") + " | " + rs.getDouble("price"));
                    }
                    break;

                default:
                    System.out.println(" Invalid choice!");
            }

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
