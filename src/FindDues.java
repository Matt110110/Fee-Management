import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

@WebServlet(name = "FindDues", urlPatterns = {"/FindDues"})
public class FindDues extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int roll = 0;
        if (request.getParameter("roll").equals("")) {
            response.sendRedirect("invalidRoll.html");
        } else {
            roll = Integer.parseInt(request.getParameter("roll"));
            Student s = new Student();
            s.setRollno(roll);
            try {
                s = DBUser.getDues(s);
            } catch (SQLException | ClassNotFoundException e) {
                e.printStackTrace();
            }
            PrintWriter out = response.getWriter();
            // TODO : Add a proper page with footers and headers
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Records</title>");
            out.println("<link rel=\"stylesheet\" type=\"text/css\" href=\"vendor/bootstrap/css/bootstrap.min.css\">");
            out.println("<body>");
            out.println("<div class='container'>");
            out.println("<center>");
            out.println("<h1>Student details :</h1>");
            out.println("<p>Roll no. : " +s.getRollno()+ "</p>");
            out.println("<p>Name : " +s.getName()+ "</p>");
            out.println("<p>Course : "+s.getCourse()+"</p>");
            out.println("<p>Due : "+s.getDue()+"</p>");
            out.println("<a href='UserMain.html'><button class='btn-primary btn-lg btn-success'>Back</button></a>");
            out.println("</center>");
            out.println("</div>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
