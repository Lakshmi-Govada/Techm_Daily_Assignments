/*Servlet and JSP Question: Student Information
Design a servlet-based application to manage student information. Create a servlet that stores student details (e.g., name,
age, grade) in a JavaBean or a collection. Display a form using a JSP page to input student information. After submission,
display the entered student details on another JSP page.*/
package com.techm.servlet;


import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.techm.bean.Student;

import javax.servlet.RequestDispatcher;

@WebServlet("/StudentServlet")
public class StudentServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
    private List<Student> studentList = new ArrayList<>();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("name");
        int age = Integer.parseInt(request.getParameter("age"));
        String grade = request.getParameter("grade");

        Student student = new Student(name, age, grade);
        studentList.add(student);

        request.setAttribute("studentList", studentList);
        RequestDispatcher dispatcher = request.getRequestDispatcher("displaystudent.jsp");
        dispatcher.forward(request, response);
    }
}
