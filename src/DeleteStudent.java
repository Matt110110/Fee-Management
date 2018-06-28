import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

@WebServlet(name = "DeleteStudent", urlPatterns = {"/DeleteStudent"})
public class DeleteStudent extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int roll;
        if (request.getParameter("roll").equals("")) {
            response.sendRedirect("invalidRoll.html");
        } else {
            roll = Integer.parseInt(request.getParameter("roll"));
            Student s = new Student();
            s.setRollno(roll);
            try {
                if (DBUser.deleteStudent(s) == 1) {
                    // TODO : Create a proper page for this
                    PrintWriter out = response.getWriter();
                    out.println("<html>");
                    out.println("<head>");
                    out.println("<title>Deleted</title>");
                    out.println("<link rel=\"stylesheet\" type=\"text/css\" href=\"vendor/bootstrap/css/bootstrap.min.css\">");
                    out.println("</head>");
                    out.println("<body class='container'>");
                    out.println("<center>");
                    out.println("<h1 class='alert-success'>Record successfully removed from the DataBase.</h1>");
                    out.println("<a href='UserMain.html'><button class='btn-success btn-lg'>Return...</button></a>");
                    out.println("</center>");
                    out.println("</body>");
                    out.println("</html>");
                } else {
                    response.sendRedirect("invalidRoll.html");
                }
            } catch (SQLException | ClassNotFoundException e) {
                e.printStackTrace();
            }
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
