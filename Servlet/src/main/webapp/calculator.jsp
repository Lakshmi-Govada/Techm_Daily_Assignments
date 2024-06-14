<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>Simple Calculator</title>
</head>
<body>
    <h2>Simple Calculator</h2>
    <form method="post" action="calculator.jsp">
        <label for="num1">Number 1:</label>
        <input type="text" id="num1" name="num1" required>
        <br><br>
        <label for="num2">Number 2:</label>
        <input type="text" id="num2" name="num2" required>
        <br><br>
        <label for="operation">Operation:</label>
        <select id="operation" name="operation" required>
            <option value="add">Addition</option>
            <option value="subtract">Subtraction</option>
            <option value="multiply">Multiplication</option>
            <option value="divide">Division</option>
        </select>
        <br><br>
        <input type="submit" value="Calculate">
    </form>

    <%
        // Retrieve input values
        String num1 = request.getParameter("num1");
        String num2 = request.getParameter("num2");
        String operation = request.getParameter("operation");
        double result = 0;
        boolean validInput = true;

        if (num1 != null && num2 != null && operation != null) {
            try {
                double number1 = Double.parseDouble(num1);
                double number2 = Double.parseDouble(num2);

                switch (operation) {
                    case "add":
                        result = number1 + number2;
                        break;
                    case "subtract":
                        result = number1 - number2;
                        break;
                    case "multiply":
                        result = number1 * number2;
                        break;
                    case "divide":
                        if (number2 != 0) {
                            result = number1 / number2;
                        } else {
                            validInput = false;
                            out.println("<p style='color:red;'>Error: Division by zero is not allowed.</p>");
                        }
                        break;
                    default:
                        validInput = false;
                        out.println("<p style='color:red;'>Error: Invalid operation selected.</p>");
                        break;
                }

                if (validInput) {
                    out.println("<h3>Result: " + result + "</h3>");
                }
            } catch (NumberFormatException e) {
                out.println("<p style='color:red;'>Error: Please enter valid numbers.</p>");
            }
        }
    %>
</body>
</html>
