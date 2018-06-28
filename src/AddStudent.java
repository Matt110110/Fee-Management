import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

@WebServlet(name = "AddStudent", urlPatterns = {"/AddStudent"})
public class AddStudent extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        int roll = Integer.parseInt(request.getParameter("roll"));
        try {
            Student s = new Student(roll, request.getParameter("name"), request.getParameter("email"), request.getParameter("sex"), request.getParameter("course"), Integer.parseInt(request.getParameter("fee")), Integer.parseInt(request.getParameter("paid")), Integer.parseInt(request.getParameter("due")), request.getParameter("address"), request.getParameter("contact"));

            if (!DBUser.isCorrectRoll(s)) {
                if (DBUser.enterData(s) != 0) {
                    response.sendRedirect("UserMain.html");
                }
            } else {
                // TODO : Create proper pages to redirect.
                PrintWriter out = response.getWriter();
                out.println("<html>");
                out.println("<body bgcolor='red'>");
                out.println("<center>");
                out.println("<h1>The data could not be entered. A person with the same roll number already exists.</h1>");
                out.println("<a href='UserMain.html'><button class='btn-primary btn-lg btn-block'>Return...</button></a>");
                out.println("</center>");
                out.println("</body>");
                out.println("</html>");
            }
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
