import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

// A simple servlet example
public class HelloServlet extends HttpServlet {

    // Handles GET request
    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        // Set content type
        response.setContentType("text/html");

        // Get the output writer
        PrintWriter out = response.getWriter();

        // Write response
        out.println("<html><body>");
        out.println("<h1>Hello from HelloServlet!</h1>");
        out.println("<p>This is a simple servlet example.</p>");
        out.println("</body></html>");
    }

    // Handles POST request (optional)
    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doGet(request, response);
    }
}
