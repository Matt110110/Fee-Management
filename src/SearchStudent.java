import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;

@WebServlet(name = "SearchStudent", urlPatterns = {"/SearchStudent"})
public class SearchStudent extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int roll = Integer.parseInt(request.getParameter("roll"));
        Student s = new Student();
        s.setRollno(roll);
        try {
            s = DBUser.searchStudent(s);

            // TODO : Remove debugging code and add proper code for printing Student details to the screen.
            System.out.println(s.getRollno() + s.getName() + s.getEmail() + s.getSex() + s.getCourse() + s.getFee() + s.getPaid() + s.getDue() + s.getAddress() + s.getContact());
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
