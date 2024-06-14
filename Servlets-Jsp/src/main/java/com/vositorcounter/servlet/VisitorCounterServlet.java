/*Servlet Question: Visitor Counter
Develop a servlet to count and display the number of times a web page has been visited. Use a static variable to maintain the
count across servlet instances. Display the visitor count on a JSP page and increment it each time the page is accessed.
*/
package com.vositorcounter.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.RequestDispatcher;

@WebServlet("/VisitorCounterServlet")
public class VisitorCounterServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
    
    // Static variable to hold the count of visitors
    private static int visitorCount = 0;

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Increment the visitor count
        visitorCount++;
        
        // Set the visitor count as a request attribute
        request.setAttribute("visitorCount", visitorCount);
        
        // Forward the request to the JSP page
        RequestDispatcher dispatcher = request.getRequestDispatcher("VisitorCounter.jsp");
        dispatcher.forward(request, response);
    }
}
