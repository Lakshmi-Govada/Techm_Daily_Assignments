/*Write a Java program to establish a connection to a MySQL database using JDBC. Retrieve and print the records
from a table named employees.*/
package com.jdbc;

import java.sql.*;

public class DbConnection {
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

            // SQL query to retrieve records from the employees table
            String sqlQuery = "SELECT * FROM employees";

            // Create a statement for executing SQL queries
            Statement statement = connection.createStatement();

            // Execute the SQL query and get the result set
            ResultSet resultSet = statement.executeQuery(sqlQuery);

            // Iterate through the result set and print the records
            while (resultSet.next()) {
                int id = resultSet.getInt("empid");
                String name = resultSet.getString("empname");

                System.out.println("ID: " + id + ", Name: " + name );
            }

            // Close the result set, statement, and connection
            resultSet.close();
            statement.close();
            connection.close();
        } catch (ClassNotFoundException e) {
            System.out.println("Oracle JDBC driver not found.");
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
