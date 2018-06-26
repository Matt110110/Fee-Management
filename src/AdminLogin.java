import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/AdminLogin")
public class AdminLogin extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String uname = request.getParameter("uid");
        String pass = request.getParameter("pass");
        try {
            if (DBAdmin.verify(uname, pass)) {
                response.sendRedirect("AdminMain.html");
            } else {
                PrintWriter out = response.getWriter();
                out.println("<html><body bgcolor='red'>");
                out.println("<center>");
                out.println("<h1>The entered username or password is wrong. Please verify your username or password.</h1>");
                out.println("<a href='loginAdmin.html'><button class='btn-primary btn-lg btn-block'>Return...</button></a>");
                out.println("</center>");
                out.println("</body></html>");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
