//write one java program which shows the diffrence between Statement and PreparedStatement
package com.jdbc;

import java.sql.*;
import java.util.Scanner;

public class StatementVsPreparedStatement {
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

            // Create a Statement object
            Statement statement = connection.createStatement();

            // Use Statement to execute an SQL query (unsafe - susceptible to SQL injection)
            String unsafeSqlQuery = "SELECT * FROM products WHERE id = " + getUserInput();
            ResultSet unsafeResultSet = statement.executeQuery(unsafeSqlQuery);

            System.out.println("Results using Statement (unsafe):");
            printResultSet(unsafeResultSet);

            // Create a PreparedStatement object
            String safeSqlQuery = "SELECT * FROM products WHERE id = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(safeSqlQuery);

            // Set parameter value in PreparedStatement
            preparedStatement.setInt(1, Integer.parseInt(getUserInput()));

            // Use PreparedStatement to execute an SQL query (safe - prevents SQL injection)
            ResultSet safeResultSet = preparedStatement.executeQuery();

            System.out.println("\nResults using PreparedStatement (safe):");
            printResultSet(safeResultSet);

            // Close resources
            unsafeResultSet.close();
            safeResultSet.close();
            statement.close();
            preparedStatement.close();
            connection.close();
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }

    // Helper method to get user input
    private static String getUserInput() {
        System.out.print("Enter product ID: ");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    // Helper method to print ResultSet
    private static void printResultSet(ResultSet resultSet) throws SQLException {
        while (resultSet.next()) {
            int id = resultSet.getInt("id");
            double price = resultSet.getDouble("price");
            System.out.println("ID: " + id + ",  Price: " + price);
        }
    }
}
