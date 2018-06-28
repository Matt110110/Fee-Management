import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

@WebServlet(name = "SearchStudent", urlPatterns = {"/SearchStudent"})
public class SearchStudent extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int roll;
        if (request.getParameter("roll").equals("")) {
            roll = 0;
        } else {
            roll = Integer.parseInt(request.getParameter("roll"));
        }

        Student s = new Student();
        s.setRollno(roll);
        try {
            s = DBUser.searchStudent(s);
            if (DBUser.isCorrectRoll(s)) {
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
                out.println("<p>Email : "+s.getEmail()+"</p>");
                out.println("<p>Sex : "+s.getSex()+"</p>");
                out.println("<p>Course : "+s.getCourse()+"</p>");
                out.println("<p>Fee : "+s.getFee()+"</p>");
                out.println("<p>Paid : "+s.getPaid()+"</p>");
                out.println("<p>Due : "+s.getDue()+"</p>");
                out.println("<p>Address : "+s.getAddress()+"</p>");
                out.println("<p>Contact : "+s.getContact()+"</p>");
                out.println("<a href='searchStudent.html'><button class='btn-primary btn-lg'>Back</button></a>");
                out.println("</center>");
                out.println("</div>");
                out.println("</body>");
                out.println("</html>");
            } else {
                // TODO : Create proper pages to redirect.
                response.sendRedirect("invalidRoll.html");
            }
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
