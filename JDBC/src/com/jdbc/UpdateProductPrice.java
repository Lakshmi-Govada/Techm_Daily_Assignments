/*Write a Java program to update an existing record in a table named products using JDBC. Prompt the user
to enter the product id and new price, and update the price of the product in the database.*/
package com.jdbc;

import java.sql.*;
import java.util.Scanner;

public class UpdateProductPrice {
    public static void main(String[] args) {
        // JDBC URL, username, and password
        String jdbcUrl = "jdbc:oracle:thin:@localhost:1521:xe";
        String username = "system";
        String password = "system";

        try {
            // Load Oracle JDBC driver
            Class.forName("oracle.jdbc.driver.OracleDriver");

            // Establish connection to the database
            Connection connection = DriverManager.getConnection(jdbcUrl, username, password);

            // Prompt the user to enter product ID and new price
            int id = Integer.parseInt(promptUser("Enter Product ID to update"));
            int price =Integer.parseInt(promptUser("Enter New Price"));

            // SQL query to update the price of a product in the products table
            String sqlQuery = "UPDATE products SET price = ? WHERE id = ?";

            // Create a prepared statement for the SQL query
            PreparedStatement preparedStatement = connection.prepareStatement(sqlQuery);
            preparedStatement.setInt(1, id);
            preparedStatement.setInt(2, price);

            // Execute the prepared statement to update the product price
            int rowsAffected = preparedStatement.executeUpdate();

            // Check if the update was successful
            if (rowsAffected > 0) {
                System.out.println("Product price updated successfully.");
            } else {
                System.out.println("Failed to update product price.");
            }

            // Close the prepared statement and connection
            preparedStatement.close();
            connection.close();
        } catch (ClassNotFoundException | SQLException e) {
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
