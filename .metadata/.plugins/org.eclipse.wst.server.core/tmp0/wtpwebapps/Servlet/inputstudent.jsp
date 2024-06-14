<!DOCTYPE html>
<html>
<head>
    <title>Student Information</title>
</head>
<body>
    <h2>Enter Student Information</h2>
    <form action="StudentServlet" method="post">
        <label for="name">Name:</label>
        <input type="text" id="name" name="name" required><br><br>
        <label for="age">Age:</label>
        <input type="number" id="age" name="age" required><br><br>
        <label for="grade">Grade:</label>
        <input type="text" id="grade" name="grade" required><br><br>
        <input type="submit" value="Submit">
    </form>
</body>
</html>
