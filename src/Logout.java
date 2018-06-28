import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "Logout", urlPatterns = {"/LogoutUser","/LogoutAdmin"})
public class Logout extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // TODO : Create a proper page for this
        PrintWriter out = response.getWriter();
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Deleted</title>");
        out.println("<link rel=\"stylesheet\" type=\"text/css\" href=\"vendor/bootstrap/css/bootstrap.min.css\">");
        out.println("</head>");
        out.println("<body class='container'>");
        out.println("<center>");
        out.println("<h1 class='alert-success'>Successfully logged out.</h1>");
        out.println("<a href='index.jsp'><button class='btn-success btn-lg'>Home</button></a>");
        out.println("</center>");
        out.println("</body>");
        out.println("</html>");
        HttpSession session = request.getSession();
        session.invalidate();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
