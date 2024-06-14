/*Servlet Question: User Login
Implement a servlet-based user login system. Create a servlet that handles user authentication. Design a simple HTML form 
with fields for username and password. Validate the user credentials against hardcoded values (e.g., username = "admin",
password = "password"). Display a welcome message if login is successful using a JSP page.
*/
package com.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.RequestDispatcher;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        // Hardcoded credentials
        if ("admin".equals(username) && "password".equals(password)) {
            // Forward to welcome page if login is successful
            RequestDispatcher dispatcher = request.getRequestDispatcher("Welcome.jsp");
            dispatcher.forward(request, response);
        } else {
            // Set error message and forward back to login page
            request.setAttribute("errorMessage", "Invalid username or password");
            RequestDispatcher dispatcher = request.getRequestDispatcher("login.html");
            dispatcher.forward(request, response);
        }
    }
}
