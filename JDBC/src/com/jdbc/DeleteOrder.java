package com.jdbc;

import java.sql.*;
import java.util.Scanner;

public class DeleteOrder {
    public static void main(String[] args) {
        // JDBC URL, username, and password
        String jdbcUrl = "jdbc:oracle:thin:@localhost:1521:xe";
        String username = "system";
        String password = "system";

        try {
            // Establish connection to the database
            Connection connection = DriverManager.getConnection(jdbcUrl, username, password);

            // Prompt the user to enter order ID to delete
            int orderid = Integer.parseInt(promptUser("Enter Order ID to delete"));

            // SQL query to delete a record from the orders table
            String sqlQuery = "DELETE FROM orders WHERE orderid = ?";

            // Create a prepared statement for the SQL query
            PreparedStatement preparedStatement = connection.prepareStatement(sqlQuery);
            preparedStatement.setInt(1, orderid);

            // Execute the prepared statement to delete the order
            int rowsAffected = preparedStatement.executeUpdate();

            // Check if the deletion was successful
            if (rowsAffected > 0) {
                System.out.println("Order deleted successfully.");
            } else {
                System.out.println("Failed to delete order.");
            }

            // Close the prepared statement and connection
            preparedStatement.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Helper method to prompt the user for input
    private static String promptUser(String prompt) {
        System.out.print(prompt + ": ");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
}
