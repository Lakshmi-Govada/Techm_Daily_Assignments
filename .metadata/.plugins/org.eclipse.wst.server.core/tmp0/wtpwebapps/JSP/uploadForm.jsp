<!DOCTYPE html>
<html>
<head>
    <title>File Upload</title>
</head>
<body>
    <h2>File Upload Form</h2>
    <form action="FileUploadServlet" method="post" enctype="multipart/form-data">
        <label for="file">Select file:</label>
        <input type="file" id="file" name="file" required>
        <br><br>
        <input type="submit" value="Upload">
    </form>
</body>
</html>
