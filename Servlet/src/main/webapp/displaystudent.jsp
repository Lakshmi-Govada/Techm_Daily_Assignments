<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="com.techm.bean.Student" %>
<%@ page import="java.util.List" %>
<!DOCTYPE html>
<html>
<head>
    <title>Student Details</title>
</head>
<body>
    <h2>Student Details</h2>
    <table border="1">
        <tr>
            <th>Name</th>
            <th>Age</th>
            <th>Grade</th>
        </tr>
        <%
            List<Student> studentList = (List<Student>) request.getAttribute("studentList");
            if (studentList != null) {
                for (Student student : studentList) {
                    %>
                    <tr>
                        <td><%= student.getName() %></td>
                        <td><%= student.getAge() %></td>
                        <td><%= student.getGrade() %></td>
                    </tr>
                    <%
                }
            }
        %>
    </table>
</body>
</html>
