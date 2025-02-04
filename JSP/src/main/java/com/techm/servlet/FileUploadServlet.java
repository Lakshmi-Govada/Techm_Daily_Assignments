/*Servlet Question: File Upload
Implement a servlet-based file upload functionality. Create a servlet that handles file uploads from a HTML form. 
Allow users to select a file and upload it to the server. Display a confirmation message on successful upload using a JSP page.

*/
package com.techm.servlet;


import java.io.File;
import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.tomcat.util.http.fileupload.FileItem;
import org.apache.tomcat.util.http.fileupload.RequestContext;
import org.apache.tomcat.util.http.fileupload.disk.DiskFileItemFactory;
import org.apache.tomcat.util.http.fileupload.servlet.ServletFileUpload;

@WebServlet("/FileUploadServlet")
@MultipartConfig
public class FileUploadServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    // Location to store uploaded files
    private static final String UPLOAD_DIRECTORY = "uploads";

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Check if the request actually contains a file upload
        if (!ServletFileUpload.isMultipartContent(request)) {
            // If not, we stop here
            response.getWriter().println("Error: Form must have enctype=multipart/form-data.");
            response.getWriter().flush();
            return;
        }

        // Configures upload settings
        DiskFileItemFactory factory = new DiskFileItemFactory();
        // Set memory threshold - beyond which files are stored in disk
        factory.setSizeThreshold(DiskFileItemFactory.DEFAULT_SIZE_THRESHOLD);
        // Set temporary directory to store files
        factory.setRepository(new File(System.getProperty("java.io.tmpdir")));

        ServletFileUpload upload = new ServletFileUpload(factory);
        // Set maximum file size
        upload.setFileSizeMax(1024 * 1024 * 10); // 10MB
        // Set maximum request size (include file + form data)
        upload.setSizeMax(1024 * 1024 * 50); // 50MB

        // Constructs the directory path to store upload file
        String uploadPath = getServletContext().getRealPath("") + File.separator + UPLOAD_DIRECTORY;

        // Create the directory if it does not exist
        File uploadDir = new File(uploadPath);
        if (!uploadDir.exists()) {
            uploadDir.mkdir();
        }

        try {
            // Parse the request's content to extract file data
            List<FileItem> formItems = upload.parseRequest((RequestContext) request);

            if (formItems != null && formItems.size() > 0) {
                // Iterates over form's fields
                for (FileItem item : formItems) {
                    // Processes only fields that are not form fields
                    if (!item.isFormField()) {
                        String fileName = new File(item.getName()).getName();
                        String filePath = uploadPath + File.separator + fileName;
                        File storeFile = new File(filePath);

                        // Save the file on disk
                        item.write(storeFile);
                        request.setAttribute("message", "File " + fileName + " has been uploaded successfully!");
                    }
                }
            }
        } catch (Exception ex) {
            request.setAttribute("message", "There was an error: " + ex.getMessage());
        }

        // Forward to JSP page to display the message
        getServletContext().getRequestDispatcher("/uploadResult.jsp").forward(request, response);
    }
}
