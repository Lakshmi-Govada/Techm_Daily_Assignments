package com.jdbc;

import java.sql.*;
import java.util.Scanner;

public class InsertStudent {
    public static void main(String[] args) {
        // JDBC URL, username, and password
        String jdbcUrl = "jdbc:oracle:thin:@localhost:1521:xe";
        String username = "system";
        String password = "system";

        try {
            // Establish connection to the database
            Connection connection = DriverManager.getConnection(jdbcUrl, username, password);

            // Prompt the user to enter student details
            System.out.println("Enter student details:");
            int id = Integer.parseInt(promptUser("stid"));
            String name = promptUser("stname");

            // SQL query to insert a new record into the students table
            String sqlQuery = "INSERT INTO student (stid, stname) VALUES (?, ?)";

            // Create a prepared statement for the SQL query
            PreparedStatement preparedStatement = connection.prepareStatement(sqlQuery);
            preparedStatement.setInt(1, id);
            preparedStatement.setString(2, name);

            // Execute the prepared statement to insert the new record
            int rowsAffected = preparedStatement.executeUpdate();

            // Check if the insertion was successful
            if (rowsAffected > 0) {
                System.out.println("Student record inserted successfully.");
            } else {
                System.out.println("Failed to insert student record.");
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
